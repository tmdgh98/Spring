<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${SPRING_SECURITY_LAST_EXCEPTION }
<form action="login.do" method="post">
	id : <input name="memberid"><br>
	password : <input name="password"><br>
	<button>로그인</button>
</form>
</body>
</html>