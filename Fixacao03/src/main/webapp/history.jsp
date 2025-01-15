<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% List<String> logins = (List<String>) request.getAttribute("logins");
	if(logins != null){
		for(int i = 0; i< logins.size(); i++){
			out.println(logins.get(i).toString());
		}
	}
%>
</body>
</html>