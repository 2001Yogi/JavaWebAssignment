<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
<title>Student Form</title>
</head>
<body>
	<form action="ValidateServlet" method="post">
		<div class="container" >
			<div class="row mt-5">
				<div class="col-2"></div>
				<div class="col-6">
					<div class="mb-3">
						<label class="form-label">Name:-</label> 
							<input type="text" class="form-control" name="name">
					</div>
					<div class="mb-3">
						<label  class="form-label">Email:-</label> 
							<input type="email" class="form-control" name="email">
					</div>
					<div class="mb-3">
						<label class="form-label">Password:-</label> 
							<input type="password" class="form-control" name="pass">
					</div>
					
					<button type="submit" class="btn btn-primary" name="validate">Submit</button>
				</div>
			</div>
		</div>
	</form>
</body>
</html>