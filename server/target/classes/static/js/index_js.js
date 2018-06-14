$(function(){
	 
	
	$('.back').click(function(){
		$('html,body').animate({scrollTop: '0px'}, 800);
	})
	
	$('#key_serch').focus(function(){
		$('.key_serch_down').show()
	})
	$('#key_serch').blur(function(){
		$('.key_serch_down').hide()
	})
	
	$('.icon_bottom a').hover(
		function(){
		$('.code_down').show()
		},
		function(){
		$('.code_down').hide()
		})
	
})
