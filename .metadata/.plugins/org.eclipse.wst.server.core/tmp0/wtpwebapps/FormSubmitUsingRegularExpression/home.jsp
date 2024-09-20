<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Student Information</h2>
    <p>First Name:<%= request.getParameter("fname") %></p>
    <p>Last Name:<%= request.getParameter("lname") %></p>
    <p>Email:<%= request.getParameter("email") %></p>
    <p>Mobile:<%= request.getParameter("mobile") %></p>
    <p>Gender: <%= request.getParameter("gender") %></p>
    <p>Password: <%= request.getParameter("pass") %></p>
</body>
</html>