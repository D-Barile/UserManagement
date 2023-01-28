<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Form - Aggiorna utente</title>
		<link href="resources/css/style.css" rel="stylesheet" />
	</head>
	<body>
		<div align="center" id="table">
			<form action="${pageContext.request.contextPath}/aggiorna" method="post">
				<table border="1">
					<tr>
						<th>ID</th>
						<td><input type="text" name="id" size="50" readonly="readonly" value="${user.getId()}" /></td>
					</tr>
					<tr>
						<th>Nome</th>
						<td><input type="text" name="nome" size="50" required="required" value="${user.getNome()}" /></td>
					</tr>
					<tr>
						<th>Username</th>
						<td><input type="text" name="username" size="50" required="required" value="${user.getUsername()}" /></td>
					</tr>
					<tr>
						<th>Email</th>
						<td><input type="email" name="email" size="50" required="required" value="${user.getEmail()}"/></td>
					</tr>
				</table>
				<button type="submit">Aggiorna utente</button>
			</form>
		</div>
	</body>
</html>