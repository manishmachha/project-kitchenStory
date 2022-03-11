/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.16
 * Generated at: 2022-03-11 06:52:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import com.project.connection.ConnectionProvider;
import java.sql.*;

public final class messageus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.project.connection.ConnectionProvider");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- Created By CodingLab - www.codinglabweb.com -->\r\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<!-- <title> Responsive Contact Us Form  | CodingLab </title>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Fontawesome CDN Link -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/messageus.css\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<section>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"content\">\r\n");
      out.write("			<div class=\"left-side\">\r\n");
      out.write("				<div class=\"address details\">\r\n");
      out.write("					<i class=\"fas fa-map-marker-alt\"></i>\r\n");
      out.write("					<div class=\"topic\">Address</div>\r\n");
      out.write("					<div class=\"text-one\">Surkhet, NP12</div>\r\n");
      out.write("					<div class=\"text-two\">Birendranagar 06</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"phone details\">\r\n");
      out.write("					<i class=\"fas fa-phone-alt\"></i>\r\n");
      out.write("					<div class=\"topic\">Phone</div>\r\n");
      out.write("					<div class=\"text-one\">+0098 9893 5647</div>\r\n");
      out.write("					<div class=\"text-two\">+0096 3434 5678</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"email details\">\r\n");
      out.write("					<i class=\"fas fa-envelope\"></i>\r\n");
      out.write("					<div class=\"topic\">Email</div>\r\n");
      out.write("					<div class=\"text-one\">kitchenstory2344@gmail.com</div>\r\n");
      out.write("					<div class=\"text-two\">kitchenstory2344@gmail.com</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"right-side\">\r\n");
      out.write("				<div class=\"topic-text\">Send us a message</div>\r\n");
      out.write("				<p>If you have any work from me or any types of queries related\r\n");
      out.write("					to my tutorial, you can send me message from here. It's my pleasure\r\n");
      out.write("					to help you.</p>\r\n");
      out.write("				<form action=\"messageusAction.jsp\">\r\n");
      out.write("					<div class=\"input-box\">\r\n");
      out.write("						<input type=\"text\" placeholder=\"Enter your name\" name=\"name\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"input-box\">\r\n");
      out.write("						<input type=\"text\" placeholder=\"Enter your email\" name=\"email\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"input-box message-box\">\r\n");
      out.write("						<textarea rows=\"7\" cols=\"\" placeholder=\"Enter your message\"\r\n");
      out.write("							name=\"message\"></textarea>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"button\">\r\n");
      out.write("						<input type=\"submit\" value=\"Send Now\">\r\n");
      out.write("					</div>\r\n");
      out.write("					");

					String msg = request.getParameter("msg");
					if ("valid".equals(msg)) {
					
      out.write("\r\n");
      out.write("					<h3 style=\"text-align: center; color: black;\">Message\r\n");
      out.write("						successfully sent. Our team will contact you soon!</h3>\r\n");
      out.write("					");

					}
					
      out.write("\r\n");
      out.write("					");

					if ("invalid".equals(msg)) {
					
      out.write("\r\n");
      out.write("					<h3 style=\"text-align: center;\">Some thing Went Wrong! Try\r\n");
      out.write("						Again!</h3>\r\n");
      out.write("					");

					}
					
      out.write("\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	</section>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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