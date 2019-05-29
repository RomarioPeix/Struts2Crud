<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tipos de Exame</title>
</head>
<body>

<h1>Cadastrar Tipo de Exame</h1>
<s:form action="registerTipoAction">
	<s:textfield name="nome" label="Nome"></s:textfield>
	<s:submit value="Cadastrar"></s:submit>
</s:form>

</body>
</html>