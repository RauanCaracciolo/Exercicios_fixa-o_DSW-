<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ex02.jsp" method="post">
		<div>
			<label for="n1">Digite um numero:</label>
			<input id="n1" name="n1">
		</div>
		<div>
			<label for="n2">Digite outro numero:</label>
			<input id="n2" name="n2">
		</div>
		<div>
			 <label for="op">Escolha uma operação:</label>
			 <select name="op" id="op">
			 	<option value="pl">+</option>
			 	<option value="ms">-</option>
			  	<option value="mt">*</option>
			  	<option value="div">/</option>
			</select> 
		</div>
		<button type="submit">Calcular</button>
	</form>
	<%
		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");
		String op = request.getParameter("op");
		if(n1 != null && n2 != null && op != null){
			int num1 = Integer.parseInt(n1);
			int num2 = Integer.parseInt(n2);
			
			int result  = 0;
			
			if(op.equals("pl")){
				result = num1+num2;
			}else if(op.equals("ms")){
				result = num1-num2;
			}else if(op.equals("mt")){
				result = num1*num2;
			}else if(op.equals("div") && num2 != 0){
				result = num1/num2;
			}
			out.println("Resultado: " + result);
		}
	%>
</body>
</html>