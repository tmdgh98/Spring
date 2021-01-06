<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<div><h1>글쓰기</h1></div>
	<div>
		<form action="borderinput" id="frm" name="frm" method="post">
			<table border="1">
				<tr>
					<th width="50">id</th>
					<td width="200"><input type="text" name="borderId" id="borderId" size="68"></td>
				</tr>
				<tr>
					<th>작성자</th>
					<td><input type="text" name="borderWriter" id="borderWriter" size="68"></td>
				</tr>
				<tr>
					<th>제목</th>
					<td><input type="text" name="borderTitle" id="borderTitle" size="68"></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea rows="10" cols="70" name="borderContent" id="borderContent" ></textarea></td>
				</tr>
			</table>
			<p /><p />
			<input type="submit" value="저장">
		</form>
	</div>
</div>
</body>
</html>