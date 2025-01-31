<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DataBase Data Using JSTL SQL TAGS</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body>
	<sql:setDataSource driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/user" username="root" password=""
		var="ds"></sql:setDataSource>
	<sql:query dataSource="${ds}" var="rs">select * from student</sql:query>
	<table
		<tr>
				<td>Sr No.</td>
				<td>FirstName</td>
				<td>LastName</td>
				<td>Email</td>
			</tr>
		<c:forEach items="${rs.rows}" var="row">
				<tr>
					<td><c:out value="${row.id}"></c:out></td>
					<td><c:out value="${row.fname}"></c:out></td>
					<td><c:out value="${row.lname}"></c:out></td>
					<td><c:out value="${row.email}"></c:out></td>
				</tr>
			</c:forEach></table>
</body>
</html>