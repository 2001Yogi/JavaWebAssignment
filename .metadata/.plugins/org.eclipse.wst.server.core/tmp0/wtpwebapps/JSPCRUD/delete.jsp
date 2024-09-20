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

    if (id != null) {
        try {
            String query = "DELETE FROM record WHERE id = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setInt(1, Integer.parseInt(id));
            pst.executeUpdate();
            out.println("User deleted successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
%>

<form method="post">
    ID: <input type="text" name="id"><br>
    <input type="submit" value="Delete">
</form>
<button><a href="index.jsp">Back to Home</a></button>
</body>
</html>