<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Seja Bem Vindo!</title>
	<link rel="stylesheet" type="text/css" href="assets/css/index.css">
	</head>
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
		window.location.href = "agendar";
	}
	
	function controle() {
		window.location.href = "controle";
	}
</script>
</html>