<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AGENDAMENTOS</title>
<link rel="stylesheet" type="text/css" href="assets/css/form.css">
<link rel="stylesheet" type="text/css" href="assets/css/table.css">
</head>
<style>
body{background-image: url('assets/img/agendar.jpg');background-size: cover;background-repeat: no-repeat;}
</style>
<body>
<div class="form-container">
	<h4>AGENDAMENTOS DO FUNCIONÁRIO </h4>
	<hr>
	<s:if test="agendamentos.size() > 0">
	<table>
		<thead>
			<tr>
 				 <th>Exame</th>
 				 <th>Tipo de Exame</th>
  				 <th>Prestador</th> 
 				 <th>Data</th>				
				 <th>Ações</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="agendamentos" var="agendamento">		
				<tr style="margin-top:10px !important;">
					<td><s:property value="#agendamento.exame"/></td>
					<td><s:property value="#agendamento.tipoExame"/></td>
					<td><s:property value="#agendamento.prestador"/></td>														
					<td><s:property value="#agendamento.dataExame"/> <s:property value="#agendamento.horaExame"/></td>				
					<td>
						<a class="remove-agendamento" title="remover" data-id='<s:property value="#agendamento.id"/>'> <img width="16" height="16" src="assets/img/trash.png"> </a>
						<a href="editar-agendamento?id=<s:property value="#agendamento.id"/>" title="editar"> <img width="16" height="16" src="assets/img/edit.png"> </a>
					</td>
				</tr>
			</s:iterator>		
		</tbody>
	</table>
	</s:if>
	<s:else>
		<h1 style="color: red;">Nenhum agendamento cadastrado para o funcionário.</h1>
	</s:else>
	<br> <br>
	<a href="agendar" class="btn btn-primary"> VOLTAR</a>
	<br></div>
</body>
<script src="assets/js/jquery.min.js"></script>
<script>
$(function() {
	$(document).on('click', '.remove-agendamento', function() {
		var id = $(this).data('id');
		$.post('remover-agendamento', {id: id}, function() {
			window.location.reload(true);
		});
	});
});

</script>

</html>