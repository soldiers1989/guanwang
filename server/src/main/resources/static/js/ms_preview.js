(function ($) {
    $.fn.ms_preview = function (options) {
        var defaults = {
            event: 'click',
            current_li: 0,// 被选择的
            jumpIndex: 1// 每次跳跃个数
        };
        var opts = $.extend({}, defaults, options);
        var event = opts.event;
        var current_li = opts.current_li;
        var jumpIndex = opts.jumpIndex;

        var $this = this;
        var $main = $this.find('.preview-main');
        var $nav = $this.find('.preview-nav');
        var $up = $this.find('.up');
        var $down = $this.find('.down');

        var li_size = $nav.find('li').size();// li的个数
        var li_height = $nav.find('li').height();// li的高度
        var margin = parseInt($nav.find('li:first-child').css('margin-bottom'));//li 向下漂移高度
        var one_height = li_height + margin;// 一个模块的高度
        var ul_height = li_size * li_height + margin * (li_size - 1);// ul的高度
        var minTop = 0;// top最小值
        var maxTop = $nav.height() - ul_height;// top最大值

        $nav.find('ul').css({
            height: ul_height
        });
        $up.css({display: 'none'});
        if (li_size > $nav.height() / one_height) {
            $down.css({display: 'block'});
        }
        $main.html('<img src="' + $nav.find('ul li:eq(' + current_li + ')').children('img').attr('src') + '"/>');
        $nav.find('ul li:eq(' + current_li + ')').addClass('current');

        // 点击小nav
        $nav.on(event, 'li', function () {
            if ($(this).find('img').size() > 0) {
                current_li = $(this).index();
                setCurrent(current_li);
            }
        });

        // 向上
        $up.on('click', function () {
            if (!$up.attr('disabled')) {
                var currentTop = parseInt($nav.find('ul').css('top'));
                var top = currentTop + one_height * jumpIndex;
                if (top >= minTop) {
                    top = minTop;
                    $up.css({display: 'none'});
                }
                top == maxTop ? $down.css({display: 'none'}) : $down.css({display: 'block'});
                $up.attr('disabled', true);
                $nav.find('ul').animate({top: top}, function () {
                    $up.removeAttr('disabled');
                });
                setCurrent(current_li - jumpIndex);
            }
        });

        // 向下
        $down.on('click', function () {
            if (!$down.attr('disabled')) {
                var currentTop = parseInt($nav.find('ul').css('top'));
                var top = currentTop - one_height * jumpIndex;
                if (top <= maxTop) {
                    top = maxTop;
                    $down.css({display: 'none'});
                }
                top == minTop ? $up.css({display: 'none'}) : $up.css({display: 'block'});
                $down.attr('disabled', true);
                $nav.find('ul').animate({top: top}, function () {
                    $down.removeAttr('disabled');
                });
                setCurrent(current_li + jumpIndex);
            }
        });

        // 设置当前current
        function setCurrent(index) {
            if (index >= 0 && index <= li_size) {
                $nav.find('ul li').removeClass('current');
                current_li = index;
                $nav.find('ul li').eq(current_li).addClass('current');
                $main.html('<img src="' + $nav.find('ul li').eq(current_li).find('img').attr('src') + '"/>');
            }
        }
    };
})(jQuery);