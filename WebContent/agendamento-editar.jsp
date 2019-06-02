<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="assets/css/form.css">
<title>EDITAR AGENDAMENTO</title>
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
	<h1>EDITAR AGENDAMENTO </h1>
	<s:form action="atualizar-agendamento" class="form-init">
		<s:textfield type="hidden" name="id" value="%{id}"></s:textfield>
		<s:textfield type="hidden" name="cd_funcionario" value="%{cdFuncionario}"></s:textfield>
		<s:textfield value="%{nomeFuncionario}" type="text" readonly="true" disabled="true" label="Nome do Funcionário"></s:textfield>			
		<s:select  list="exames" listKey="id" value='%{cdExame}' listValue="nome" name="cd_exame" label="Exame"></s:select>
		<s:select  list="prestadores" listKey="id" value='%{prestador}' listValue="nome" name="cd_prestador" label="Prestador"></s:select>
		<s:textfield id="dataExame" value="%{dataExame}" name="dt_agenda_exame" type="date" format="dd-MM-yyyy" label="Data do Exame"></s:textfield>	
		<s:textfield id="horaExame" name="dt_agenda_hora" label="Hora do Exame" value="%{horaExame}" ></s:textfield>
		<s:reset value="LIMPAR"></s:reset>
		<s:submit value="CADASTRAR"></s:submit>
	</s:form> <br>
	<s:a href="agendamentos?cd_funcionario=%{cdFuncionario}" class="btn btn-primary">Voltar</s:a>
	<br>
</div>

</body>
</html>