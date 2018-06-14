var win = {
    loaded: function () {
        // 模拟select
        $.timeHover('.u-select');
        // 图片延迟加载
        // $("img").lazyload({
        //     placeholder: "http://jileiba.com/wp-includes/images/loading03.gif",
        //     effect: "fadeIn"
        // });
    },
    // 设置头部的个人中心
    setHeader: function () {
        var html = '';
        if (win.getCookie('username')) {
            if ($('.J_userCenter').size() == 0) {
                $('.J_headerNav').find('.J_login').remove();
                html += '<li class="J_userCenter">';
                html += '<em class="ico ico-user-g fl mr-5"></em> 我的水滴';
                html += '<ul>';
                html += '<em class="ico ico-userArrow-up"></em>';
                html += '<li><a href="/account">个人中心</a></li>';
                html += '<li><a href="/account/needrooms">我的预约</a></li>';
                html += '<li><a href="/account/room/collections">我的收藏</a></li>';
                html += '<li><span></span></li>';
                html += '<li><a href="javascript:;" onclick="win.logout();">退出登录</a></li>';
                html += '</ul>';
                html += '</li>';
                $('.J_headerNav').append(html);
                // header-UserCenter
                $.timeHover('.J_userCenter');
            }
        } else {
            if ($('.J_login').size() == 0) {
                $('.J_headerNav').find('.J_userCenter').remove();
                html += '<li class="J_login">';
                html += '<a href="javascript:;" onclick="win.login(0);">登录</a>';
                html += '<span>/</span>';
                html += '<a href="javascript:;" onclick="win.login(1);">注册</a>';
                html += '</li>';
                $('.J_headerNav').append(html);
            }
        }
    },
    /**
     * 获取cookie值
     * @param string name cookie名称，def:csrftoken
     * @return string cookie的值
     */
    getCookie: function (name) {
        _name = name || 'csrftoken';
        var cookieValue = null;
        if (document.cookie && document.cookie != '') {
            var cookies = document.cookie.split(';');
            for (var i = 0; i < cookies.length; i++) {
                var cookie = jQuery.trim(cookies[i]);
                // Does this cookie string begin with the name we want?
                if (cookie.substring(0, _name.length + 1) == (_name + '=')) {
                    cookieValue = decodeURIComponent(cookie.substring(_name.length + 1));
                    break;
                }
            }
        }
        return cookieValue;
    },
    /**
     * 将表单name生成对象
     * @param string formid 表单ID
     * @return object 表单对象
     */
    getFormData: function (formid) {
        var dataArray = $(formid).serializeArray();
        var data = {};
        $.each(dataArray, function (i, field) {
            data[field.name] = field.value;
        });
        return data
    },
    /**
     * 获取url的get值
     * @param string par 要获取的GET
     * @return string
     */
    getPar: function (par) {
        var local_url = document.location.href;
        var get = local_url.indexOf(par + '=');
        if (get == -1) {
            return false;
        }
        var get_par = local_url.slice(par.length + get + 1);
        var nextPar = get_par.indexOf('&');
        if (nextPar != -1) {
            get_par = get_par.slice(0, nextPar);
        }
        get_par = decodeURIComponent(get_par);
        return get_par;
    },
    logout: function () {
        $.get('/logout', {}, function () {
            window.location.href = '/';
        });
    },
    // 委托找房
    entrustroom: function (id) {
        console.log(id);
        var height = win.getCookie('username') ? 709 - 122 : 709;
        $('.J_modal').ms_modalPicker({
            body: '<iframe src="/entrustroom?id=' + id + '" class="loading" scrolling="no" frameborder="0" width="850" height="' + height + '"></iframe>'// 弹出框内容
        });
    },
    // 分散式预约看房
    dispersedWatchroom: function (roomId) {
        var height = win.getCookie('username') ? 540 - 122 : 540;
        $('.J_modal').ms_modalPicker({
            body: '<iframe src="/watchroom/disperse?id=' + roomId + '" class="loading" scrolling="no" frameborder="0" width="850" height="' + height + '"></iframe>'
        });
    },
    //集中式预约房型
    concentrateWatchroom: function (id, apartment, store, layout) {
        console.log(id)
        var height = win.getCookie('username') ? 540 - 122 : 540;
        $('.J_modal').ms_modalPicker({
            body: '<iframe src="/watchroom/concentrate?apartment=' + apartment + '&store=' + store + '&layout=' + layout + '&id=' + id + '" class="loading" scrolling="no" frameborder="0" width="850" height="' + height + '"></iframe>'
        });
    },
    //切换城市
    changeCity: function(){
        //默认展示第一个城市
        var defaultCity = localStorage.getItem("city") ? localStorage.getItem("city") : $(".city-list li").first().text();
        console.log(defaultCity);
        $("#city").text(defaultCity);
        $(".city-change").click(function () {
            $(".city-list").show();
        });
        //下拉表单的切换事件
        $(".city-list li").click(function (e) {
            e.stopPropagation();
            $(".city-change #city").text($(this).text());
            localStorage.setItem("city",$(this).text());
            //点击切换城市，并刷新首页
            self.location.href = window.location.href.split("?")[0] + "?city=" + $(this).text();
            $(".city-list").hide();
        });
        //鼠标城市下拉表单离开事件
        $(".city-list").mouseleave(function () {
            $(".city-list").hide();
        });

    }




};

$(function () {
    win.loaded();
    win.changeCity();
    // win.setHeader();
});

//hover 添加hover样式
$.hover = function (obj, className) {
    var _className = className || 'hover';
    $(obj).hover(function () {
            $(this).addClass(_className);
        },
        function () {
            $(this).removeClass(_className);
        });
}

//timeHover 0.1秒后添加hover样式
$.timeHover = function (obj, className) {
    var _className = className || 'hover';
    var timer = null;
    $(obj).hover(
        function () {
            console.log($(this))
            var hover = $(this);
            timer = setTimeout(function () {
                hover.parent().children().removeClass(_className);
                hover.addClass(_className);
            }, 100);
        },
        function () {
            $(this).removeClass(_className);
            if (timer) {
                clearTimeout(timer);
            }
        });
}

$.tab = function (obj_o, obj_t, event, num) {
    $(obj_t).children('li').hide();
    var _num = num || 0;
    $(obj_o).find('li:eq(' + _num + ')').addClass('current').show();
    $(obj_t).find('li:eq(' + _num + ')').show();
    $(obj_o).children('li').on(event, function () {
        $(this).addClass('current').siblings('li').removeClass('current');
        var activeindex = $(obj_o).children('li').index(this);
        $(obj_t).children().eq(activeindex).fadeIn().siblings().hide();
        return false
    });
};

//獲取url搜索值
$.request = function (name) {
    var search = location.search.slice(1);
    var arr = search.split("&");
    for (var i = 0; i < arr.length; i++) {
        var ar = arr[i].split("=");
        if (ar[0] == name) {
            if (decodeURI(ar[1]) == 'undefined') {
                return "";
            } else {
                return decodeURI(ar[1]);
            }
        }
    }
    return "";
}