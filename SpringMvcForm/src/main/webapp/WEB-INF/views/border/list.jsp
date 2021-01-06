<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>게시판 목록 보기</h1>
<c:forEach var="vo" items="${borderlist }">
	<p>글쓴이 : ${vo.borderWriter} 제목 : ${vo.borderTitle } 작성일 : ${vo.borderDate }</p>
</c:forEach> 
</body>
</html>