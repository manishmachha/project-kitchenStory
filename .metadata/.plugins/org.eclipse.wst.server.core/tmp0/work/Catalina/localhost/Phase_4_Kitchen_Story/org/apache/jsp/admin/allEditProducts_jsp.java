/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.16
 * Generated at: 2022-03-11 08:00:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import com.project.connection.ConnectionProvider;
import java.sql.*;

public final class allEditProducts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/admin/adminHeader.jsp", Long.valueOf(1646985471983L));
  }

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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<!-- Font Family -->\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Lobster&display=swap\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"indexStyle.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- font awesome -->\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/c26cd2166c.js\"></script>\r\n");
      out.write("<title>Kitchen Story | Home</title>\r\n");
      out.write("</head>\r\n");

String email = session.getAttribute("email").toString();

      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg\">\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<a class=\"navbar-brand\" href=\"#\">Kitchen Story</a>\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("			data-bs-target=\"#navbarScroll\" aria-controls=\"navbarScroll\"\r\n");
      out.write("			aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarScroll\">\r\n");
      out.write("			<ul class=\"navbar-nav m-auto my-2 my-lg-0\">\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link active\" href=\"allEditProducts.jsp\">Edit\r\n");
      out.write("						Products</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"messages.jsp\">Messages</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"\">\r\n");
      out.write("						Orders</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("					href=\"\">Delivered</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Cancelled</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" id=\"accName\" href=\"adminHome.jsp\">");
      out.print(email);
      out.write("</a></li>\r\n");
      out.write("				<button class=\"btn0\" type=\"submit\">\r\n");
      out.write("					<a href=\"../logoutAction.jsp\" style=\"color: white; text-decoration: none;\">Logout</a>\r\n");
      out.write("				</button>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>\r\n");
      out.write("<hr style=\"color: rgb(248, 26, 92)\">");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Home</title>\r\n");
      out.write("<style>\r\n");
      out.write("h3\r\n");
      out.write("{\r\n");
      out.write("	color: yellow;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"color: white; text-align: center; font-size: 30px;\">All Products & Edit Products <i class='fab fa-elementor'></i></div>\r\n");

String msg=request.getParameter("msg");
if("yes".equals(msg)){

      out.write("\r\n");
      out.write("<h3 style=\"color: rgb(248, 26, 92)\">Product Successfully Updated!</h3>\r\n");

}

      out.write("\r\n");
      out.write("\r\n");

if("no".equals(msg)){

      out.write("\r\n");
      out.write("<h3 class=\"alert\">Some thing went wrong! Try again!</h3>\r\n");

}

      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("        <thead>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th scope=\"col\">ID</th>\r\n");
      out.write("            <th scope=\"col\">Name</th>\r\n");
      out.write("            <th scope=\"col\">Category</th>\r\n");
      out.write("            <th scope=\"col\"><i class=\"fa fa-inr\"></i> Price</th>\r\n");
      out.write("            <th>Status</th>\r\n");
      out.write("            <th scope=\"col\">Edit <i class='fas fa-pen-fancy'></i></th>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("       		\r\n");
      out.write("       		");
try{
       			Connection con=ConnectionProvider.getCon();
       			Statement st=con.createStatement();
       			ResultSet rs=st.executeQuery("select * from products");
       			while(rs.next()){       			
       		
      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>");
      out.print(rs.getString(1));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString(2));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString(3));
      out.write("</td>\r\n");
      out.write("            <td><i class=\"fa fa-inr\"></i>");
      out.print(rs.getString(4));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString(5));
      out.write("</td>\r\n");
      out.write("            <td><a href=\"editProduct.jsp?id=");
      out.print(rs.getString(1));
      out.write("\">Edit</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("         	");

         	}
       		}
       		catch(Exception e){
       			System.out.println(e);
       		}
         	
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
