<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="
		java.util.List, 
		java.util.ArrayList, 
		org.studentmanagementsystem.beans.Student,
		java.util.Iterator
	"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
<style>
table {
	background-color: white;
	border-radius: 10px;
	margin: 100px auto;
}

th, td {
	padding: 10px;
}

table, td, th {
	border: 1px solid #E6E6E6;
	border-collapse: collapse;
	text-align: center;
}

table th:last-child {
	border: none;
}
</style>
</head>
<body style="background-color: #E6E6E6;">
	<%
	List<Student> students = (ArrayList<Student>) request.getAttribute("students");
	Iterator<Student> iterator = students.iterator();
	%>
	<form action="dashboard" method="post">
		<table>
			<tr>
				<th>Roll number</th>
				<th>Student name</th>
				<th>Father name</th>
				<th>City</th>
				<th>Phone</th>
				<th>Courses</th>
				<th>Action</th>
			</tr>
			<%
			while (iterator.hasNext()) {
			%>
			<%
			Student student = iterator.next();
			%>
			<tr>
				<td><%=student.getRollNumer()%></td>
				<td><%=student.getName()%></td>
				<td><%=student.getFatherName()%></td>
				<td><%=student.getCity()%></td>
				<td><%=student.getPhone()%></td>
				<td><%=student.getCourse()%></td>
				<td>
					<button name="action"
						value=<%="edit:" + Integer.toString(student.getRollNumer())%>
						type="submit">Edit</button>
					<button name="action"
						value=<%="delete:" + Integer.toString(student.getRollNumer())%>
						type="submit">Delete</button>
				</td>
			</tr>
			<%
			}
			%>
			<tr>
				<td style="border-right: none; border-top: none; padding: 15px;"
					colspan="2">
					<button type="submit" name="action" value="register">+
						Register new student</button>
				</td>
			</tr>
		</table>
	</form>
	<h3 style="text-align: center;">
		Total number of students:
		<%=application.getAttribute("totalStudents")%>
	</h3>
</body>
</html>