<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="assets/css/form.css">
<title>PRESTADOR</title>
<s:head/>
</head>
<style>
body {
	background-image: url('assets/img/ps.jpg');
	background-size: cover;
	background-repeat: no-repeat;
}
</style>
<body>
<div class="form-container">
	<h1>CADASTRAR PRESTADOR </h1>
	<s:form action="registerPrestadorAction" class="form-init">
		<s:textfield type="text" name="nome" label="Nome"></s:textfield>
		<s:reset value="LIMPAR"></s:reset>
		<s:submit value="Cadastrar"></s:submit>
	</s:form> <br>
	<a href="controle" class="btn btn-primary"> VOLTAR</a>
	<br>
</div>
</body>
</html>