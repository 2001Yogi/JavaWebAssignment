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
    String name = request.getParameter("name");
    String email = request.getParameter("email");

    if (name != null && email != null) {
        try {
            String query = "INSERT INTO record (name, email) VALUES (?, ?)";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, email);
            pst.executeUpdate();
            out.println("User created successfully!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
%>

<form method="post">
    Name: <input type="text" name="name"><br>
    Email: <input type="text" name="email"><br>
    <input type="submit" value="Add">   
</form>
<button><a href="index.jsp">Back to Home</a></button>
</body>
</html>