<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Seja Bem Vindo!</title>
</head>
<style>
a {margin: 0; padding: 0;}
body {display: flex; background-color: lightygray; padding: 0; margin: 0; overflow: hidden;}
div {width: 50vw; height: 100vh; padding: 0; margin: 0;-webkit-transition: transform .25s ease-in-out;}
div:hover {cursor: pointer;transform: scale(1.5);font-size: 1.5em;text-shadow: 3px 2px gray;}
h1 {text-align: center; margin-top: 50vh; color: white;}
#controle {background: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url('assets/img/controle.jpg'); background-size: cover;background-repeat: no-repeat; }
#agendar {background: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url('assets/img/agendar.jpg');background-size: cover; background-repeat: no-repeat;}

</style>
<body>
	<div id="agendar" onclick="agendar()">
		<h1>AGENDAR EXAMES</h1>
	</div>
	<div id="controle" onclick="controle()">
		<h1>CONTROLE DO SISTEMA</h1>
	</div>
</body>
<script>
	function agendar() {
		window.location.href = "#1";
	}
	
	function controle() {
		window.location.href = "#2";
	}
</script>
</html>