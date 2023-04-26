<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<table>
		<tr>
			<th>Student name</th>
			<th>Father name</th>
			<th>City</th>
			<th>Phone</th>
			<th>Courses</th>
			<th>Action</th>
		</tr>
		<tr>
			<td>Sachin Tendulkar</td>
			<td>Rameshbhai</td>
			<td>Mumbai</td>
			<td>9876543210</td>
			<td>Arts with Psychology</td>
			<td>
				<button>Edit</button>
				<button>Delete</button>
			</td>
		</tr>
		<tr>
			<td>Sachin Tendulkar</td>
			<td>Rameshbhai</td>
			<td>Mumbai</td>
			<td>9876543210</td>
			<td>Arts with Psychology</td>
			<td>
				<button>Edit</button>
				<button>Delete</button>
			</td>
		</tr>
		<tr>
			<td>Sachin Tendulkar</td>
			<td>Rameshbhai</td>
			<td>Mumbai</td>
			<td>9876543210</td>
			<td>Arts with Psychology</td>
			<td>
				<button>Edit</button>
				<button>Delete</button>
			</td>
		</tr>
		<tr>
			<td>Sachin Tendulkar</td>
			<td>Rameshbhai</td>
			<td>Mumbai</td>
			<td>9876543210</td>
			<td>Arts with Psychology</td>
			<td>
				<button>Edit</button>
				<button>Delete</button>
			</td>
		</tr>
		<tr>
			<td style="border-right: none; border-top: none; padding: 15px;"><button>
					+ Register new student</button></td>
			<td
				style="border-left: none; border-right: none; border-top: none; text-align: right; padding: 15px;"
				colspan="5"><button>&lt; Back</button></td>
		</tr>
	</table>
</body>
</html>