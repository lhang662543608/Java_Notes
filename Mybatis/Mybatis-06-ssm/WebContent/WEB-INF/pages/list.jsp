<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工列表</title>
</head>
<body>
	<table border="1" cellspacing="1" cellpadding="10">
			<tr align="center">
				<td>id</td>
				<td>lastName</td>
				<td>gender</td>
				<td>email</td>
			</tr>
		<c:forEach items="${allEmps}" var="emp">
			<tr align="center" >
				<td>${emp.id}</td>
				<td>${emp.lastName}</td>
				<td>${emp.gender}</td>
				<td>${emp.email}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>