<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<form action="AddTeacher" method="post">
		<table>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="Username" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="Password" /></td>
			</tr>
			<tr>
				<td>Subject:</td>
				<td><input type="text" name="Subject" /></td>
			</tr>
			<tr>
				<td>Std:</td>
				<td><input type="number" name="Std" /></td>
			</tr>
			<tr>
				<td>TeacherId:</td>
				<td><input type="number" name="TeacherID" /></td>
			</tr>
			<tr>
				<td><button  class="btn btn-success"> Save</button></td>
			</tr>
		</table>
	</form>

</body>
</html>