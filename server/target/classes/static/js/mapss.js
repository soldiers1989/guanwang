// 百度地图API功能
$(function(){
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
	// 百度地图API功能
	var map = new BMap.Map("map");    // 创建Map实例
	//map.centerAndZoom(new BMap.Point(121.52480367265565, 31.28081768010922), 11);  // 初始化地图,设置中心点坐标和地图级别
	//添加地图类型控件
    var city = localStorage.getItem("city");
    map.centerAndZoom(city,11);          // 设置地图显示的城市 此项是必须设置的
	map.enableScrollWheelZoom(true);     //开启鼠标滚轮缩放
})