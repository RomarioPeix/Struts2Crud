<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Nome: <s:property value="nome"/> <s:property value="sobrenome"/></p>
<p>Cargo: <s:property value="cargo"/> </p>
<p>Setor: <s:property value="setor"/> </p>
<p>Data Nascimento: <s:property value="dataNascimento"/> </p>
<p>Email: <s:property value="email"/> </p>
</body>
</html>