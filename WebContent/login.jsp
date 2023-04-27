<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Management System</title>
</head>
<body>
	<h1 style="text-align: center;">
		Welcome to the <u>Student Management System</u>
	</h1>

	<fieldset style="width: 20%; margin: 100px auto; border-radius: 5px;">
		<legend>Login for admin</legend>
		<form action="login" method="post" style="margin-bottom: 0px;">
			<table>
				<tr>
					<td><label id="userName">User name</label></td>
					<td><input id="userName" name="userName" type="text"></td>
				</tr>
				<tr>
					<td><label id="password">Password</label></td>
					<td><input id="password" name="password" type="password"></td>
				</tr>
				<tr>
					<td><button type="submit">Login</button></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>