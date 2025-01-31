package com;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudServlet
 */
@WebServlet("/StudServlet")
public class StudServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;   
	
	public static Connection createConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspservletcrud", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action == null || action.equals("add")) {
			String fname = request.getParameter("fname");
	        String lname = request.getParameter("lname");
	        String email = request.getParameter("email");
	        String mobile = request.getParameter("mobile");
	        String gender = request.getParameter("gender");
	        String password = request.getParameter("password");
	        
	        try {
	        	Connection conn = createConnection();
	        	String sql = "INSERT INTO students(fname, lname, email, mobile, gender, password) VALUES (?, ?, ?, ?, ?, ?)";
	        	PreparedStatement pst = conn.prepareStatement(sql);
	        	 pst.setString(1, fname);
	             pst.setString(2, lname);
	             pst.setString(3, email);
	             pst.setString(4, mobile);
	             pst.setString(5, gender);
	             pst.setString(6, password);
	             pst.executeUpdate();
	             response.sendRedirect("show.jsp");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}if(action.equals("edit")) {
			int id = Integer.parseInt(request.getParameter("id"));
	        String fname = request.getParameter("fname");
	        String lname = request.getParameter("lname");
	        String email = request.getParameter("email");
	        String mobile = request.getParameter("mobile");
	        String gender = request.getParameter("gender");
	        String password = request.getParameter("password");
	        
	        try {
	        	Connection conn = createConnection();
	        	String sql = "UPDATE students SET fname=?, lname=?, email=?, mobile=?, gender=?, password=? WHERE id=?";
	        	PreparedStatement pst = conn.prepareStatement(sql);
	        	pst.setString(1, fname);
	            pst.setString(2, lname);
	            pst.setString(3, email);
	            pst.setString(4, mobile);
	            pst.setString(5, gender);
	            pst.setString(6, password);
	            pst.setInt(7, id);
	            pst.executeUpdate();
	            response.sendRedirect("show.jsp");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}else if (action.equals("delete")) {
			int id = Integer.parseInt(request.getParameter("id"));
			try {
	        	Connection conn = createConnection();
	        	String sql1 = "INSERT INTO deleted_data SELECT * FROM students WHERE id=?";
	        	PreparedStatement pst1 = conn.prepareStatement(sql1);
	            pst1.setInt(1, id);
	            pst1.executeUpdate();
	            response.sendRedirect("show.jsp");
	            
	            String sql2 = "DELETE FROM students WHERE id=?";
	            PreparedStatement pst2 = conn.prepareStatement(sql2);
	            pst2.setInt(1, id);
	            pst2.executeUpdate();
	            conn.close();
	            response.sendRedirect("show.jsp");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
