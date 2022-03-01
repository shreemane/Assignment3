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
	<form action="AddStudent" method="post">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Standerd:</td>
				<td><input type="number" name="std" /></td>
			</tr>
			<tr>
				<td>RollNO:</td>
				<td><input type="number" name="rollno" /></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><input type="number" name="age" /></td>
			</tr>
			
			<tr>
				<td><button  class="btn btn-success"> Save</button></td>
			</tr>
		</table>
	</form>

</body>
</html>