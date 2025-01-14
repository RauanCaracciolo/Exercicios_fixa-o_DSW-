<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ex01.jsp">
		<div>
			<label for="nome">Nome:</label>
			<input id="nome" name="nome">
		</div>
		<div>
			<label for="email">E-Mail:</label>
			<input id="email" name="email">
		</div>
		<div>
			<label for="ano">Ano de Nascimento:</label>
			<input id="ano" name="ano">
		</div>
		<button type="submit">Enviar</button>
	</form>
	<% 	String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		
		if(nome != null){
			int ano = 2025 - Integer.parseInt(request.getParameter("ano"));
			out.println("Bem vindo, " + nome + "! Seu email é " + email + " e voce tem " + ano + " anos");
		}
	%>
</body>
</html>