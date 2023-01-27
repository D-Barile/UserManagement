<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Form - Aggiungi utente</title>
		<link href="resources/css/style.css" rel="stylesheet" />
	</head>
	<body>
		<div align="center" id="table">
			<form action="${pageContext.request.contextPath}/aggiungi-utente" method="post">
				<table border="1">
					<tr>
						<th>Nome:</th>
						<td><input type="text" name="nome" size="50" placeholder="Nome" /></td>
					</tr>
					<tr>
						<th>Username:</th>
						<td><input type="text" name="username" size="50" placeholder="Username" /></td>
					</tr>
					<tr>
						<th>Email:</th>
						<td><input type="email" name="email" size="50" placeholder="Email" /></td>
					</tr>
				</table>
				<button type="submit">Salva utente</button>
			</form>
		</div>
	</body>
</html>