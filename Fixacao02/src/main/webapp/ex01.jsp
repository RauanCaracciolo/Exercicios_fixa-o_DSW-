<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="FrontController?action=convert" method="post">
		<div>
			<label for="value">Digite um valor:</label>
			<input id="value" name="value">
		</div>
		<div>
			<label for="type">Selecione o tipo que quer converter:</label>
			 <div>
	            <input type="radio" id="celsius" name="type" value="celsius" checked>
	            <label for="vermelho">Celsius</label>
	        </div>
	        <div>
	            <input type="radio" id="fahrenheit" name="type" value="fahrenheit">
	            <label for="azul">Fahrenheit</label>
	        </div>
		</div>
		<button type="submit">Enviar</button>
	</form>
	<p>
	<%
		String resposta = (String) request.getAttribute("response");
	    if(resposta != null){
	    	out.println(resposta);
	    }
	%>
	</p>
</body>
</html>