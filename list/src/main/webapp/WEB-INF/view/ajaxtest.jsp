<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">

	function btn(){
		alert($("#id").val());
		$.ajax({
			url:"/ajaxdata",
			type:"post",
			data:{
				
			},
			success:function(data){
				var html =""
				alert(data.list.length)
				for(var i=0; i<data.list.lengt xgh h; i++){
				var html = html +"<tr>";
				var html = html +"<td>"+data.list[i].id+"</td>";
				var html = html +"<td>"+data.list[i].pw+"</td>";
				var html = html +"</tr>";
				}
				
				$("#data").html(html);
			},
			error:function(){
				alert("실패")
			}
		
		})
	}

</script>
<style type="text/css">

table,tr,th{
	border: 1px solid black;
}
</style>
</head>
<body>
	
	<form action="">
		
		<input type="button" onclick="btn()" value="전송">
	</form>
	
	<table>
		<tr>
			<th>아이디</th>
			<th>내용</th>
		</tr>
		<tbody id="data">
			<tr>
			<th>아이디</th>
			<th>내용</th>
		</tr>
		
		</tbody>
	</table>
</body>
</html>