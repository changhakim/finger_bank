var homemain = homemain || {};

homemain = (()=>{
	let init = ()=>{
		onCreate();
	};
	let onCreate = ()=>{
		setContentView();
	};
	let setContentView = ()=>{
		let accexist = sessionStorage.getItem('acc');
		alert(accexist);
		if( accexist == null|| accexist == ''|| accexist == undefined ){
			alert('안녕')
		}
	};
	return {init:init}
	
	
})();