package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(name = "MyServlet1", urlPatterns = { "/myServlet1" })
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		String configvalue = config.getInitParameter("username");
		response.setContentType("index.jsp");
		PrintWriter writer = response.getWriter();
		writer.print("The InitParameter value is:- ");
		writer.print(configvalue);
		writer.close();
	}

}
