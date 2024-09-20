
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
	integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
	integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
	crossorigin="anonymous"></script>
	
</head>
<body>
			
	<form action="UserController" method="post" name="form">
		<div class="container" >
					
						<%
						String msg = (String)request.getAttribute("msg");
						%>
						
						<%if(msg!=null){ %>
							<h2><%out.print(msg); %></h2>
						<%} %>
						
						
		<h1>Confirm Email Please check Your Mail</h1>
			<div class="row mt-5">
				<div class="col-2"></div>
				<div class="col-6">
				<table>
					<%String email = (String)request.getAttribute("email"); %>
					<%int otp  = (Integer)request.getAttribute("otp"); %>
					<tr class="mb-3">
						<td>Enter OTP</td>
						<td><input type = "text" name ="otp2" ></td>
					</tr>
					<tr class="mb-3">
						<td><input type = "Submit" name ="action" value ="verifyotp"></td>
					</tr>
					 
					</table>
				</div>
			</div>
		</div>
	</form>
</body>
</html>