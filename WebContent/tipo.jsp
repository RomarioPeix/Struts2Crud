<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="assets/css/form.css">
<link rel="stylesheet" type="text/css" href="assets/css/table.css">
<title>TIPOS DE EXAME</title>
<s:head/>
</head>
<style>
body {
	background-image: url('assets/img/tipo.jpg');
	background-size: cover;
	background-repeat: no-repeat;
}
</style>
<body>
<div class="form-container">
	<a href="cadastrar-tipo" class="btn btn-primary">CADASTRAR TIPO </a>
	<br><br><hr><br>
	<table>
		<thead>
			<tr>
				 <th>Nome</th>
				 <th>Ações</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="tipos" var="tipo">		
				<tr style="margin-top:10px !important;">
					<td><s:property value="#tipo.nome"/></td>
					<td>
						<a class="remove-tipo" title="remover" data-id='<s:property value="#tipo.id"/>'> <img width="16" height="16" src="assets/img/trash.png"> </a>
						<a href="editar-tipo?id=<s:property value="#tipo.id"/>" title="editar"> <img width="16" height="16" src="assets/img/edit.png"> </a>
					</td>
				</tr>
			</s:iterator>
		</tbody>
	</table><br> <br>
	<a href="controle" class="btn btn-primary"> VOLTAR</a>
	<br>
</div>

</body>
<script src="assets/js/jquery.min.js"></script>
<script>
	$(function() {
		$(document).on('click', '.remove-tipo', function() {
			var id = $(this).data('id');
			$.post('remover-tipo', {cd_tipo_exame: id}, function() {
				window.location.reload(true);
			});
		});
	});

</script>
</html>