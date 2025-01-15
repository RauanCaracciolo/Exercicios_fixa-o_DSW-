<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Bem vindo, <% out.println( (String) session.getAttribute("user")); %></p>
	<a href="LoginHistoryServlet">Historio de login</a>
	<p><% out.println((String) session.getAttribute("time")); %></p>
	<a href=LogoutServlet>Logout</a>
</body>
</html>