<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>User Management</title>
		<link href="resources/css/index.css" rel="stylesheet">
	</head>
	<body>
		<div align="center">
			<h1>User Management</h1>
			<h2><a href="form-user.jsp">Aggiungi utente</a></h2>
			<h2><a href="${pageContext.request.contextPath}/home">Lista utenti</a></h2>
		</div>
		<div align="center">
			<table border="1">
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Username</th>
					<th>Email</th>
					<th>Azioni</th>
				</tr>
				<c:forEach var="u" items='<%=request.getAttribute("usersList")%>'>
					<tr align="center">
						<td><c:out value="${u.id}" /></td>
						<td><c:out value="${u.nome}" /></td>
						<td><c:out value="${u.username}" /></td>
						<td><c:out value="${u.email}" /></td>
						<td>
							<a id="left" href="${pageContext.request.contextPath}/aggiorna?id=${u.id}">Aggiorna</a>
							<a id="right" href="${pageContext.request.contextPath}/rimuovi?id=${u.id}">Rimuovi</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</body>
</html>