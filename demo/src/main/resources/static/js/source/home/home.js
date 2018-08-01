function hand(event){
	var url = "/scm/demo/index";
	console.log(url);
    $.ajax({
    	type:"POST",
    	url:url,
    	dataType:"json",
    	contentType:"application/json",
    	data:JSON.stringify({"id":"123113"}),
    	success:function(data,status){
    		console.log(status);
    		console.log(data);
    	},
    	error:function(error){
    		console.log(error);
    	}
    	
    });
	
	
	
}
$(function () {
    $("#menu").menu();
    
    $("#btn_add").on("click",hand);
});