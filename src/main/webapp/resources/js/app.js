"use strict";
var app  = app || {};

app = (()=>{
	let aa
	
	let init=x=>{
		onCreate();
	}
	let onCreate = ()=>{
		setContentView();
	}
	let setContentView=()=>{
		let ac = {'mid':'aa', 'password':'bb', 'address':'cc','name':'dd',
				'phone':'ff', 'mail':'gg','account':'','birth':'adf'}
		$('#aa').click(function(){
			$.ajax({
				url:'/web/catess/aa',
				type:'post',
				data:JSON.stringify(ac),
				dataType:'json',
				contentType:'application/json; charset=UTF-8;',
				success: d=>{
					alert(d.list);
				},
				error : e => {
						
				}
			});
				
			
		})
	}
	return {init : init}
})()
