<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2><a href="list">리스트페이지 이동</a></h2>
<label>로그인</label>
<form action="index" method="post">
<label>아이디</label>
<input type="text" id="id" name="m_id">
<label>비밀번호</label>
<input type="text" id="pw" name="m_pw">
<button>전송</button>
</form>
</body>
</html>