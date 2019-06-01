<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="assets/css/form.css">
<title>EXAME</title>
<s:head/>
</head>
<style>body{background-image: url('assets/img/exame.jpg');background-size: cover;background-repeat: no-repeat;}</style>
<body>
<div class="form-container">
	<h1>CADASTRAR EXAME </h1>
	<s:form action="registerExameAction" class="form-init">
		<s:textfield type="hidden" name="id" value='%{id}'></s:textfield>
		<s:textfield name="nome" type="text" value='%{nome}' label="Nome"></s:textfield>
		<s:select  list="tipos" listKey="id" value='%{tipo}' listValue="nome" name="tipo" label="Tipo"></s:select>
		<s:submit value="Cadastrar"></s:submit>
	</s:form> <br>
	<a href="exame" class="btn btn-primary"> VOLTAR</a>
	<br>
</div>
</body>
</html>