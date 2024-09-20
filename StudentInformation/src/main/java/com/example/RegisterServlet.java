package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("index.jsp");
		PrintWriter writer = response.getWriter();
		writer.println("Welcome to Server");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String gender = request.getParameter("gender");
		String password = request.getParameter("pass");
		
		writer.println(" FirstName :- " + fname );
		writer.println(" LastName :- " + lname );
		writer.println(" Email :- " + email );
		writer.println(" Mobile :- " + mobile );
		writer.println(" Gender :- " + gender );
		writer.println(" Password :- " + password );
	}

}
