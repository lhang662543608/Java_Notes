<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>AAA PAGE</h3>
	<!-- 在a.jsp中包含b.jsp -->
<%-- 
	<%@ include file="b.jsp"%>
	<jsp:forward page="/include2/b.jsp">
		<jsp:param value="lhang" name="username"/>
	</jsp:forward>
--%>
	<jsp:include page="b.jsp">
		<jsp:param value="123" name="username"/>
	</jsp:include>
</body>
</html>