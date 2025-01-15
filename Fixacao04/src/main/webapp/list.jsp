<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />   
<%@ page import="java.util.List" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	List<String> users = (List<String>) request.getAttribute("users"); 
	List<String> msgs = (List<String>) request.getAttribute("msgs");
	List<String> dates = (List<String>) request.getAttribute("dates");
%>
	<div>
		<table border="1px">
			<thead>
				<tr>
					<th>Nome</th>
					<th>Mensagem</th>
					<th>Date</th>
				</tr>
			</thead>
			<tbody>
			<%				
				if(users != null && msgs != null && dates != null){
					for(int i = 0; i < users.size(); i++){
						out.println("<tr>");
						out.println("<th>" + users.get(i) + "</th>");
						out.println("<th>" + msgs.get(i) + "</th>");
						out.println("<th>" + dates.get(i) + "</th>");
						out.println("</tr>");
					}
				}
			%>
			
			</tbody>
		</table>
	</div>
	<a href="form.jsp">Mandar outra mensagem</a>	
<jsp:include page="footer.jsp" />
</body>
</html>