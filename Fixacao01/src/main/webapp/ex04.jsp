<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ex04.jsp">
		<div>
			<label for="input">Digite um numero</label>
			<input name="input" id="input">
		</div>
		<button type="submit">Enviar</button>
	</form>
	<%
		String n = request.getParameter("input");
		if(n!= null){
			int n1 = Integer.parseInt(n);
			out.println("<form>");
			out.println("<thead>");
			out.println("<tr>");
			out.println("<th>Multiplicação</th>");
			out.println("<th>Resultado</th>");
			out.println("</tr>");
			out.println("</thead>");
			out.println("<tbody>");
			for(int i = 1; i<=10; i++){
				int result = n1*i;
				out.println("<tr>");
				out.println("<th>" + n1 + i + "</th>");
				out.println("<th>" + result + "</th>");
				out.println("</tr>");
			}
			out.println("</tbody>");
			out.println("</form>");
		}
	%>
</body>
</html>