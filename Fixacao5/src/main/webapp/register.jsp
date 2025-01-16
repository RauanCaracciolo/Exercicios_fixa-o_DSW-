<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro</title>
</head>
<body>
<form action="Adm?action=register" method="post">
	 <div class="form-group">
	    <label for="email">Nome Completo</label>
	    <input class="form-control" id="completeName" aria-describedby="emailHelp" name="completeName">
	  </div>
	  <div class="form-group">
	    <label for="email">Email</label>
	    <input class="form-control" id="email" aria-describedby="emailHelp" name="email">
	  </div>
	  <div class="form-group">
	    <label for="senha">Senha</label>
	    <input  class="form-control" id="senha" name="senha">
	  </div>
	  <button type="submit" class="btn btn-primary">Cadastrar</button>
	</form>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>