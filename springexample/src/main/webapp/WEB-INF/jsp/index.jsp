<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome Page</title>
</head>
<body>
	<h2>BIENVENIDO</h2>
	<br>
	<form:form action="redirect1" method="post">
		<input type="submit" value="Ir a insertar elemento">
	</form:form>
	<form:form action="redirect2" method="post">
		<input type="submit" value="Ver lista de elementos">
	</form:form>
	
	
</body>
</html>