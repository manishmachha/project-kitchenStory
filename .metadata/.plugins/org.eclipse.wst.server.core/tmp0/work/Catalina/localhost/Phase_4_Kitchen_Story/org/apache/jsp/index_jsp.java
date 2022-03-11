/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.16
 * Generated at: 2022-03-08 10:36:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
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
      out.write("<link rel=\"stylesheet\" href=\"css/indexStyle.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- font awesome -->\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/c26cd2166c.js\"></script>\r\n");
      out.write("<title>Kitchen Story</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".main {\r\n");
      out.write("	background: url(images/lunch.jpg) no-repeat;\r\n");
      out.write("	background-size: cover;\r\n");
      out.write("	height: 100vh;\r\n");
      out.write("	background-position: 50% 50%;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".quote {\r\n");
      out.write("	border-radius: 40px;\r\n");
      out.write("	background: linear-gradient(rgba(0, 0, 0, 0.2), rgba(0, 0, 0, 0.2)),\r\n");
      out.write("		url(images/quote-bg.jpg) no-repeat;\r\n");
      out.write("	background-size: cover;\r\n");
      out.write("	height: 80vh;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<a class=\"navbar-brand\" href=\"#\">Kitchen Story</a>\r\n");
      out.write("			<button class=\"navbar-toggler\" type=\"button\"\r\n");
      out.write("				data-bs-toggle=\"collapse\" data-bs-target=\"#navbarScroll\"\r\n");
      out.write("				aria-controls=\"navbarScroll\" aria-expanded=\"false\"\r\n");
      out.write("				aria-label=\"Toggle navigation\">\r\n");
      out.write("				<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("			</button>\r\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"navbarScroll\">\r\n");
      out.write("				<ul class=\"navbar-nav m-auto my-2 my-lg-0\">\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\">Home</a>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"#trending\">Trending</a>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"#store\">\r\n");
      out.write("							Store </a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Kitchen\r\n");
      out.write("							Story</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Contact</a>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"signup.jsp\">Login/SignUp</a>\r\n");
      out.write("					</li>\r\n");
      out.write("				</ul>\r\n");
      out.write("				<form class=\"d-flex\">\r\n");
      out.write("					<input class=\"px-2 search\" type=\"search\" placeholder=\"Search\"\r\n");
      out.write("						aria-label=\"Search\">\r\n");
      out.write("					<button class=\"btn0\" type=\"submit\">Search</button>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("\r\n");
      out.write("	<section class=\"main\">\r\n");
      out.write("		<div class=\"container py-5\">\r\n");
      out.write("			<div class=\"row py-5\">\r\n");
      out.write("				<div class=\"col-lg-7 pt-5 text-center\">\r\n");
      out.write("					<h1 class=\"pt-5\">Nature Has Always Cared For Us !</h1>\r\n");
      out.write("					<button class=\"btn1 mt-3\">More Tips</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("\r\n");
      out.write("	<section class=\"new\">\r\n");
      out.write("		<div class=\"container pt-5\">\r\n");
      out.write("			<div class=\"row pt-5\">\r\n");
      out.write("				<div class=\"col-lg-7 m-auto\">\r\n");
      out.write("					<div class=\"row text-center\">\r\n");
      out.write("						<div class=\"col-lg-4\">\r\n");
      out.write("							<img src=\"images/burger-vector.png\" width=\"100px\" height=\"100px\"\r\n");
      out.write("								class=\"img-luid\">\r\n");
      out.write("							<h6>TASTY</h6>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-lg-4\">\r\n");
      out.write("							<img src=\"images/brocolli-vector.png\" width=\"100px\"\r\n");
      out.write("								height=\"100px\" class=\"img-luid\">\r\n");
      out.write("							<h6>FRESH</h6>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-lg-4\">\r\n");
      out.write("							<img src=\"images/grapes-vector.png\" width=\"100px\" height=\"100px\"\r\n");
      out.write("								class=\"img-luid\">\r\n");
      out.write("							<h6>NATURAL</h6>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("\r\n");
      out.write("	<section class=\"product\">\r\n");
      out.write("		<div class=\"container py-5\">\r\n");
      out.write("			<div class=\"row py-5\">\r\n");
      out.write("				<div class=\"col-lg-5 m-auto text-center \">\r\n");
      out.write("					<h1 id=\"trending\">What's Trending</h1>\r\n");
      out.write("					<h6 style=\"color: red;\">Be Healthy Kitchen Story</h6>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-lg-3 text-center\">\r\n");
      out.write("					<div class=\"card border-0 bg-light mb-2\">\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<img src=\"images/burger-trending.png\" class=\"img-fluid\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<h6>Burgers</h6>\r\n");
      out.write("					<p>Starting 60/-</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-3 text-center\">\r\n");
      out.write("					<div class=\"card border-0 bg-light mb-2\">\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<img src=\"images/pizza-trending.png\" height=\"500px\"\r\n");
      out.write("								class=\"img-fluid\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<h6>Pizzas</h6>\r\n");
      out.write("					<p>Starting 150/-</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-3 text-center\">\r\n");
      out.write("					<div class=\"card border-0 bg-light mb-2\">\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<img src=\"images/cake-trending.png\" class=\"img-fluid\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<h6>Cakes</h6>\r\n");
      out.write("					<p>Starting 60/-</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-3 text-center\">\r\n");
      out.write("					<div class=\"card border-0 bg-light mb-2\">\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<img src=\"images/noodles-trending.png\" class=\"img-fluid\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<h6>Noodles</h6>\r\n");
      out.write("					<p>Starting 60/-</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col-lg-6 text-center m-auto\">\r\n");
      out.write("						<button class=\"btn1\">Click For More</button>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("	</section>\r\n");
      out.write("\r\n");
      out.write("	<section class=\"about\">\r\n");
      out.write("		<div class=\"container py-5\">\r\n");
      out.write("			<div class=\"row py-5\">\r\n");
      out.write("				<div class=\"col-lg-8 text-center m-auto\">\r\n");
      out.write("					<h1 id=\"aboutUs\">Welcome to Kitchen Story Society</h1>\r\n");
      out.write("					<h6 style=\"color: red;\">One Stop For Quality Food</h6>\r\n");
      out.write("					<br>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col-lg-4\">\r\n");
      out.write("						<div class=\"card border-0 mb-2\">\r\n");
      out.write("							<img src=\"images/about-1.jpg\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<h5>Relation</h5>\r\n");
      out.write("						<p>Food for us comes from our relatives, whether they have\r\n");
      out.write("							wings or fins or roots. That is how we consider food. Food has a\r\n");
      out.write("							culture. It has a history. It has a story. It has relationships.\r\n");
      out.write("						</p>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-lg-4\">\r\n");
      out.write("						<div class=\"card border-0 mb-2\">\r\n");
      out.write("							<img src=\"images/about-2.jpg\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<h5>Love</h5>\r\n");
      out.write("						<p>Food can be very transformational, and it can be more than\r\n");
      out.write("							just about a dish. Thatâs what happened to me when I first went\r\n");
      out.write("							to France. I fell in love. And if you fall in love, well, then\r\n");
      out.write("							everything is easy.</p>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-lg-4\">\r\n");
      out.write("						<div class=\"card border-0 mb-2\">\r\n");
      out.write("							<img src=\"images/about-3.jpg\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<h5>Attention</h5>\r\n");
      out.write("						<p>One of the very nicest things about life is the way we must\r\n");
      out.write("							regularly stop whatever it is we are doing and devote our\r\n");
      out.write("							attention to eating.</p>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-lg-6 text-center m-auto\">\r\n");
      out.write("					<button class=\"btn1\">Shop More</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<section class=\"shop\">\r\n");
      out.write("		<div class=\"container py-5\">\r\n");
      out.write("			<div class=\"row py-5\">\r\n");
      out.write("				<div class=\"col-lg-8 text-center m-auto\">\r\n");
      out.write("					<h1 id=\"store\">Explore Our Store</h1>\r\n");
      out.write("					<h6 style=\"color: red;\">Pick your product from our store</h6>\r\n");
      out.write("					<br>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-lg-3 text-center\">\r\n");
      out.write("					<div class=\"card border-0 bg-light mb-2\">\r\n");
      out.write("						<img src=\"images/bonelessChicken-products.jpg\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<h6>Boneless Chicken</h6>\r\n");
      out.write("					<p>Starting 200/-</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-3 text-center\">\r\n");
      out.write("					<div class=\"card border-0 bg-light mb-2\">\r\n");
      out.write("						<img src=\"images/frenchFries-products.jpg\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<h6>French Fries</h6>\r\n");
      out.write("					<p>Starting 150/-</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-3 text-center\">\r\n");
      out.write("					<div class=\"card border-0 bg-light mb-2\">\r\n");
      out.write("						<img src=\"images/fish-products.jpg\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<h6>Apollo Fish</h6>\r\n");
      out.write("					<p>Starting 250/-</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-3 text-center\">\r\n");
      out.write("					<div class=\"card border-0 bg-light mb-2\">\r\n");
      out.write("						<img src=\"images/biryani-products.jpg\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<h6>Biryani</h6>\r\n");
      out.write("					<p>Starting 300/-</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-3 text-center\">\r\n");
      out.write("					<div class=\"card border-0 bg-light mb-2\">\r\n");
      out.write("						<img src=\"images/biryani-products.jpg\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<h6>Boneless Chicken</h6>\r\n");
      out.write("					<p>Starting 200/-</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-3 text-center\">\r\n");
      out.write("					<div class=\"card border-0 bg-light mb-2\">\r\n");
      out.write("						<img src=\"images/fish-products.jpg\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<h6>French Fries</h6>\r\n");
      out.write("					<p>Starting 150/-</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-3 text-center\">\r\n");
      out.write("					<div class=\"card border-0 bg-light mb-2\">\r\n");
      out.write("						<img src=\"images/frenchFries-products.jpg\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<h6>Apollo Fish</h6>\r\n");
      out.write("					<p>Starting 250/-</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-3 text-center\">\r\n");
      out.write("					<div class=\"card border-0 bg-light mb-2\">\r\n");
      out.write("						<img src=\"images/bonelessChicken-products.jpg\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<h6>Biryani</h6>\r\n");
      out.write("					<p>Starting 300/-</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-3 text-center\">\r\n");
      out.write("					<div class=\"card border-0 bg-light mb-2\">\r\n");
      out.write("						<img src=\"images/bonelessChicken-products.jpg\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<h6>Boneless Chicken</h6>\r\n");
      out.write("					<p>Starting 200/-</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-3 text-center\">\r\n");
      out.write("					<div class=\"card border-0 bg-light mb-2\">\r\n");
      out.write("						<img src=\"images/frenchFries-products.jpg\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<h6>French Fries</h6>\r\n");
      out.write("					<p>Starting 150/-</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-3 text-center\">\r\n");
      out.write("					<div class=\"card border-0 bg-light mb-2\">\r\n");
      out.write("						<img src=\"images/fish-products.jpg\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<h6>Apollo Fish</h6>\r\n");
      out.write("					<p>Starting 250/-</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-3 text-center\">\r\n");
      out.write("					<div class=\"card border-0 bg-light mb-2\">\r\n");
      out.write("						<img src=\"images/biryani-products.jpg\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<h6>Biryani</h6>\r\n");
      out.write("					<p>Starting 300/-</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col-lg-6 text-center m-auto\">\r\n");
      out.write("						<button class=\"btn1\">Click For More</button>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<section class=\"quote\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row py-5\">\r\n");
      out.write("				<div class=\"col-lg-6\">\r\n");
      out.write("					<h1>Unlock Your Potential With Good Nutrition</h1>\r\n");
      out.write("					<h6>Be Healthy kitchen Story</h6>\r\n");
      out.write("					<button class=\"btn1 mt-3\">More From Us</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<section class=\"news\">\r\n");
      out.write("		<div class=\"container py-5\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-lg-9 m-auto text-center\">\r\n");
      out.write("					<h1>Kitchen Story</h1>\r\n");
      out.write("					<h5>One Stop For Quality Food</h5>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row pt-5\">\r\n");
      out.write("				<div class=\"col-lg-11 m-auto\">\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("						<div class=\"col-lg-3 py-3\">\r\n");
      out.write("							<H5 class=\"pb-3\">CUSTOMER CARE</H5>\r\n");
      out.write("							<p>Regular</p>\r\n");
      out.write("							<p>On Time</p>\r\n");
      out.write("							<p>Voice Support</p>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-lg-3 py-3\">\r\n");
      out.write("							<H5 class=\"pb-3\">CUSTOMER CARE</H5>\r\n");
      out.write("							<p>Regular</p>\r\n");
      out.write("							<p>On Time</p>\r\n");
      out.write("							<p>Voice Support</p>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-lg-3 py-3\">\r\n");
      out.write("							<H5 class=\"pb-3\">CUSTOMER CARE</H5>\r\n");
      out.write("							<p>Regular</p>\r\n");
      out.write("							<p>On Time</p>\r\n");
      out.write("							<p>Voice Support</p>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-lg-3 py-3\">\r\n");
      out.write("							<H5 class=\"pb-3\">CUSTOMER CARE</H5>\r\n");
      out.write("							<span> <i class=\"fab fa-facebook\"></i></span> <span> <i\r\n");
      out.write("								class=\"fab fa-instagram\"></i></span> <span> <i\r\n");
      out.write("								class=\"fab fa-twitter\"></i></span> <span> <i\r\n");
      out.write("								class=\"fab fa-google-plus\"></i></span>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<hr>\r\n");
      out.write("			<p class=\"text-center\">Manish Machha Copyright &#169 2021 All\r\n");
      out.write("				rights reserved | Kitchen Story</p>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("		integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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