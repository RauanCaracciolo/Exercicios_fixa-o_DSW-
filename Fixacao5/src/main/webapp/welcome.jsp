<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Bem vindo!</h1>
<p>
<% String email = (String) session.getAttribute("user");
	out.println(email);
%>
</p>
</body>
</html>