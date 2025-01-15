<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String user = (String) session.getAttribute("user");
	
	%>
	<form action="RegisterServlet" method="post">
		<div>
			<label for="name">Nome:</label>
			<input id="name" name="name" value="<%= user != null ? user : "" %>">
		</div>
		<div>
			<label for="msg">Mensagem:</label>
			<input id="msg" name="msg">
		</div>
		<button type="submit">Enviar mensagem</button>
	</form>
<jsp:include page="footer.jsp" />
</body>
</html>