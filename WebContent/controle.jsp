<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="assets/css/form.css">
<title>CONTROLE</title>
</head>
<style>
	body{background-image: url('assets/img/menu-control.jpg');background-size: cover;background-repeat: no-repeat;}
	section{display: flex;}
	h1{padding-top:12%;text-align: center;color: white;}
	div{width: 75%;height: 25vh;cursor: pointer;}
	.container{opacity:.9;padding:5%;margin: 5% 10%;}
	#funcionario{background-color: gray;}
	#prestador{background-color: black;}
	#exame{background-color: black;}
	#tipo_exame{background-color: gray;}
			
</style>
<body>

<div class="container">
	<section>
	
		<div id="funcionario" onclick="funcionario()">
			<h1>FUNCIONÁRIO</h1>
		</div>
		
		<div id="prestador" onclick="prestador()">
			<h1>PRESTADOR</h1>
		</div>
		
	</section>
	<section>
		<div id="exame" onclick="exame()">
			<h1>EXAME</h1>
		</div>
		
		<div id="tipo_exame" onclick="tipo_exame()">
			<h1>TIPO DE EXAME</h1>
		</div>
	
	</section>
	<br>
	<a href="/AgeTechnologyCRUD" class="btn" style="background-color: black;"> VOLTAR</a>
	<br>
</div>
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