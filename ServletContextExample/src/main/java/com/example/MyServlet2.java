package com.example;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet2
 */
@WebServlet(name = "MyServlet2", urlPatterns = { "/myServlet2" })
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("index.jsp");
		PrintWriter writer = response.getWriter();
		ServletContext context = getServletContext();
		String contextValue = context.getInitParameter("username");
		
		writer.print("The Context Parameter value is:- ");
		writer.print(contextValue);
		writer.close();
		
	}

}
