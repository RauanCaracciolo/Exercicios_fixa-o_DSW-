<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="FrontController?action=relatory&type=jsb"><button>Relatorio de Java Spring</button></a>
	<a href="FrontController?action=relatory&type=kotlin"><button>Relatorio de Kotlin</button></a>
	<a href="FrontController?action=relatory&type=jws"><button>Relatorio de Java REST</button></a>
	<div>
		<table>
			<thead>
				<tr>
					<th>Prontuario</th>
					<th>Nome</th>
					<th>Email</th>
				</tr>
			</thead>
			<tbody>
			<%
				String[] codes = (String[]) request.getAttribute("codes");
				String[] names = (String[]) request.getAttribute("names");
				String[] emails = (String[]) request.getAttribute("emails");
				if(codes != null){
					for(int i = 0; i < codes.length; i++){
						out.println("<tr>");
						out.println("<th>" + codes[i] + "</th>");
						out.println("<th>" + names[i] + "</th>");
						out.println("<th>" + emails[i] + "</th>");
						out.println("</tr>");
					}
				}

		
			%>
			
			
			
			
			</tbody>
		</table>
	</div>
</body>
</html>