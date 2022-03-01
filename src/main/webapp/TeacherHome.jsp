<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
 <head>
<title>User Management Application</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="<%=request.getContextPath()%>/Student-form.jsp" class="btn btn-success">Add Teacher</a>

<table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Name</th>
                                <th>Std</th>
                                <th>RollNo</th>
                                <th>Age</th>
                                

                            </tr>
                        </thead>
                        <tbody>
							<%
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/StudentteacherData","root","root");

                            Statement statement = con.createStatement();
                            ResultSet rs = statement.executeQuery("select * from StudentData");

				             while (rs.next()) 
				             {  
				                 int ID = rs.getInt("Id");  
				                 String UserName = rs.getString("Name");  
				                 int Password = rs.getInt("std");  
				                 int RollNO = rs.getInt("RollNo");   
				                 int Age = rs.getInt("Age");   
				                 
				                 %>	

				                <tr>
				                <td><%= rs.getInt("Id")  %></td>
				                <td><%= rs.getString("Name") %></td>
				                <td><%= rs.getInt("std") %></td>
				                <td><%= rs.getInt("RollNo") %></td>
				                <td><%= rs.getInt("Std") %></td>
				                <td><%= rs.getInt("Age") %></td>
				                <td><a href="<%=request.getContextPath()%>/EditData.jsp?id=<%=rs.getInt("ID")%>">Edit</a></td>
								<td><a href="<%=request.getContextPath()%>/Delete?id=<%=rs.getInt("ID")%>">Delete</a></td>
								</tr>
				           <% 
				             }  
				               %>
                        </tbody>

                    </table>


</body>
</html>