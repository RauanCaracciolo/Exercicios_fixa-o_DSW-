<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ex03.jsp">
		<div>
			<label for="input">Digite uma palavra:</label>
			<input id="input" name="input">
		</div>
		<button type="submit">Enviar</button>
	</form>
	<%
		String word = request.getParameter("input");
		if(word != null){
			if(checaPalindromo(word)){
				out.println("Palindromo");
			}else{
				out.println("Nao é palindromo");
			}
		}
		public static boolean checaPalindromo(String palavra){
			String normal = palavra.toLowerCase();
			int left = 0;
			int right = normal.length() - 1;
			 while(left < right){
				if(normal.charAt(esquerda) != normal.charAt(right)){
					return false;
				}
				left++;
				right--;
			}
			return true;
		}
	%>
</body>
</html>