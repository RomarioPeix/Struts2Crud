<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="assets/css/form.css">
<title>FUNCIONÁRIO</title>
<s:head/>
</head>
<style>
body {
	background-image: url('assets/img/rh.jpg');
	background-size: cover;
	background-repeat: no-repeat;
}
</style>
<body>
<div class="form-container">
	<h1>CADASTRAR FUNCIONÁRIO </h1>
	<s:form action="registerAction" class="form-init">
		<s:textfield name="nome" label="Nome"></s:textfield>
		<s:textfield name="sobrenome" label="Sobrenome"></s:textfield>
		<s:select name="cargo" list="{'Gerente Contábil', 'Carpinteiro', 'Chefe de Execução de Obras', 'Agente de Portaria', 'Arquiteto Trainee' , 'Chefe de Serviços de Limpeza', 'Pintor', 'Assistente Comercial','Assistente de Diretoria', 'Pedreiro'}" label="Cargo"></s:select>
		<s:select name="setor" list="{'Administrativo', 'Obras', 'Segurança', 'Projetos', 'Limpeza' , 'Manutenção', 'Comercial', 'Diretoria'}" label="Setor"></s:select>
		<s:select name="sexo" list="{'Masculino', 'Feminino'}" label="Sexo"></s:select>
		<s:textfield name="dataNascimento" type="date" format="dd-MM-yyyy" label="Data de Nascimento"></s:textfield>	
		<s:textfield name="email" label="Email"></s:textfield>
		<s:reset value="LIMPAR"></s:reset>
		<s:submit value="CADASTRAR"></s:submit>
	</s:form> <br>
	<a href="controle" class="btn btn-primary"> VOLTAR</a>
	<br>
</div>
</body>
</html>