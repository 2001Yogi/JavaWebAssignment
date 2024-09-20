<%@page import="java.sql.PreparedStatement"%>
<%@ include file="dbconnection.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String email = request.getParameter("email");

    if (id != null && name != null && email != null) {
        try {
            String query = "UPDATE record SET name = ?, email = ? WHERE id = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, email);
            pst.setInt(3, Integer.parseInt(id));
            pst.executeUpdate();
            out.println("User updated successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
%>

<form method="post">
    ID: <input type="text" name="id"><br>
    Name: <input type="text" name="name"><br>
    Email: <input type="text" name="email"><br>
    <input type="submit" value="Update">
    
</form>
	<button><a href="index.jsp">Back to Home</a></button>
</body>
</html>