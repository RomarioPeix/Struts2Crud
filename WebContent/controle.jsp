<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CONTROLE</title>
</head>
<body>
<section id="controle">

	<div id="funcionario" onclick="funcionario()">Funcionário</div>
	<div id="prestador" onclick="prestador()">Prestador</div>
	<div id="exame" onclick="exame()">Exame</div>
	<div id="tipo_exame" onclick="tipo_exame()">Tipo de Exame</div>

</section>
</body>

<script type="text/javascript">

function funcionario() {
	window.location.href = "funcionario";
}

function prestador() {
	window.location.href = "prestador";
}

function exame() {
	window.location.href = "exame";
}

function tipo_exame() {
	window.location.href = "tipo";
}	
</script>

</html>