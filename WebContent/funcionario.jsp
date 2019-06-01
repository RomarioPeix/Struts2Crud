<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="assets/css/form.css">
<link rel="stylesheet" type="text/css" href="assets/css/table.css"> 
<title>FUNCIONÁRIO</title>
<s:head/>
</head>
<body>
<div class="form-container">
	<a href="cadastrar-funcionario" class="btn btn-primary"> CADASTRAR FUNCIONÁRIO</a>
	<br><br><hr><br>
	<table>
		<thead>
			<tr>
				 <th>Nome</th>
				 <th>Setor</th>
				 <th>Cargo</th>
				 <th>Sexo</th>
				 <th>Nascimento</th>
				 <th>Ações</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="funcionarios" var="funcionario">		
				<tr style="margin-top:10px !important;">
					<td><s:property value="#funcionario.nome"/> <s:property value="#funcionario.sobrenome"/></td>
					<td><s:property value="#funcionario.setor"/></td>
					<td><s:property value="#funcionario.cargo"/></td>
					<td><s:property value="#funcionario.sexo"/></td>
					<td><s:property value="#funcionario.dataNascimento"/></td>
					<td>
						<a class="remove-funcionario" title="remover" data-id='<s:property value="#funcionario.id"/>'> <img width="16" height="16" src="assets/img/trash.png"> </a>
						<a href="editar-funcionario?id=<s:property value="#funcionario.id"/>" title="editar"> <img width="16" height="16" src="assets/img/edit.png"> </a>
					</td>
				</tr>
			</s:iterator>
		</tbody>
	</table><br> <br>
	<a href=controle class="btn btn-primary"> VOLTAR</a>
	<br>
</div>
</body>
<script src="assets/js/jquery.min.js"></script>
<script>
	$(function() {
		$(document).on('click', '.remove-funcionario', function() {
			var id = $(this).data('id');
			$.post('remover-funcionario', {cd_funcionario: id}, function() {
				window.location.reload(true);
			});
		});
	});

</script>
</html>