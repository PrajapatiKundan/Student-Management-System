<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="
		org.studentmanagementsystem.beans.Student
	"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit details</title>
</head>
<body>
	<%
	Student student = (Student) request.getAttribute("student");
	%>
	<fieldset style="width: 25%; margin: 100px auto; border-radius: 5x;">
		<legend>Edit student details</legend>
		<form action="edit" method="post">
			<table>
				<tr>
					<td><label id="stdentName">Student name</label></td>
					<td><input id="stdentName" name="studentName" type="text"
						value=<%=student.getName()%>></td>
				</tr>
				<tr>
					<td><label id="fatherName">Father name</label></td>
					<td><input id="fatherName" name="fatherName" type="text"
						value=<%=student.getFatherName()%>></td>
				</tr>
				<tr>
					<td><label id="city">City</label></td>
					<td><input id="city" name="city" type="text"
						value=<%=student.getCity()%>></td>
				</tr>
				<tr>
					<td><label id="phone">Phone</label></td>
					<td><input id="phone" name="phone" type="text"
						value=<%=student.getPhone()%>></td>
				</tr>
				<tr>
					<td><label id="course">Course</label></td>
					<td><label> <input type="radio" name="course"
							value="Computer Engineering"
							<%=student.getCourse().equals("Computer Engineering") ? "checked" : ""%>>
							Computer Engineering
					</label><br> <label> <input type="radio" name="course"
							value="Mechanical Engineering"
							<%=student.getCourse().equals("Mechanical Engineering") ? "checked" : ""%>>
							Mechanical Engineering
					</label><br> <label> <input type="radio" name="course"
							value="Electrical Engineering"
							<%=student.getCourse().equals("Electrical Engineering") ? "checked" : ""%>>
							Electrical Engineering
					</label><br> <label> <input type="radio" name="course"
							value="Civil Engineering"
							<%=student.getCourse().equals("Civil Engineering") ? "checked" : ""%>>
							Civil Engineering
					</label><br></td>
				</tr>
				<tr>
					<td><button type="submit">Save</button></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>