<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register student</title>
</head>
<body>
	<fieldset style="width: 22%; margin: 100px auto; border-radius: 5px;">
		<legend>Register new student</legend>
		<form action="register" method="post">
			<table>
				<tr>
					<td><label id="name">Student name</label></td>
					<td><input id="name" name="name" type="text"></td>
				</tr>
				<tr>
					<td><label id="fatherName">Father name</label></td>
					<td><input id="fatherName" name="fatherName" type="text"></td>
				</tr>
				<tr>
					<td><label id="city">City</label></td>
					<td><input id="city" name="city" type="text"></td>
				</tr>
				<tr>
					<td><label id="phone">Phone</label></td>
					<td><input id="phone" name="phone" type="text"></td>
				</tr>
				<tr>
					<td><label id="course">Course</label></td>
					<td><label><input type="radio" name="course"
							value="Computer Engineering">Computer Engineering</label><br>
						<label><input type="radio" name="course"
							value="Mechanical Engineering">Mechanical Engineering</label><br>
						<label><input type="radio" name="course"
							value="Electrical Engineering">Electrical Engineering</label><br>
						<label><input type="radio" name="course"
							value="Civil Engineering">Civil Engineering</label><br></td>
				</tr>
				<tr>
					<td><button type="submit">+ Register</button></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>