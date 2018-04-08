<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listado</title>
</head>
<body>
	<h2>LISTADO</h2>
	<br>
	<table border="1">
		<thead>
			<tr>
				<td>ID</td>
				<td>Nombre</td>
				<td>Fecha de cumpleaños</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="tablename" items="${listAllElements}">
				<tr>
					<td><c:out value="${tablename.id}" /></td>
					<td><c:out value="${tablename.name}" /></td>
					<td><c:out value="${tablename.dateOfBirth}" /></td>
					<td><a href="/delete?name=${tablename.name}">Borrar</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>