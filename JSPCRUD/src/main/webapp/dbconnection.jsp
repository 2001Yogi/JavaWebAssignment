<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
    String url = "jdbc:mysql://localhost:3306/usercrud";
    String username = "root";
    String password = "";  // Replace with your DB password
    Connection conn = null;

    try {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url, username, password);
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
</body>
</html>