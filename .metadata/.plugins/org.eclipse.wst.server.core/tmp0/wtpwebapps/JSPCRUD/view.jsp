<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
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
	<h2>User List</h2>
	<button><a href="index.jsp">Back to Home</a></button>

<%
    try {
        String query = "SELECT * FROM record";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            out.println("ID: " + rs.getInt("id") + " | ");
            out.println("Name: " + rs.getString("name") + " | ");
            out.println("Email: " + rs.getString("email") + "<br>");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
</body>
</html>