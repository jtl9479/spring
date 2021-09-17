<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>게시판</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/notice_list.css">
  <style type="text/css">
  #sort{
  	position: absolute;
  	top: 50%;
  	left: 0%;
  }
  </style>
</head>
<body>
<section>
    <h1>NOTICE</h1>
    <div class="wrapper">
      <form action="list" method="post">
      <div>
        <select name="sort" id="sort">
          <option value="">선택하세요</option>
          <option value="soccer">축구</option>
          <option value="basketball">농구</option>
          <option value="baseball">야구</option>
        </select>
       </div>
        <div>
        <select name="category" id="category">
          <option value="all">전체</option>
          <option value="btitle">제목</option>
          <option value="bcontent">내용</option>
        </select>
		</div>
        <div class="title">
          <input type="text" size="16" name="word">
        </div>
  
        <button type="submit"><i class="fas fa-search"></i></button>
      </form>
    </div>

    <table>
      <colgroup>
        <col width="18%">
        <col width="50%">
        <col width="18%">
        <col width="10%">
      </colgroup>
      <!-- 제목부분 -->
      <tr>
        <th>No.</th>
        <th>제목</th>
        <th>종목</th>
        <th>작성일</th>
        <th>조회수</th>
      </tr>
      <!-- 내용부분 -->
      <c:forEach items="${map.list}" var="list">
      <tr>
        <td><span class="table-notice">${list.bid}</span></td>
        <td class="table-title">
        <a href="view?bid=${list.bid}">${list.btitle}</a>
        </td>
        <td>${list.sort}</td>
        <td>${list.bdate}</td>
        <td>${list.bhit}</td>
      </tr>
      </c:forEach>
    </table>

    <ul class="page-num">
      <li class="first"></li>
      <li class="prev"></li>
      <li class="num"><div>1</div></li>
      <li class="next"></li>
      <li class="last"></li>
    </ul>

    <a href="write_view.jsp"><div class="write">쓰기</div></a>
  </section>

</body>
</html>