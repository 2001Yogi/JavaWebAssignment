<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
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
    String name=request.getParameter("val");  
    if(name==null||name.trim().equals(""))
    {  
    	out.print("<p>Please enter Email!</p>");  
    }
    else
    {  
    	try
    	{  
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/messagemvc","root","");  
    		String sql= "select * from users where email=?";
    		PreparedStatement pst =conn.prepareStatement(sql);  
    		pst.setString(1, name);
    		ResultSet rs=pst.executeQuery();  
      		while(rs.next()) 
      		{      
     			out.println("<p>Email Id Already Used</p>");   
    		}
      		
    		conn.close();  
    	}
    	catch(Exception e)
    	{
    		out.print(e);
    	}  
    }  
    %>  
</body>
</html>