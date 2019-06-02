<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AGENDAR</title>
<link rel="stylesheet" type="text/css" href="assets/css/form.css">
</head>
<style>
body{background-image: url('assets/img/agendar.jpg');background-size: cover;background-repeat: no-repeat;}
ul > li {border-bottom: 1px solid lightgray; border-top: 1px solid lightgray; padding: 5px; list-style: none;}
ul > li:hover {background-color: lightgray; }
#select_opcao {display: flex;}
#select_opcao img {display: inline-flex; width: 350px; height: 225px; padding: 20px 0px !important;}
</style>
<body>
<div class="form-container">
	<section class="app" id="select_funcionario">
		<h4>SELECIONE UM FUNCIONÁRIO PARA CONTINUAR</h4>
		<ul>
			<s:iterator value="funcionarios" var="funcionario">
				<li data-funcionario-id='<s:property value="#funcionario.id"/>'><s:property value="#funcionario.nome"/></li>
			</s:iterator>
		</ul>
	</section>
	<section class="app" id="select_opcao">
		<div>
			<figure data-opcao="1">
				<figcaption>CONSULTAR AGENDAMENTOS</figcaption>		
				<img src="assets/img/agendar.jpg">
			</figure>	
		</div>
		<div> 
			<figure data-opcao="2">
				<figcaption>NOVO AGENDAMENTO</figcaption>			
				<img src="assets/img/agendar.jpg">
			</figure>	
		</div>
	</section>
	<!-- FLUXO 2 -->
	<section class="app" id="novo_agendamento_exame">
		<h4>AGORA, SELECIONE O EXAME </h4>
		<div> 
			<ul>
				<s:iterator value="exames" var="exame">
					<li data-exame-id='<s:property value="#exame.id"/>'><s:property value="#exame.nome"/></li>
				</s:iterator>
			</ul>
		</div>
	</section>
		<section class="app" id="novo_agendamento_prestador">
		<h4>PERFEITO, VAMOS AGORA SELECIONAR UM PRESTADOR </h4>
		<div> 
			<ul>
				<s:iterator value="prestadores" var="prestador">
					<li data-prestador-id='<s:property value="#prestador.id"/>'><s:property value="#prestador.nome"/></li>
				</s:iterator>
			</ul>
		</div>
	</section>
	<section class="app" id="novo_agendamento_data_hora">
		<h4>QUASE LÁ, ESCOLHA UMA DATA E HORA </h4>
		<div>
			<label id="data_label"></label>
			<s:textfield id="data" type="date" format="dd-MM-yyyy" label="Data"></s:textfield>
			<label id="hora_label"></label>			
			<s:textfield name="hora" id="hora" label="Hora"></s:textfield>
			<button id="confirma_agendamento" class="btn">FINALIZAR</button>
		</div>
	</section>
	<section class="app" id="finaliza_agendamento">
		<h4 id="loading-finaliza"></h4>
	</section>
	
	<br>
	<button class="btn btn-primary" id="reset">Voltar ao Ínicio</button>
	<br>
	<br>
	
	<a href="/AgeTechnologyCRUD" class="btn btn-primary">Voltar</a>

	
</div>
</body>
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/jquery.mask.js"></script>
<script src="assets/js/main.js"></script>
</html>