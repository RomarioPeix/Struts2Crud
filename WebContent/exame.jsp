<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="assets/css/form.css">
<link rel="stylesheet" type="text/css" href="assets/css/table.css">
<title>EXAME</title>
<s:head/>
</head>
<style>body{background-image: url('assets/img/exame.jpg');background-size: cover;background-repeat: no-repeat;}</style>
<body>
	<div class="form-container">
		<a href="cadastrar-exame" class="btn btn-primary">CADASTRAR EXAME </a>
		<br><br><hr><br>
		<table>
			<thead>
				<tr>
					 <th>Nome</th>
	 				 <th>Tipo</th>				
					 <th>Ações</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="exames" var="exame">		
					<tr style="margin-top:10px !important;">
						<td><s:property value="#exame.nome"/></td>
						<td><s:property value="#exame.tipo"/></td>				
						<td>
							<a class="remove-exame" title="remover" data-id='<s:property value="#exame.id"/>'> <img width="16" height="16" src="assets/img/trash.png"> </a>
							<a href="editar-exame?id=<s:property value="#exame.id"/>" title="editar"> <img width="16" height="16" src="assets/img/edit.png"> </a>
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
		$(document).on('click', '.remove-exame', function() {
			var id = $(this).data('id');
			$.post('remover-exame', {cd_exame: id}, function() {
				window.location.reload(true);
			});
		});
	});

</script>
</html>