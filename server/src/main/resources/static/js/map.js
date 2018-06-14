$(function() {
    window.areaArry = []; //区域字符数组
    window.metroArry = []; // 地铁字符数组
    $('li.city').each(function() {
        var id = $(this).attr('data-option');
        //查询所有区域
        var districts = JSON.parse($(this).attr('data-districts'));
        var _li = "";
        $.each(districts, function(i, value) {
            var _a = "";
            var _dl = "";
            $.each(value.towns, function(i, value) {

                $.each(value.list, function(i, value) {

                    _a = _a + '<a data-type=' + value.type + ' data-id=' + value.id + ' next-center=' + value.lng + ',' + value.lat + ' next-level=' + value.next_level + ' href="javascript:;">' + value.name + '</a>';

                });
                _dl = _dl + '<dl><dt>' + value.group + '</dt><dd>' + _a + '</dd></dl>';

                _a = "";

            });

            _li = _li + '<li class="cp"><strong data-type=' + value.type + ' data-id=' + value.id + ' next-center=' + value.lng + ',' + value.lat + ' next-level=' + value.next_level + '>' + value.name + '</strong><div class="sublist"><div class="item">' + _dl + '</div></div></div></li>';
        });
        window.areaArry[id] = _li;
        //查询所有区域所有地铁
        var metros = JSON.parse($(this).attr('data-metros'));
        var m_li = "";
        var metrosNum = metros.length;
        if (metrosNum < 10) {
            metrosNum = 10;
        }
        $.each(metros, function(i, value) {

            var _item = "";
            var total = value.stops.length;
            var len = Math.ceil(total / metrosNum);
            for (var l = 0; l < len; l++) {

                var _a = "";
                var num = ((l + 1) * metrosNum > total) ? total : ((l + 1) * metrosNum);
                for (var k = l * metrosNum; k < num; k++) {
                    _a = _a + '<dl><dt><i class="ico ico-metro"></i></dt><dd><a next-center=' + value.stops[k].lng + ',' + value.stops[k].lat + ' next-level=' + value.stops[k].next_level + ' href="javascript:;">' + value.stops[k].name + '</a></dd></dl>';
                }

                _item = _item + '<div class="item">' + _a + '</div>'

            }

            m_li = m_li + '<li><strong><i>' + value.line + '</i></strong><div class="sublist" style=height:' + metrosNum * 30 + 'px width:' + len * 140 + 'px >' + _item + '</div></div></li>';
        });
        window.metroArry[id] = m_li;

    });
    //初始化下拉列表
    $("#ul-searchMetro").html(window.metroArry[$(".searchCity span").attr("data-option")]);
    $("#u-searchArea").html(window.areaArry[$(".searchCity span").attr("data-option")]);
    var area_height=($("#u-searchArea li").length * 30>300)?($("#u-searchArea li").length*30):300;
    $("#u-searchArea li .sublist").css({"min-height": area_height+ "px"});
    //搜索页卡片高度
    var _height = $(window).height() - 360;
    $(".roomList").css({
        "max-height": _height + "px"
    });
    //地铁区域
    $.timeHover('.u-searchSelect', 'hover');
    $.hover('.u-searchSelect li');
    $.timeHover('.u-selectOther', 'u-hover');
    $('.sublist .item dd a').on('click', function() {
        $('.u-searchSelect').removeClass('hover');
    });
    $.timeHover('.u-dropdown');
    $(".switch").click(function() {
        $(".searchResults").toggle();
        var dom = $(this).find("span");

        if (dom.hasClass("down")) {

            dom.removeClass("down");
            dom.addClass("up");

        } else {

            dom.removeClass("up");
            dom.addClass("down");
        }

    });

    $.timeHover('.u-select');

    // checkbox
    $('.checkbox').on('click', function() {
        var child = $(this).find('.ico');
        if (child.hasClass('checked')) {
            child.removeClass('checked');
        } else {
            child.addClass('checked');
        }
    });

    //地图初始化
    var c_name = "上海";
    var c_id = 289;
    sdMap_jo.init(c_name, c_id);

});
//搜索地图=========================
//书写人：jo
var sdMap_jo = {

    overlayList: {}, //区域覆盖物数组
    clearOverlayList: [], //待清除覆盖物(范围)数组
    metroList: {}, //地铁覆盖物
    mobject: {
        "order": "price"
    },
    currentLevel: 11,

    //初始化地图
    init: function(c_name, c_id) {

        var _this = this;
        _this.mobject.c_name = c_name;
        _this.mobject.c_id = c_id;
        _this.mobject.level = 11;
        _this.map = new BMap.Map('map', {
            enableMapClick: false
        });

        _this.map.setMinZoom(11); // 设置地图允许的最小级别。取值不得小于地图类型所允许的最小级别。
        _this.map.setMaxZoom(16); // 设置地图允许的最大级别。取值不得大于地图类型所允许的最大级别。
        _this.map.enableScrollWheelZoom(); // 启用滚轮放大缩小，默认禁用。
        _this.map.disableDoubleClickZoom(); // 禁用双击放大。
        _this.map.centerAndZoom(_this.mobject.c_name, _this.mobject.level);

        // 添加dragend
        _this.map.addEventListener("dragend", function(e) {

            //_this.zoomf = true;
            _this.moveMap();

        });
        // 添加zoomend事件
        _this.map.addEventListener("zoomstart", function() {
            _this.zoomf = true;

        });

        _this.map.addEventListener("zoomend", function(e) {
            //if (_this.zoomf) {
            _this.getRange();
            _this.addAreaOverlay(_this.mobject);
            _this.removeOvelayList();
            _this.removeOvelayList(true);
            //}
        });
        _this.addAreaOverlay(_this.mobject)
        _this.filterTips();
    },

    moveMap: function(flag,tips) {
        var _this = this;
        _this.removeOvelayList(true);

        function dragMap() {
            _this.getRange();
            _this.addAreaOverlay(_this.mobject, true,tips);
            if (flag) {
                _this.removeOvelayList();
            }
        };

        setTimeout(dragMap, 200);
    },

    //更新边界点
    getRange: function() {

        this.mobject.level = this.map.getZoom();
        var bouds = this.map.getBounds();
        this.mobject.rigth = bouds.getNorthEast().lng;
        this.mobject.top = bouds.getNorthEast().lat;
        this.mobject.left = bouds.getSouthWest().lng;
        this.mobject.bottom = bouds.getSouthWest().lat;

    },
    initObject: function(name, id) {

        this.mobject.c_name = name;
        this.mobject.c_id = id;
        this.mobject.level = 11;
        this.mobject.type = "";
        this.mobject.id = "";
        this.mobject.price = ""; //价格
        this.mobject.floor = ""; //楼层
        this.mobject.key = ""; //关键字
        this.mobject.bedrooms = ""; //户型
        this.mobject.orientation = ""; //朝向
        this.mobject.style = ""; //风格
        this.mobject.entire = ""; //整租
        this.mobject.order = "price"; //整租
        $("#area").text("区域");
        $("#metro").text("地铁");
    },
    //条件筛选
    filterTips: function() {
        var _this = this;
        $('.u-select ul li').on('click', function() {

            var dom = $(this).parent().parent();
            var u_select = $(this).parents('.u-select');
            if (u_select.find('span').text() != $(this).text()) {
                u_select.find('span').text($(this).text());
                if (dom.hasClass("searchCity")) {
                    //初始化列表
                    $("#ul-searchMetro").html(window.metroArry[$(this).attr("data-option")]);
                    $("#u-searchArea").html(window.areaArry[$(this).attr("data-option")]);
                    var area_height=($("#u-searchArea li").length * 30>300)?($("#u-searchArea li").length*30):300;
                    $("#u-searchArea li .sublist").css({"min-height": area_height+ "px"});
                    $.timeHover('.u-searchSelect', 'hover');
                    $.hover('.u-searchSelect li');
                    u_select.removeClass('hover');
                    u_select.find('span').attr("data-option", _this.c_id);
                    _this.initObject($(this).text(), parseInt($(this).attr('data-option')));
                    _this.map.centerAndZoom(_this.mobject.c_name, _this.mobject.level);
                    _this.moveMap(true,true);



                } else {

                    var selected = $(this).attr('data-range');

                    if (dom.hasClass("price")) {

                        _this.mobject.price = selected;

                    } else if (dom.hasClass("bedrooms")) {

                        _this.mobject.bedrooms = selected;

                    } else if (dom.hasClass("orientation")) {

                        _this.mobject.orientation = selected;
                        tipsNum();

                    } else if (dom.hasClass("styles")) {

                        _this.mobject.style = selected;
                        tipsNum();

                    } else if (dom.hasClass("floor")) {

                        _this.mobject.floor = selected;
                        tipsNum();

                    }
                    _this.addAreaOverlay(_this.mobject);
                    _this.removeOvelayList();
                    if (_this.mobject.type) {
                        _this.getHouseList();
                    }


                }

            };

        });
        $("#entire").on("click", function() { //整租非整租
            var num = $("#tips").text().replace("(", "").replace(")", "");
            if (!$("#entire").hasClass("checked")) {
                _this.mobject.entire = "true";
                if (num = "") {
                    num = 0
                };
                $("#tips").text("(" + (num + 1) + ")");
            } else {
                _this.mobject.entire = "";
                if (num != "") {
                    if ((parseInt(num) - 1) != 0) {
                        $("#tips").text("(" + (parseInt(num) - 1) + ")");
                    } else {

                        $("#tips").text("");
                    }

                }

            }
            _this.addAreaOverlay(_this.mobject);
            _this.removeOvelayList();
            if (_this.mobject.type) {
                _this.getHouseList();
            }
        });
        /*//搜索框
        $('.J_suggest').autoSuggest({
            enterAction: function(event, keyword) {
                if (event) {

                    keyword.val(event.find("span").text());
                    var type = event.attr("data-type");
                    var id = parseInt(event.attr("data-id"));
                    var levelCenter = event.attr("next-center");
                    var nextLevel = event.attr("next-level");
                    _this.mobject.type = type;
                    _this.mobject.id = id;
                    _this.clickOverlay(levelCenter, nextLevel);

                } else {
                    _this.mobject.key = keyword.val();
                    if ($(".suggestWrap li").length > 0) {
                        var dom = $($(".suggestWrap li")[0]);
                        var type = dom.attr("data-type");
                        var id = parseInt(dom.attr("data-id"));
                        var levelCenter = dom.attr("next-center");
                        var nextLevel = dom.attr("next-level");
                        _this.mobject.type = type;
                        _this.mobject.id = id;
                        _this.clickOverlay(levelCenter, nextLevel);
                    } else {
                        _this.updateList([]);
                        _this.removeOvelayList();
                        _this.removeOvelayList(true);
                    }

                }
                $("#ul-searchMetro").parents(".u-searchSelect").find("span").text("地铁");
                $("#u-searchArea").parents(".u-searchSelect").find("span").text("区域");

            },
            selectAction: function(event, keyword) {
                keyword.val(event.find("span").text());
            },
            ajaxAction: function(suggestWrapShow, keyword) {
                $.getJSON('/api/c/map/blocks?', {
                        city: _this.mobject.c_id,
                        key: $.trim(keyword.val())
                    },
                    function(data) {
                        suggestWrapShow("");
                        var html = '';
                        var results = data.result;
                        for (var i = 0; i < results.length; i++) {
                            var place = results[i].lng + "," + results[i].lat;
                            html += '<li class="cp" data-id=' + results[i].id + ' data-type=' + results[i].type + ' next-center=' + place + ' next-level=' + results[i].next_level + '><span>' + results[i].name + '</span>&nbsp;&nbsp;<i style="color:#a4a5a6">[' + results[i].block + ']</i></li>';
                        }

                        suggestWrapShow(html);
                    }
                );
            }
        });*/
        $("#u-searchArea").delegate("strong,a", "click", function() {

            var type = $(this).attr("data-type");
            var id = parseInt($(this).attr("data-id"));
            var levelCenter = $(this).attr("next-center");
            var nextLevel = $(this).attr("next-level");
            _this.mobject.id = id;
            _this.mobject.type = type;
            $(this).parents(".u-searchSelect").find("span").text($(this).text());
            $("#metro").text("地铁");
            $("#searchInput").val("");
            _this.clickOverlay(levelCenter, nextLevel);
        });
        $("#ul-searchMetro").delegate("a", "click", function() {
            var txt = $(this).text();
            var line = $(this).parents("li").find("strong i").text();
            $(this).parents(".u-searchSelect").find("span").text(txt);
            $("#area").text("区域");
            $("#searchInput").val("");
            var levelCenter = $(this).attr("next-center");
            var nextLevel = $(this).attr("next-level");
            $.ajax({
                url: "/api/c/map/metro",
                async: false,
                type: "Get",
                data: {
                    "city": _this.mobject.c_id, //城市id
                    "line": line, //地铁线路
                    "stop": txt, //地铁站
                },
                success: function(res) {

                    _this.clickOverlay(levelCenter, nextLevel, true);
                    _this.addMetroOverlay(levelCenter, _this.getStyleByTextMetro(levelCenter, txt, res.total));
                    _this.updateList(res.result, res.total);

                }

            })


        });
        //条件排序
        $(".sortingItem a,#order-default").on("click", function(e) {
            if (e.target.id != "order-default") {
                var dom = $(this).parents(".u-dropdown").find("span");
                dom.text($(this).text());
                dom.parent().addClass("current");
                if ($(this).attr("data-price")) {
                    dom.attr("data-price", $(this).attr("data-price"));
                    _this.mobject.order = dom.attr("data-price");
                    $("#order-size").text("面积");
                    $("#order-default").parent().removeClass("current");
                    $("#order-size").parent().removeClass("current");
                } else {
                    dom.attr("data-size", $(this).attr("data-size"));
                    _this.mobject.order = dom.attr("data-size");
                    $("#order-price").text("价格");
                    $("#order-default").parent().removeClass("current");
                    $("#order-price").parent().removeClass("current");
                };

            } else {
                $("#order-price").text("价格");
                $("#order-size").text("面积");
                $("#order-price").parent().removeClass("current");
                $("#order-size").parent().removeClass("current");
                $("#order-default").parent().addClass("current");
                _this.mobject.order = "price";
            }
            if (_this.mobject.type == 3) {

                _this.getHouseList();

            }

        })

        function tipsNum() {
            var i = 0;
            $(".tips").each(function() {
                if ($(this).text() != "不限") {
                    ++i;
                }
            });
            if ($("#entire").hasClass("checked")) {
                ++i;
            }
            if (i != 0) {
                $("#tips").text("(" + i + ")");
            } else {
                $("#tips").text("");
            }

        };


    },
    removeOvelayList: function(flag) {

        var _this = this;
        if (flag) { //flag=true清除地铁覆盖物

            _this.map.removeOverlay(_this.metroList["circle"]);
            _this.map.removeOverlay(_this.metroList["remark"]);
            _this.map.removeOverlay(_this.metroList["overlay"]);

        } else {

            _this.removeBoundary();
            $.each(_this.overlayList, function(i, val) {

                if (val.newAddFlag == false) {
                    _this.map.removeOverlay(val);
                    delete _this.overlayList[i];
                }
            });
        }


    },

    getOverlay: function( place, name, num, nextLevel, type, id) {

        var _this = this;

        function squareOverlay(place, name, num, nextLevel, type, id) {
            if (type == 1) {

                this._div = $("<div class='point1' next-center=" + place + " next-level=" + nextLevel + " data-name=" + name + "><i>" + name + "</i><br/>" + num + "套</div>").get(0);

            } else if (type == 2) {

                this._div = $("<div class='point2'><p next-center=" + place + " next-level=" + nextLevel + " data-name=" + name + ">" + num + "套</p><i>" + name + "</i></div>").get(0);

            } else {

                this._div = $("<div class='point3' next-center=" + place + " next-level=" + nextLevel + "><p><span>" + num + "套</span><i>" + name + "</i></p></div>").get(0);

            }
            var arr = place.split(",");
            this._point = new BMap.Point(arr[0], arr[1]);
            this._areaId = type + "/" + id;
        };

        squareOverlay.prototype = new BMap.Overlay();
        // 实现初始化方法
        squareOverlay.prototype.initialize = function(map) {
            this._map = map;
            var div = this._div;
            div.style.position = "absolute";
            div.style.zIndex = BMap.Overlay.getZIndex(this._point.lat);

            div.onmouseover = function() {

                _this.getBoundary(type, id);

            },

                div.onmouseout = function() {

                    _this.removeBoundary();

                },

                div.onclick = function(e) {
                    e = e || window.event;
                    var dom = e.target || e.srcElement;
                    var levelCenter = $(dom).attr("next-center") || $(dom).parent().attr("next-center");
                    var nextLevel = parseInt($(dom).attr("next-level")) || $(dom).parent().attr("next-level");
                    _this.mobject.type = type;
                    _this.mobject.id = id;

                    if (nextLevel != 0 && levelCenter != undefined) {

                        _this.clickOverlay(levelCenter, nextLevel);
                        $("#area").text($(dom).attr("data-name"));

                    } else {

                        $(".point3 span").removeClass("p_current");
                        $(".point3 i").removeClass("show");
                        $(dom).addClass("p_current");
                        $(dom).next().addClass("show");
                        _this.getHouseList();
                    }
                    e.stopPropagation();
                };
            _this.map.getPanes().labelPane.appendChild(div);
            return div;
        };

        squareOverlay.prototype.draw = function() {
            var map = this._map;
            var pixel = map.pointToOverlayPixel(this._point);
            this._div.style.left = pixel.x + "px";
            this._div.style.top = pixel.y + "px";
        };

        return new squareOverlay(place, name, num, nextLevel, type, id);
    },
    //点击覆盖物
    clickOverlay: function(levelCenter, nextLevel, flag) {

        var arr = levelCenter.split(",");
        var point = new BMap.Point(arr[0], arr[1]);
        this.mobject.level = nextLevel;
        if (!flag) { //非地铁

            this.getHouseList();
        }
        this.map.centerAndZoom(point, nextLevel);
        if (this.currentLevel == nextLevel) {
            this.moveMap()
        } else {

            this.currentLevel = nextLevel
        }

    },
    //添加覆盖物
    addAreaOverlay: function(mobject, flag, tips) {

        var _this = this;
        $.each(_this.overlayList, function(i, val) {

            if (val != undefined) {

                _this.overlayList[val._areaId].newAddFlag = false;

            }

        });

        $.ajax({

            url: "/api/c/map/data",
            async: false,
            type: "Get",
            data: {
                "city": mobject.c_id, //城市id
                "level": mobject.level, //地图层级
                "left": mobject.left, //地图边界
                "rigth": mobject.rigth, //地图边界
                "top": mobject.top, //地图边界
                "bottom": mobject.bottom, //地图边界
                //"district":mobject.district,//区域
                "price": mobject.price, //价格
                "floor": mobject.floor, //楼层
                "bedrooms": mobject.bedrooms, //户型
                "orientation": mobject.orientation, //朝向
                "style": mobject.style, //风格
                "entire": mobject.entire //整租
            },
            success: function(res) {

                var arr = res.result;

                if (!mobject.left || (!mobject.type && !flag)||tips) {
                    _this.updateList(arr, res.total);
                }
                for (var i = 0; i < arr.length; i++) {

                    var place = arr[i].lng + "," + arr[i].lat;
                    var textOverlay = _this.getOverlay(place, arr[i].name, arr[i].count, arr[i].next_level, arr[i].type, arr[i].id);
                    _this.addOverlay(textOverlay, flag);

                };

            }

        })

    },
    //增加覆盖物
    addOverlay: function(overlay, flag) {

        var _this = this;
        if (flag) {
            if (this.overlayList[overlay._areaId] == undefined) {
                updateOverlay(overlay);
            }
        } else {

            if (this.overlayList[overlay._areaId] != undefined) {

                this.map.removeOverlay(this.overlayList[overlay._areaId]);
            }
            updateOverlay(overlay);
        };

        function updateOverlay(overlay) {

            overlay.newAddFlag = true;
            _this.map.addOverlay(overlay);
            _this.overlayList[overlay._areaId] = overlay;

        }


    },
    //添加地铁覆盖物
    addMetroOverlay: function(levelCenter, metroOverlay) {

        var location = levelCenter.split(",");
        var circle = new BMap.Circle(new BMap.Point(location[0], location[1]), 1000, {
            strokeColor: "red", // e84a01
            strokeWeight: 2,
            strokeOpacity: 1,
            fillColor: "#000",
            fillOpacity: 0.1,
            enableClicking: false
        });

        var remark = new BMap.Label('<p class="remark">1km</p>', {
            position: new BMap.Point(location[0], (parseFloat(location[1]) + 0.0092))
        });
        remark.setStyle({
            border: 0,
            color: "#ffffff",
            background: "#e84a01"
        });
        this.removeOvelayList(true);
        this.metroList["circle"] = circle;
        this.metroList["remark"] = remark;
        this.metroList["overlay"] = metroOverlay;
        this.map.addOverlay(circle);
        this.map.addOverlay(remark);
        this.map.addOverlay(metroOverlay);

    },
    //建立和移除多边形覆盖物
    getBoundary: function(type, id) {

        var _this = this;
        var bdary = new BMap.Boundary();

        $.ajax({

            url: "/api/c/map/boundaries",
            async: false,
            type: "Get",
            data: {

                "type": type,
                "id": id

            },
            success: function(res) {

                var coordinates = "";
                for (var i = 0; i < res.result.length; i++) {

                    coordinates = coordinates + ";" + res.result[i].lng + "," + res.result[i].lat;
                }

                var plyStr = coordinates.substring(1, coordinates.length - 1);

                var ply = new BMap.Polygon(plyStr, {
                    strokeWeight: 2,
                    fillOpacity: 0.35,
                    strokeColor: "#ff0000"
                }); //建立多边形覆盖物
                _this.removeBoundary();
                _this.map.addOverlay(ply); //添加覆盖物
                _this.clearOverlayList.push(ply); //调整视野

            }


        })


    },

    removeBoundary: function() {

        var _this = this;

        $.each(_this.clearOverlayList, function(i, val) {

            _this.map.removeOverlay(val); // 移除区域范围

        });

    },

    getHouseList: function() {

        var _this = this;

        $.ajax({

            url: "/api/c/map/detail",
            type: "Get",
            data: {

                "type": _this.mobject.type,
                "id": _this.mobject.id,
                //"district":_this.mobject.district,//区域
                "price": _this.mobject.price, //价格
                "floor": _this.mobject.floor, //楼层
                "bedrooms": _this.mobject.bedrooms, //户型
                "orientation": _this.mobject.orientation, //朝向
                "style": _this.mobject.style, //风格
                "entire": _this.mobject.entire, //整租
                "order": _this.mobject.order

            },

            success: function(res) {

                _this.updateList(res.result, res.total);

            }


        })


    },

    updateList: function(arr, total) {

        $("#sorting .u-dropdown").addClass("dn");
        $(".searchResultsTop").addClass("dn");
        if (arr.length == 0) {
            $(".house-num").text("共 0 套房源");
            str = '<div class="noResult"><p>很抱歉，小水滴没有找到相应的房源。试试委托找房，让水滴管家来帮你！</p><a class="btn btn-primary" href="javascript:;" onclick="win.needroom();">委托找房</a></div>';
            $(".roomList").html(str);

        } else {

            var _li = "";
            var _ul = "";
            for (var i = 0; i < arr.length; i++) {

                if (this.mobject.type == 3) {
                    $(".searchResultsTop").removeClass("dn");
                    $("#sorting .u-dropdown").removeClass("dn");
                    $(".house-num").text(arr[i].area_name + ",共 " + total + " 套房源");
                    _li = _li + '<li><a href=/room/' + arr[i].id + '><img class="lazy" width="160" height="120" data-original=' + arr[i].pictures[0] + ' src="../static/images/noimg.png" alt=""></a><div class="detail"><a href=/room/' + arr[i].id + '><h3>' + arr[i].area_name + '  ' + arr[i].bedrooms + '居室  ' + arr[i].rtype + '</h3></a><p>' + arr[i].metros + '</p><p>' + arr[i].size + '㎡  ' + arr[i].floor + '/' + arr[i].floors + '楼  ' + arr[i].bedrooms + '室' + arr[i].livingrooms + '厅</p><div class="price"><b>' + arr[i].recommended_price + '</b><span>元/月</span></div></div></li>';

                } else {
                    $(".house-num").text("共 " + total + " 套房源");
                    var place = arr[i].lng + "," + arr[i].lat;
                    var nextLevel = arr[i].next_level;

                    _li = _li + '<li data-id=' + arr[i].id + ' data-type=' + arr[i].type + ' next-center=' + place + ' next-level=' + nextLevel + ' class="cp"><i>' + arr[i].name + '</i><span>' + arr[i].count + '套</span><b></b></li>';

                }

            };

            if (this.mobject.type == 3) {
                _ul = '<ul class="house-list">' + _li + '</ul> ';
                $(".roomList").html(_ul);
                //图片懒加载
                $("img.lazy").lazyload({
                    container: $('.roomList')
                })
            } else {
                _ul = '<ul class="title-list">' + _li + '</ul> ';
                $(".roomList").html(_ul);
                this.liClick();
            };
        }

    },

    liClick: function() {
        var _this = this;
        $(".roomList li").click(function(e) {
            var levelCenter = $(e.target).attr("next-center");
            var nextLevel = parseInt($(e.target).attr("next-level"));
            var type = parseInt($(e.target).attr("data-type"));
            var id = parseInt($(e.target).attr("data-id"));
            _this.mobject.type = type;
            _this.mobject.id = id;
            _this.clickOverlay(levelCenter, nextLevel);

        })

    },

    // 地铁站覆盖物
    getStyleByTextMetro: function(point, metroStop, houseNum) {
        var _this = this;
        // 复杂的自定义覆盖物
        function ComplexCustomOverlay(point, metroStop, houseNum) {

            var arr = point.split(",");
            this._point = new BMap.Point(arr[0], arr[1]);
            this._text = metroStop;
            this._houseNum = houseNum;

        }
        ComplexCustomOverlay.prototype = new BMap.Overlay();
        ComplexCustomOverlay.prototype.initialize = function(map) {
            this._map = map;
            var div = this._div = document.createElement("div");
            div.style.position = "absolute";
            div.style.zIndex = BMap.Overlay.getZIndex(this._point.lat);
            div.style.backgroundColor = "#EE5D5B";
            div.style.border = "1px solid #BC3B3A";
            div.style.color = "white";
            div.style.height = "18px";
            div.style.padding = "2px";
            div.style.lineHeight = "18px";
            div.style.whiteSpace = "nowrap";
            div.style.MozUserSelect = "none";
            div.style.fontSize = "12px"
            var span = this._span = document.createElement("span");
            div.appendChild(span);
            span.appendChild(document.createTextNode(this._text));
            var that = this;

            var arrow = this._arrow = document.createElement("div");
            arrow.style.background = "url(http://map.baidu.com/fwmap/upload/r/map/fwmap/static/house/images/label.png) no-repeat";
            arrow.style.position = "absolute";
            arrow.style.width = "11px";
            arrow.style.height = "10px";
            arrow.style.top = "22px";
            arrow.style.left = "10px";
            arrow.style.overflow = "hidden";
            div.appendChild(arrow);

            _this.map.getPanes().labelPane.appendChild(div);

            return div;
        }
        ComplexCustomOverlay.prototype.draw = function() {
            var map = this._map;
            var pixel = map.pointToOverlayPixel(this._point);
            this._div.style.left = pixel.x - parseInt(this._arrow.style.left) + "px";
            this._div.style.top = pixel.y - 30 + "px";
        }
        metroStop = metroStop + " " + houseNum + "套";

        return new ComplexCustomOverlay(point, metroStop, houseNum);
    }

}