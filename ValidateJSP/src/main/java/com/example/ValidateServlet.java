package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("index.jsp");
		PrintWriter writer = response.getWriter();
		
		String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Validate First Name (Only alphabets)
        if (!Pattern.matches("^[a-zA-Z]+$", name)) {
        	writer.println("Invalid First Name. Only alphabets are allowed.<br>");
        }

        if (!Pattern.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$", email)) {
        	writer.println("Invalid Email format.<br>");
        }

        // Validate Password (Minimum 1 upper, 1 lower, 1 digit, 1 special character from @, #, $, %, _, &)
        if (!Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%_&]).{6,}$", password)) {
        	writer.println("Invalid Password. It must have at least one uppercase letter, one lowercase letter, one digit, and one special character (@, #, $, %, _, &).<br>");
        }

        // If all validations pass
        if (Pattern.matches("^[a-zA-Z]+$", name) &&
            Pattern.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$", email) &&
            Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%_&]).{6,}$", password)) {
            
        	writer.println("Form submitted successfully!");
        }

        writer.close();

	}
}
