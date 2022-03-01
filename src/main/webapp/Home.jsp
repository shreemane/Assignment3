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
<a href="<%=request.getContextPath()%>/Teacher-form.jsp" class="btn btn-success">Add Teacher</a>

<table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Name</th>
                                <th>Password</th>
                                <th>Subject</th>
                                <th>Standerd</th>
                                <th>TeacherID</th>

                            </tr>
                        </thead>
                        <tbody>
							<%
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/StudentteacherData","root","root");

                            Statement statement = con.createStatement();
                            ResultSet rs = statement.executeQuery("select * from TeacherData");

				             while (rs.next()) 
				             {  
				                 int ID = rs.getInt("Id");  
				                 String UserName = rs.getString("UserName");  
				                 int Password = rs.getInt("password");  
				                 String Subject = rs.getString("Subject");   
				                 int StaffID = rs.getInt("Std");   
				                 String Standerd = rs.getString("TeacherID");
				                 %>	

				                <tr>
				                <td><%= rs.getInt("Id")  %></td>
				                <td><%= rs.getString("UserName") %></td>
				                <td><%= rs.getInt("password") %></td>
				                <td><%= rs.getString("Subject") %></td>
				                <td><%= rs.getInt("Std") %></td>
				                <td><%= rs.getInt("TeacherID") %></td>
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