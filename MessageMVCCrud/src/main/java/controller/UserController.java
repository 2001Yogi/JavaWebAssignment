package controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import email_services.Servicesss;
import model.User;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("insert")) {
			User u = new User();
			u.setFname(request.getParameter("fname"));
			u.setLname(request.getParameter("lname"));
			u.setEmail(request.getParameter("email"));
			u.setMobile(Long.parseLong(request.getParameter("mobile")));
			UserDao.insertUser(u);
            response.sendRedirect("checkotp.jsp");
					
	}else if(action.equalsIgnoreCase("verifyotp")) {
		String email = request.getParameter("email");
		boolean flag = UserDao.checkEmail(email);
		if (flag == true) {
			Random r = new Random();
			int num = r.nextInt(999999);
			Servicesss s = new Servicesss();
			s.sendMail(email, num);
			request.setAttribute("email", email);
			request.setAttribute("otp", num);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "account doesn't exist !");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}

}
}
}
