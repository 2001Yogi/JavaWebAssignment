<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Message MVC</title>
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
	
	<script>
	function check_fname(){
		var f = document.form.fname.value;
		var reg = /^[A-Za-z]+$/;
		if(f.trim()==""){
			document.getElementById("errorfname").innerHTML="Please enter your First name";
		}
		else if(!reg.test(f)){
			document.getElementById("errorfname").innerHTML="Please enter only Alphabet";
			
		}else{
			document.getElementById("errorfname").innerHTML="";
		}
	}
	
	function check_lname(){
		var f = document.form.lname.value;
		var reg = /^[A-Za-z]+$/;
		if(f.trim()==""){
			document.getElementById("errorlname").innerHTML="Please enter your Last name";
		}
		else if(!reg.test(f)){
			document.getElementById("errorlname").innerHTML="Please enter only Alphabet";
			
		}else{
			document.getElementById("errorlname").innerHTML="";
		}
	}
	
	function check_email(){
		var f = document.form.email.value;
		var reg = /^[A-Za-z]+$/;
		if(f.trim()==""){
			document.getElementById("erroremail").innerHTML="Please enter your email";
		}
		else if(!reg.test(f)){
			document.getElementById("erroremail").innerHTML="";
			
		}else{
			document.getElementById("erroremail").innerHTML="";
		}
	}
	
	function check_mobile(){
		var f = document.form.mobile.value;
		var reg = /^[0-9]+$/;
		if(f.trim()==""){
			document.getElementById("errormobile").innerHTML="Please enter your contact";
		}
		else if(!reg.test(f)){
			document.getElementById("errormobile").innerHTML="Please enter only Numeric";
			
		}else{
			document.getElementById("errormobile").innerHTML="";
		} 
	}

</script>
	
</head>
<body>
	<script>  
	var request=new XMLHttpRequest(); 
	function searchInfo(){
		var name=document.form.email.value; 
		var url="AjaxValidate.jsp?val="+name;
		try{  
			request.onreadystatechange=function()
			{  
				if(request.readyState==4)
				{  
					var val=request.responseText;  
					document.getElementById('tops').innerHTML=val;  
				}  
			}  
			request.open("GET",url,true);  
			request.send();  
		}
	  	catch(e)
	  	{
	  		alert("Unable to connect to server");
	  	}  
	}
	</script>
	<form action="UserController" method="post" name="form">
		<div class="container" >
		<h1>User Registration Form</h1>
			<div class="row mt-5">
				<div class="col-2"></div>
				<div class="col-6">
				<table>
					<tr class="mb-3">
						<td>Firstname</td>
						<td><input type = "text" name ="fname" onblur="check_fname();"></td>
						<td><span id="errorfname" style="color:red;"></span></td>
					</tr>
					<tr class="mb-3">
						<td>Lastname</td>
						<td><input type = "text" name ="lname" onblur="check_lname();"></td>
						<td><span id="errorlname" style="color:red;"></span></td>
					</tr>
					<tr class="mb-3">
						<td>Email</td>
						<td><input type = "text" name ="email" onblur="searchInfo()" onblur="check_email();"></td>
						<td><span id="tops" style="color:red;"></span> </td>
						<td><span id="erroremail" style="color:red;"></span></td>
					</tr>
					<tr class="mb-3">
						<td>Mobile </td>
						<td><input type = "text" name ="mobile"></td>
						 <td><span id="errormobile" style="color:red;"></span></td> 
					</tr>
					<tr class="mb-3">
						<td><input type = "Submit" name ="action" value ="Insert"></td>
					</tr>
					
					</table>
				</div>
			</div>
		</div>
	</form>
</body>
</html>