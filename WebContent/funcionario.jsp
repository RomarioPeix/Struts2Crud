<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="assets/css/funcionario.css">
<title>Funcionário</title>
</head>
<body>
<h1>Cadastrar Novo Funcionário</h1>
<s:form action="RegisterAction">
	<s:textfield name="nome" label="Nome"></s:textfield>
	<s:textfield name="sobreNome" label="Sobrenome"></s:textfield>
	<s:radio name="cargo" list="{'Gerente Contábil', 'Carpinteiro', 'Chefe de Execução de Obras', 'Agente de Portaria', 'Arquiteto Trainee' , 'Chefe de Serviços de Limpeza', 'Pintor', 'Assistente Comercial','Assistente de Diretoria', 'Pedreiro'}" label="Cargo"></s:radio>
	<s:radio name="setor" list="{'Administrativo', 'Obras', 'Segurança', 'Projetos', 'Limpeza' , 'Manutenção', 'Comercial', 'Diretoria'}" label="Setor"></s:radio>
	<s:radio name="sexo" list="{'Masculino', 'Feminino'}" label="Sexo"></s:radio>
	<s:textfield name="date" type="date" format="dd-MM-yyyy" label="Data de Nascimento"></s:textfield>	
	<s:textfield name="email" label="Email"></s:textfield>
	<s:submit value="Cadastrar"></s:submit>
</s:form>

</body>
</html>