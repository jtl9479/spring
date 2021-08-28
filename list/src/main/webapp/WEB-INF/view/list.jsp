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
</head>
<body>
<section>
    <h1>NOTICE</h1>
    <div class="wrapper">
      <form action="/list" name="search" method="post">
        <select name="category" id="category">
          <option value="all">전체</option>
          <option value="title">제목</option>
          <option value="content">내용</option>
        </select>

        <div class="title">
          <input type="text" size="16" name="searchword">
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
        <th>작성일</th>
        <th>조회수</th>
      </tr>
      <!-- 내용부분 -->
      <c:forEach items="${map.list }" var="list">
      <tr>
        <td><span class="table-notice">${list.bid }</span></td>
        <td class="table-title">
        <a href="">${list.btitle}</a>
        </td>
        <td>${list.bdate}</td>
        <td>${list.bhit}</td>
      </tr>
      </c:forEach>
    </table>

    <ul class="page-num">
    <c:if test="${map.pageNum != '1' }">
      <a href="list?page=1"><li class="first"></li></a>
     </c:if>
   
      <c:if test="${map.pageNum > 1 }">
      <a href="list?page=${map.pageNum-1}"><li class="prev"></li></a>
      </c:if>
      <c:forEach begin="${map.startpage }" end="${map.endpage}" var="page">
      <c:if test="${page != map.pageNum }">
      <li class="num" style="background: gray; color: white;"><a href="list?page=${page}&&category=${map.category}&&searchword=${map.searchword}"><div>${page}</div></a></li>
      </c:if>
      <c:if test="${page == map.pageNum }">
      <li class="num"><div>${page}</div></li>
      </c:if>
      </c:forEach>
      
        <c:if test="${map.pageNum < map.MaxPage }">
      	<a href="list?page=${map.pageNum+1}"><li class="next"></li></a>
      	</c:if>
      
      
      <c:if test="${map.pageNum < map.MaxPage }">
      <a href="list?page=${map.MaxPage}"><li class="last"></li></a>
     </c:if>
    </ul>

    <a href="write_view.jsp"><div class="write">쓰기</div></a>
  </section>

</body>
</html>