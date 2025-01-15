<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="FrontController?action=register" method="post">
		<div>
			<label for="code">Prontuario:</label>
			<input id="code" name="code">
		</div>
		<div>
			<label for="name">Nome completo:</label>
			<input id="name" name="name">
		</div>
		<div>
			<label for="email">E-mails:</label>
			<input id="email" name="email">
		</div>
		<div>
			<label for="courses">Cursos:</label>
			<div>
				<label for="">Desenvolvimento de aplicações Web com Java e Spring Boot</label>
				<input type="checkbox" name="courses" value ="jsb" id ="jsb">
			</div>
			<div>
				<label for="">Kotlin para Desenvolvimento de Aplicações Android</label>
				<input type="checkbox" name="courses" value ="kotlin" id ="kotlin">
			</div><div>
				<label for="">Java Web Services: REST e SOAP</label>
				<input type="checkbox" name="courses" value ="jws" id ="jws">
			</div>
		</div>
		<button type="submit">Enviar</button>
	</form>
	<p>
	<%
		String responsen = (String) request.getAttribute("response");
		if(responsen != null){
			out.println(responsen);
		}
	%>
	</p>
</body>
</html>