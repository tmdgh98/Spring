<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Member</title>
</head>
<body>
<div align="center">
${bindingResult }
	<div><h1><spring:message code="title.sample" /></h1></div>
	<div>
		<form id="frm" name="frm" action="memberInsert.do" method="post">
			<table border="1">
				<tr>
					<th width="100">회원아이디</th>
					<td>
						<input type="text" id="memberId" name="memberId" size="35">
						<span class="error"></span>
					</td>
				</tr>
				<tr>
					<th width="100">회원이름</th>
					<td>
						<input type="text" id="memberName" name="memberName" size="35">
					</td>
				</tr>
				<tr>
					<th width="100">비밀번호</th>
					<td>
						<input type="password" id="password" name="password" size="35">
					</td>
				</tr>
				<tr>
					<th width="100">회원권한</th>
					<td>
						<input type="text" id="memberAuth" name="memberAuth" size="35">
					</td>
				</tr>
			</table>
			<input type="submit" value="등록">
			<input type="reset" value="취소">
		</form>
	</div>
</div>
</body>
</html>