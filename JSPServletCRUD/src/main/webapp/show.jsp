<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student CRUD</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
        <h2>Student List</h2>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Sr No:-</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Mobile</th>
                    <th>Gender</th>
                    <th>Password</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
            </thead>
            <tbody>
            	<%
                    Connection conn = null;
                    PreparedStatement pst = null;
                    ResultSet rs = null;
                    int sNo = 1;

                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspservletcrud", "root", "");
                        String sql = "SELECT * FROM students";
                        pst = conn.prepareStatement(sql);
                        rs = pst.executeQuery();

                        while (rs.next()) {     
                %>
                 <tr>
                    <td><%= sNo++%></td>
                    <td><%= rs.getString("fname") %></td>
                    <td><%= rs.getString("lname") %></td>
                    <td><%= rs.getString("email") %></td>
                    <td><%= rs.getString("mobile") %></td>
                    <td><%= rs.getString("gender") %></td>
                    <td><%= rs.getString("password") %></td>
                    <td>
                        <a href="edit.jsp?id=<%= rs.getInt("id") %>" class="btn btn-warning">Edit</a>
                    </td>
                    <td>
                    	 <form action="StudServlet?action=delete" method="post" style="display:inline;">
                    		<input type="hidden" name="id" value="<%= rs.getInt("id") %>">
                    		<button type="submit" class="btn btn-danger">Delete</button>
                		</form>
                    </td>
                </tr>
                 <%
                       	}
                    }catch (Exception e) {
                            e.printStackTrace();
                    }
                  %>
            </tbody>
        </table>
    </div>
</body>
</html>