/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-09-20 08:12:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class seller_002dverify_002dotp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1718615868318L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1720175067078L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <title>pillloMart</title>\r\n");
      out.write("    <link rel=\"icon\" href=\"img/favicon.png\">\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    <!-- animate CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("    <!-- owl carousel CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n");
      out.write("    <!-- font awesome CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/all.css\">\r\n");
      out.write("    <!-- flaticon CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/flaticon.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/themify-icons.css\">\r\n");
      out.write("    <!-- font awesome CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\r\n");
      out.write("    <!-- swiper CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/slick.css\">\r\n");
      out.write("    <!-- style CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header class=\"main_menu home_menu\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row align-items-center justify-content-center\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <nav class=\"navbar navbar-expand-lg navbar-light\">\r\n");
      out.write("                        <a class=\"navbar-brand\" href=\"index.jsp\"> <img src=\"img/logo.png\" alt=\"logo\"> </a>\r\n");
      out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("                            data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\r\n");
      out.write("                            aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                            <span class=\"menu_icon\"><i class=\"fas fa-bars\"></i></span>\r\n");
      out.write("                        </button>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"collapse navbar-collapse main-menu-item\" id=\"navbarSupportedContent\">\r\n");
      out.write("                            <ul class=\"navbar-nav\">\r\n");
      out.write("                                <li class=\"nav-item\">\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"index.jsp\">Home</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-item dropdown\">\r\n");
      out.write("                                    <a class=\"nav-link dropdown-toggle\" href=\"\" id=\"navbarDropdown_1\"\r\n");
      out.write("                                        role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                        Registration\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown_1\">\r\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"seller-registration.jsp\">As Seller</a>\r\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"customer-registration.jsp\">As Customer</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-item dropdown\">\r\n");
      out.write("                                    <a class=\"nav-link dropdown-toggle\" href=\"\" id=\"navbarDropdown_3\"\r\n");
      out.write("                                        role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                        Login\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown_2\">\r\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"seller-login.jsp\">As Seller </a>\r\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"customer-login.jsp\">As Customer</a>\r\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"admin-login.jsp\">As Admin</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"hearer_icon d-flex align-items-center\">\r\n");
      out.write("                            <a id=\"search_1\" href=\"javascript:void(0)\"><i class=\"ti-search\"></i></a>\r\n");
      out.write("                            <a href=\"cart.html\">\r\n");
      out.write("                                <i class=\"flaticon-shopping-cart-black-shape\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"search_input\" id=\"search_input_box\">\r\n");
      out.write("            <div class=\"container \">\r\n");
      out.write("                <form class=\"d-flex justify-content-between search-inner\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"search_input\" placeholder=\"Search Here\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn\"></button>\r\n");
      out.write("                    <span class=\"ti-close\" id=\"close_search\" title=\"Close Search\"></span>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- Header part end-->\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<section class=\"breadcrumb_part\">\r\n");
      out.write("	        <div class=\"container\">\r\n");
      out.write("	            <div class=\"row\">\r\n");
      out.write("	                <div class=\"col-lg-12\">\r\n");
      out.write("	                    <div class=\"breadcrumb_iner\">\r\n");
      out.write("	                        <h2>Seller Login</h2> \r\n");
      out.write("	                    </div>\r\n");
      out.write("	                </div>\r\n");
      out.write("	            </div>\r\n");
      out.write("	        </div>\r\n");
      out.write("	</section>\r\n");
      out.write("	\r\n");
      out.write("	<section class=\"login_part section_padding \">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row align-items-center\">\r\n");
      out.write("                <div class=\"col-lg-6 col-md-6\">\r\n");
      out.write("                    <div class=\"login_part_text text-center\">\r\n");
      out.write("                        <div class=\"login_part_text_iner\">\r\n");
      out.write("                            <h2>New to our Shop?</h2>\r\n");
      out.write("                            <p>There are advances being made in science and technology\r\n");
      out.write("                                everyday, and a good example of this is the</p>\r\n");
      out.write("                            <a href=\"#\" class=\"btn_3\">Create an Account</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-6 col-md-6\">\r\n");
      out.write("                    <div class=\"login_part_form\">\r\n");
      out.write("                        <div class=\"login_part_form_iner\">\r\n");
      out.write("                            <h3>Seller Forgot Password</h3>\r\n");
      out.write("                                ");

								String msg = (String)request.getAttribute("msg");
								
      out.write("\r\n");
      out.write("								");
if(msg!=null){ 
      out.write("\r\n");
      out.write("									<h2>");
out.print(msg); 
      out.write("</h2>\r\n");
      out.write("								");
} 
      out.write("\r\n");
      out.write("                            <form class=\"row contact_form\" action=\"SellerController\" method=\"post\" novalidate=\"novalidate\">\r\n");
      out.write("                            	");
String email = (String)request.getAttribute("email"); 
      out.write("\r\n");
      out.write("								");
int otp  = (Integer)request.getAttribute("otp"); 
      out.write("\r\n");
      out.write("                                <input type=\"hidden\" name=\"email\" value=\"");
      out.print(email);
      out.write("\">\r\n");
      out.write("                                <input type=\"hidden\" name=\"otp1\" value=\"");
      out.print(otp);
      out.write("\">\r\n");
      out.write("                                <div class=\"col-md-12 form-group p_star\">\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"name\" name=\"otp2\" placeholder=\"Enter OTP\" onfocus=\"this.placeholder = ''\"\r\n");
      out.write("									onblur=\"this.placeholder = 'Enter OTP'\" >\r\n");
      out.write("                                </div>   \r\n");
      out.write("                                <div class=\"col-md-12 form-group\">\r\n");
      out.write("                                    <button type=\"submit\" value=\"verify\" name= \"action\" class=\"btn_3\">\r\n");
      out.write("                                        Get OTP\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!--::footer_part start::-->\r\n");
      out.write("    <footer class=\"footer_part\">\r\n");
      out.write("        <div class=\"footer_iner\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row justify-content-between align-items-center\">\r\n");
      out.write("                    <div class=\"col-lg-8\">\r\n");
      out.write("                        <div class=\"footer_menu\">\r\n");
      out.write("                            <div class=\"footer_logo\">\r\n");
      out.write("                                <a href=\"index.html\"><img src=\"img/logo.png\" alt=\"#\"></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"footer_menu_item\">\r\n");
      out.write("                                <a href=\"index.html\">Home</a>\r\n");
      out.write("                                <a href=\"about.html\">About</a>\r\n");
      out.write("                                <a href=\"product_list.html\">Products</a>\r\n");
      out.write("                                <a href=\"#\">Pages</a>\r\n");
      out.write("                                <a href=\"blog.html\">Blog</a>\r\n");
      out.write("                                <a href=\"contact.html\">Contact</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4\">\r\n");
      out.write("                        <div class=\"social_icon\">\r\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-google-plus-g\"></i></a>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-linkedin-in\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"copyright_part\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row \">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                        <div class=\"copyright_text\">\r\n");
      out.write("                            <P><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"ti-heart\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\r\n");
      out.write("<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></P>\r\n");
      out.write("                            <div class=\"copyright_link\">\r\n");
      out.write("                                <a href=\"#\">Turms & Conditions</a>\r\n");
      out.write("                                <a href=\"#\">FAQ</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("	</footer>\r\n");
      out.write("    <!--::footer_part end::-->\r\n");
      out.write("\r\n");
      out.write("    <!-- jquery plugins here-->\r\n");
      out.write("    <script src=\"js/jquery-1.12.1.min.js\"></script>\r\n");
      out.write("    <!-- popper js -->\r\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\r\n");
      out.write("    <!-- bootstrap js -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- magnific popup js -->\r\n");
      out.write("    <script src=\"js/jquery.magnific-popup.js\"></script>s\r\n");
      out.write("    <!-- carousel js -->\r\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("    <!-- slick js -->\r\n");
      out.write("    <script src=\"js/slick.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.counterup.min.js\"></script>\r\n");
      out.write("    <script src=\"js/waypoints.min.js\"></script>\r\n");
      out.write("    <script src=\"js/contact.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.ajaxchimp.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.form.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.validate.min.js\"></script>\r\n");
      out.write("    <script src=\"js/mail-script.js\"></script>\r\n");
      out.write("    <!-- custom js -->\r\n");
      out.write("    <script src=\"js/custom.js\"></script>\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
