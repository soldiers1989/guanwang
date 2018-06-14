/**
 * 2015-10-31
 * author Chooin
 * https://github.com/Chooin/autoSuggest
 */
(function($){
	$.fn.autoSuggest = function (options) {
		var defaults = { 
			selectAction: function(){},// 键盘上下选择关键词
			enterAction: function(){},// 键盘回车键或鼠标点击关键词
			ajaxAction: function(){}// 获取数据生成特定格式
		};   
		var opts = $.extend({}, defaults, options); 
		var $suggest = this;
		var $selectAction = opts.selectAction; 
		var $enterAction = opts.enterAction; 
		var $ajaxAction = opts.ajaxAction; 
		var $select;// 选择的li
		$suggest.append('<ul class="suggestWrap"></ul>');
		var $keyword = $suggest.find('input');
		var $suggestWrap = $suggest.find('.suggestWrap');

	    
	    // 键盘事件
		$keyword.on('keyup', function(event){
			if((event.keyCode == 38 || event.keyCode == 40) && $suggestWrap.css('display') == 'block'){// 显示提示
				var current = $suggestWrap.find('li.hover');
				if(event.keyCode == 38) {
					if(current.length > 0) {
						var prevLi = current.removeClass('hover').prev();
						if(prevLi.length > 0) {
							$select = prevLi;
							selectAction(prevLi);
						}
					}else{
						var last = $suggestWrap.find('li:last');
						$select = last;
						selectAction(last);
					}

				}else if(event.keyCode == 40) {
					if(current.length > 0) {
						var nextLi = current.removeClass('hover').next();
						if(nextLi.length > 0) {
							$select = nextLi;
							selectAction(nextLi);
						}
					}else{
						var first = $suggestWrap.find('li:first');
						$select = first;
						selectAction(first);
					}
				}
			}else if(event.keyCode == 13){// 回车
				enterAction($select);
				return false;
			}else{// 继续输入内容
				var valText = $.trim($keyword.val());
				if (valText == '') {
					$suggestWrap.css({'display': 'none'});
					return false;
				}else{
					ajaxAction();
				}
			}
		});
	    
	    // 输入框失去焦点
		$keyword.on('blur', function(){
			setTimeout(function(){
				$suggestWrap.css({'display': 'none'});
			}, 500);
		});

		function enterAction(obj){
			$enterAction(obj, $keyword);
			$suggestWrap.css({'display': 'none'});
		}

		function ajaxAction(){
			$ajaxAction(suggestWrapShow, $keyword);
		};

		function selectAction(li){
			li.addClass('hover');
			$selectAction(li, $keyword);
		};

		var suggestWrapShow = function (html){// 显示suggest内容
			if(html != ''){
				$suggestWrap.html(html).css({'display': 'block'});
				$suggestWrap.find('li').off('click').on('click', function(){
					enterAction($(this));
				});
			}else{
				$suggestWrap.css({'display': 'none'});
			}
		}
	};
});