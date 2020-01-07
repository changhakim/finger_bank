"use strict";
var app  = app || {};

app = (()=>{
	
	let init=x=>{
		app.$.init(x);
	}
	let onCreate = ()=>{
		setContentView();
	}
	let setContentView=()=>{
		$('#loginbtn').click(function(){
			let ac = {'mid':$('#login').val(), 'password':$('#password').val()}
			$.ajax({
				url:'/web/login/auth',
				type:'post',
				data:JSON.stringify(ac),
				dataType:'json',
				contentType:'application/json; charset=UTF-8;',
				success: d=>{
					if(d.mid == 'idNull'){
						alert('아이디가 존재하지않습니다.');
					}else{
						sessionStorage.setItem('acc',d.member.account);
						location.assign($.ctx()+'/home');
						
					}
				},
				error : e => {
						
				}
			});
				
			
		})
	}
	return {init : init,onCreate:onCreate}
	
})();
app.$={
		init:x=>{
			$.getScript(x+'/resources/js/router.js',
			()=>{
				$.extend(new Session(x))
				app.onCreate(); 
				
			});
			
		}
}
