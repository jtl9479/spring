/**
 * 
 */
 
 $(function(){
	
	$("#commentbtn").click(function(){
		$("#commentbtn").val();
		$("#id").val();
		$("#bid").val();
		alert($("#ccontent").val());
		alert("아이디"+$("#id").val());
		alert("번호"+$("#bid").val());
		$.ajax({
			url:"/event/comment",
			type:"post",
			data:{
				"ccontent":$("#ccontent").val(),
				"id":$("#id").val(),
				"bid":$("#bid").val()
			
			},
			success:function(data){
				alert("성공")
				alert(data.eventVo.id)
				alert(data.eventVo.bid)
				alert(data.eventVo.ccontent)
			},
			error:function(){
				alert("에러")
			}
			
		})
	})
	
})