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
	<c:if test="${result eq 'fail' }">
		<script type="text/javascript">
			alert("로그인에 실패하였습니다.")
		</script>
	</c:if>
	<div><h1>로그인 화면</h1></div>
	<div>
		<form id="frm" name="frm" action="memberLogin.do" method="post">
			<table border="1">
				<tr>
					<th width="100">회원아이디</th>
					<td>
						<input type="text" id="memberId" name="memberId" size="35">
					</td>
				</tr>
				<tr>
					<th width="100">비밀번호</th>
					<td>
						<input type="password" id="password" name="password" size="35">
					</td>
				</tr>
			</table>
			<p /><p /><p />
			<input type="submit" value="로그인">
		</form>
	</div>
</div>
</body>
</html>