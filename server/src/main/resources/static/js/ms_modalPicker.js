/**
 * 2015-01-20
 * author Chooin
 * https://github.com/Chooin/ms_modalPicker
 */
;(function($) {
    $.fn.ms_modalPicker = function (options) {

        var defaults = {
            title: '',// 标题
            body: '',// 弹出框内容
            speed: 'slow',// 弹出框弹出时间
            top: '',// 浏览器顶部便宜距离
            width: 'auto',// 弹出框的宽
            height: 'auto',// 弹出框的高
            scroll: true,// 是否可以滚动
            follow: false,// 内容是否跟随滚动
            screenClose: true// 点击覆盖层是否关闭弹出
        };
        var opts = $.extend({}, defaults, options);
        var title = opts.title;
        var body = opts.body;
        var speed = opts.speed;
        var top = opts.top;
        var width = opts.width;
        var height = opts.height;
        var scroll = opts.scroll;
        var follow = opts.follow;
        var screenClose = opts.screenClose;
        var isClosed = true;
        var $this = this;
        
        if(!scroll){$('body').css({overflow: 'hidden'});}
        $this.html('<div class="ms_modal"></div><div class="ms_modal-screen"></div>');// 添加ms_modal,ms_modal-screen
        var $content = $this.children('.ms_modal');
        if(title){$content.append('<div class="ms_modal-title">' + title + '</div>');}// 添加title
        $content.append('<div class="ms_modal-body">加载中...</div><a class="ms_modal-close" href="javascript:void(0);"></a>');// 添加body,close
        $content.children('.ms_modal-body').html(body).css({width: width, height: height}); 
        setContent();
        $('.ms_modal-screen').css({height: $(document).height()});
        setTimeout(function(){
            var closeObj = '.ms_modal-close' + (screenClose ? ',.ms_modal-screen' : '');
            $(closeObj).bind('click', function(){
                isClosed = true;
                $content.fadeOut(speed, function(){
                    $('.ms_modal-screen').remove();
                    if(!scroll){$('body').css({overflow: 'visible'});}
                });
            });
        }, 1000);
        $content.fadeIn(speed, function(){
            isClosed = false;
        });
        if(follow){
            $(window).bind('scroll resize', function(){
                if(!isClosed){$content.stop();}
                setContent();
            });
        }
        function setContent(){
            var bodyWidth = parseInt($(window).width());
            var bodyHeight = parseInt($(window).height());
            var blockWidth = parseInt($content.width());
            var blockHeight = parseInt($content.height());
            var leftPosition = parseInt((bodyWidth < blockWidth ? 0 : (bodyWidth/2) - (blockWidth/2)) + $(window).scrollLeft());
            if(top){
                var topPosition = top + $(window).scrollTop()
            }else{
                var topPosition = parseInt((bodyHeight < blockHeight ? 0 : (bodyHeight/2) - (blockHeight/2)) + $(window).scrollTop());
            }
            $content.animate({top: topPosition, left: leftPosition, position: 'absolute'}, 100);
        }

    };
})(jQuery);
