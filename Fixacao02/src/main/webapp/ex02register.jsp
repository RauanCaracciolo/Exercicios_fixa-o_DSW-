<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	String code = (String) request.getAttribute("code");
	String name = (String) request.getAttribute("name");
	String email = (String) request.getAttribute("email");
	String[] courses = (String[]) request.getAttribute("courses");
%>
	<p>Prontuario: <% out.print(code); %></p>
	<p>Nome: <% out.print(name); %></p>
	<p>Email: <% out.print(email); %></p>
	<p>Cursos: </p>
	<%
	for(int i = 0; i < courses.length; i++ ){
		out.println(courses[i]);
	}	
	%>
	
</body>
</html>