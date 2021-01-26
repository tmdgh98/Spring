<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>사원등록</h3>
<form:form modelAttribute="empVo" action="insUpdEmp" method="post" encType="multipart/form-data">
	파일업로드 <input type="file" name="uploadfile"><br>
	사원번호 <form:input path="employeeId"/><br>
	이름 <form:input path="firstName"/><br>
	이름 <form:input path="lastName"/><br>
	이메일 <form:input path="email"/><br>
	입사일 <form:input path="hireDate"/><br>
	직무 <%-- <form:input path="jobId"/> --%>
		<form:radiobuttons path="jobId" items="${jobList }" itemValue="jobId" itemLabel="jobTitle"/> <br>
	부서번호 <form:select path="departmentId" 
			items="${deptList}" itemLabel="departmentName" itemValue="departmentId"/><br>
	<form:button>등록</form:button>
</form:form>


</body>
</html>