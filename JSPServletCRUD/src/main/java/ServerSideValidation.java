

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class ServerSideValidation
 */
@WebFilter("/ServerSideValidation")
public class ServerSideValidation extends HttpFilter implements Filter {
   
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 
		HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        
	     String email = req.getParameter("email");
	     String password = req.getParameter("password");
	     
	     Pattern emailPattern = Pattern.compile("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$");
	     Pattern passwordPattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$");
	     
	     if (!emailPattern.matcher(email).matches()) {
	            res.sendRedirect("index.jsp?error=Invalid email format");
	            return;
	        }
	     
	     if (!passwordPattern.matcher(password).matches()) {
	            res.sendRedirect("index.jsp?error=Password must contain at least 8 characters, a letter, a number, and a special character");
	            return;
	        }
	     
		chain.doFilter(request, response);
	}

	

}
