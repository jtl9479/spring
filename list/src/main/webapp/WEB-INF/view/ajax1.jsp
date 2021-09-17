<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">

	$(function(){
		$("#btn").click(function(){
			
			var ccomment = $("#ccontent").val();
			var id = $("#id").html();
			
			alert(ccomment);
			$.ajax({
				url:"ajaxpost",//데이터 넘기는곳
				type:"post",
				data:{//디비 넘기는 곳
					"ccoment":$("#ccontent").val(),
					"cid":$("#id").html()
				},
				success:function(data){
					//성공하면 실행
					alert("성공")
					alert(data.coment)
					var html = html +"<tr>";
					var html = html +"<td>"+id+"</td>";
					var html = html +"<td>"+ccomment+"</td>";
					var html = html +"</tr>";
					
					$("#data").prepend(html);
					
				},
				error:function(){
					alert("실패")
				}
			})	
		})
	})
</script>
<style type="text/css">

table,tr,th{
	border: 1px solid black;
}
</style>
</head>
<body>
		<div>
		<h1>작성자 : <span id="id">누굴까</span></h1>
		<label>댓글</label>	
			<input type="text" id="ccontent" >
			<input type="button" id="btn" onclick="btn()" value="전송">
		</div>
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