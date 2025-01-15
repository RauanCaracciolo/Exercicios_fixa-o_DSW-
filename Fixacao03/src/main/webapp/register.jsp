<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="RegisterServlet" method="post">
		<div>
			<label for="name">Nome de usuario:</label>
			<input id="name" name="name">
		</div>
		<div>
			<label for="passowrd">Senha:</label>
			<input id="password" name="password">
		</div>
		<button type="submit">Cadastrar</button>
 	</form>
 	<%
 		String resposta = (String) request.getAttribute("response");
 		if(resposta != null){
 			out.println(resposta);
 		}
 	%>
</body>
</html>