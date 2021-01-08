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
	<div align="center">
		<h1>회원목록</h1>
		<c:forEach var="member" items="${members }">
			<h4 > 
				ID : ${member.memberId }, Pw : ${member.password }, Auth : ${member.memberAuth }
				<input type="button" onclick="location.href='memberUpdateForm.do?memberId=${member.memberId}'" value="수정"> 
				<input type="button" onclick="location.href='memberDelete.do?memberId=${member.memberId}'" value="삭제">
			</h4>
		</c:forEach>
		<br>
		<h3><a href="memberInsertForm.do">회원가입</a></h3>
		<h3><a href="main.do">메인화면</a></h3>
		
	</div>
</body>
</html>