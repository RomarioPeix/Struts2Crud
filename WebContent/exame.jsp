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
		<s:textfield name="nome" type="text" label="Nome"></s:textfield>
		<s:select name="cargo" list="{'Periódico', 'Admissional', 'Retorno ao Trabalho', 
			'Mudança de Função', 'Demissional', 'Especial', 'Consulta', 
			'Retorno da Consulta','Acidente', 'Licença Médica', 'Terceiros'}" label="Cargo"></s:select>
		<s:reset value="LIMPAR"></s:reset>
		<s:submit value="Cadastrar"></s:submit>
	</s:form> <br>
	<a href="controle" class="btn btn-primary"> VOLTAR</a>
	<br>
</div>
</body>
</html>