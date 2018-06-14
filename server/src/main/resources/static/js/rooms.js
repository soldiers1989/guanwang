var currentJS = {
    loaded: function () {
        // side
        var J_side = $('.J_side');
        var sideTop = J_side.offset().top;
        $(window).bind('scroll resize', function () {
            if ($(document).scrollTop() >= sideTop) {
                J_side.css({
                    position: 'fixed',
                    top: 0,
                    left: $(window).width() / 2 + 310
                });
            } else {
                J_side.css({
                    position: 'relative',
                    top: 'auto',
                    left: 'auto'
                });
            }
        });
    }
}
$(function () {
    currentJS.loaded();
    $('.J_preview').ms_preview();
    // 切换线路
    $('.actionWrap .lineSearch ul').on('click', 'li', function () {
        if (!$(this).find('i').hasClass('checked')) {
            $('.actionWrap .lineSearch ul li i').removeClass('checked');
            $(this).find('i').addClass('checked');
        }
    });

    // $('li.empty i.goto').click(function () {
    //     location.href = '/room/' + $(this).attr('data');
    // });

    $(".mapWrap li").click(function () {
        $(".mapWrap li").removeClass("current");
        $(this).addClass("current");
        $(".map").removeClass("dn");
        if ($(this).index() == 1) {
            $("#map").addClass("dn");
        } else {
            $("#allMap").addClass("dn");
        }
    });
    //全景图
    var panorama = new BMap.Panorama('allMap');
    panorama.setPosition(new BMap.Point(n_lng, n_lat));

    // 初始化地图
    window.markerArry = [];
    window.map = new BMap.Map('map', {
        enableMapClick: false,
        minZoom: 10
    });
    var centerpoint = new BMap.Point(n_lng, n_lat);
    window.map.centerAndZoom(centerpoint, 17);
    window.map.disableScrollWheelZoom();
    var marker = new BMapLib.RichMarker("<label class='mapIcon'></label>", new BMap.Point(n_lng, n_lat));
    window.map.addOverlay(marker);
    $(".mapIcon").parent().css({
        background: "none"
    });
    var left = n_name.length * 14 / 2 - 16;
    var opts = {
        position: centerpoint, // 指定文本标注所在的地理位置
        offset: new BMap.Size(-left, -24) // 设置文本偏移量

    };
    var label = new BMap.Label(n_name, opts); // 创建文本标注对象

    label.setStyle({
        color: "#49bff5",
        fontSize: "14px",
        height: "20px",
        border: "0",
        lineHeight: "20px",
        fontFamily: "黑体"

    });

    label.disableMassClear();
    window.map.addOverlay(label);
    //附近设施获取
    $('.actionWrap ul.action').on('click', 'li', function () {
        if (!$(this).find('i').hasClass('checked')) {
            $('.actionWrap ul.action li').removeClass('current');
            $('.actionWrap ul.action li i').removeClass('checked');
            $(this).addClass('current').find('i').addClass('checked');
        }
        $(".BMap_pop,.BMap_shadow").hide();
        $.each(window.markerArry, function (i, value) {
            map.removeOverlay(value); //清除覆盖物
        })
        if (!$(this).hasClass("default")) {
            var query = $(this).find("span").attr("data-query");
            getLocations(window.map, query);

        } else {
            window.map.centerAndZoom(centerpoint, 16);
        }
    });

    function getLocations(map, query, callback) {

        $.ajax({
            type: "GET",
            url: "http://api.map.baidu.com/place/v2/search",
            dataType: "jsonp",
            data: {
                "query": query,
                "location": n_lat + "," + n_lng,
                "radius": 1500,
                "page_size": 20,
                "output": "json",
                "scope": 2,
                "ak": baiduKey
            },
            success: function (r, status, xhr) {
                if (r.message == "ok") {
                    var opts = {
                        width: 120, // 信息窗口宽度
                        height: 70, // 信息窗口高度
                        enableMessage: true //设置允许信息窗发送短息
                    };
                    $.each(r.results, function (i, value) {
                        var html = "";
                        var marker = new BMapLib.RichMarker("<label class='mapIcon0'></label>", new BMap.Point(value.location.lng, value.location.lat));
                        window.markerArry.push(marker);
                        var content = "<p style='color:#40c2ff;font-size:14px;font-weight:bold;margin-bottom:2px;'>" + value.name + "</p>" + "<span style='color:#777778;font-size:12px;'>" + value.address + "</span>";
                        map.addOverlay(marker);
                        addClickHandler(content, marker); // 将标注添加到地图中

                    });
                    $(".mapIcon0").parent().css({
                        background: "none"
                    });

                    function addClickHandler(content, marker) {
                        marker.addEventListener("click", function (e) {
                            openInfo(content, e)
                        });
                    }

                    function openInfo(content, e) {
                        var p = e.target;
                        var point = new BMap.Point(p.getPosition().lng, p.getPosition().lat);
                        var infoWindow = new BMap.InfoWindow(content, opts); // 创建信息窗口对象
                        map.openInfoWindow(infoWindow, point); //开启信息窗口
                    }

                } else {
                    console.log("抱歉服务器错误！");
                }
            }
        })
    };

    //交通查询
    $("#searchBtn,.lineSearch ul li").click(function (e) {
        var destination = $("#searchInput").val();

        var dataType = $(e.target).attr("data-type");
        if (e.target.id === "searchBtn") {
            dataType = $(".lineSearch .checked").attr("data-type");
        }
        var routeList = "";
        if (destination != "") {
            //清除图层覆盖物
            map.clearOverlays();
            if (dataType == "transit") {

                var transit = new BMap.TransitRoute(map, {
                    renderOptions: {
                        map: window.map,
                        panel: "r-result"
                    }

                });
                routeList = transit.search(n_name, destination);

            } else if (dataType == "driving") {

                var driving = new BMap.DrivingRoute(map, {
                    renderOptions: {
                        map: map,
                        panel: "r-result",
                        autoViewport: true
                    }
                });
                routeList = driving.search(n_name, destination)

            } else {

                var walking = new BMap.WalkingRoute(map, {
                    renderOptions: {
                        map: window.map,
                        panel: "r-result",
                        autoViewport: true
                    }
                });
                routeList = walking.search(n_name, destination);
            }

            $("#r-result").removeClass("dn");
        }
        ;
    });
});
