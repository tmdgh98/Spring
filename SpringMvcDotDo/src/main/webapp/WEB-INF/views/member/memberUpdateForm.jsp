<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Member</title>
</head>
<body>
<div align="center">
	<div><h1>회원 수정 화면</h1></div>
	<div>
		<form id="frm" name="frm" action="memberUpdate.do" method="post">
			<table border="1">
				<tr>
					<th width="100">회원아이디</th>
					<td>
						${member.memberId }
						<input type="hidden" id="memberId" name="memberId" value="${member.memberId }" size="35">
						
					</td>
				</tr>
				<tr>
					<th width="100">회원이름</th>
					<td>
						${member.memberName }
					</td>
				</tr>
				<tr>
					<th width="100">비밀번호</th>
					<td>
						<input type="password" id="password" name="password" value="${member.password }" size="35">
					</td>
				</tr>
				<tr>
					<th width="100">회원권한</th>
					<td>
						<input type="text" id="memberAuth" name="memberAuth" value="${member.memberAuth }" size="35">
					</td>
				</tr>
			</table>
			<input type="submit" value="수정">
			<input type="reset" value="취소">
		</form>
	</div>
</div>
</body>
</html>