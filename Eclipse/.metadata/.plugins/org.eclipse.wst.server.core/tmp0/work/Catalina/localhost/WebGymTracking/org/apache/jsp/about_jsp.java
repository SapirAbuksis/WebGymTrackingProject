/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.13
 * Generated at: 2019-03-09 17:04:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hit.model.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("com.hit.model");
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
      response.setContentType("text/html; charset=windows-1255");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"js/view/jquery/jquery-3.3.1.slim.min.js\"></script>\r\n");
      out.write("  <script src=\"js/view/popper/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"js/view/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("  ");
      com.hit.wp.model.BGBean bg = null;
      synchronized (session) {
        bg = (com.hit.wp.model.BGBean) _jspx_page_context.getAttribute("bg", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (bg == null){
          bg = new com.hit.wp.model.BGBean();
          _jspx_page_context.setAttribute("bg", bg, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("bg"), request);
      out.write("\r\n");
      out.write("  <title>About</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body style=\"background: rgb(");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.hit.wp.model.BGBean)_jspx_page_context.findAttribute("bg")).getR())));
      out.write(",\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.hit.wp.model.BGBean)_jspx_page_context.findAttribute("bg")).getG())));
      out.write(",\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.hit.wp.model.BGBean)_jspx_page_context.findAttribute("bg")).getP())));
      out.write(")\">\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-dark bg-dark\">\r\n");
      out.write("\t<img src=\"icon/navbarIcon.svg\" width=\"30\" height=\"30\" class=\"d-inline-block align-top\" alt=\"\"><h3 style=\"color:white;\">GymTracking</h3>\r\n");
      out.write("  \t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"true\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    \t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  \t</button>\r\n");
      out.write("  \t<div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("   \t\t<ul class=\"navbar-nav\">\r\n");
      out.write("      \t\t<li class=\"nav-item active\">\r\n");
      out.write("        \t\t<a class=\"nav-link\" href=\"userMain.jsp\">Home<span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("      \t\t</li>\r\n");
      out.write("      \t\t<li class=\"nav-item\">\r\n");
      out.write("        \t\t<a class=\"nav-link\" href=\"userActivities.jsp\">MyActivity</a>\r\n");
      out.write("      \t\t</li>\r\n");
      out.write("      \t\t<li class=\"nav-item\">\r\n");
      out.write("        \t\t<a class=\"nav-link\" href=\"search.jsp\">Search</a>\r\n");
      out.write("      \t\t</li>\r\n");
      out.write("      \t\t<li class=\"nav-item\">\r\n");
      out.write("       \t\t\t<a class=\"nav-link\" href=\"about.jsp\">About</a>\r\n");
      out.write("      \t\t</li>\r\n");
      out.write("      \t\t<li class=\"nav-item dropdown\">\r\n");
      out.write("        \t\t<a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("          \t\t");
User user = (User)session.getAttribute("loginUser");
          		out.println(user.getUserName()); 
      out.write("\r\n");
      out.write("        \t\t</a>\r\n");
      out.write("        \t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\r\n");
      out.write("          \t\t<a class=\"dropdown-item\" href=\"updateUser.jsp\">Update User</a>\r\n");
      out.write("          \t\t<a class=\"dropdown-item\" href=\"updateWeightAndHeight.jsp\">Update Weight And Height</a>\r\n");
      out.write("          \t\t<a class=\"dropdown-item\" href=\"updatePassword.jsp\">Update Password</a>\r\n");
      out.write("        \t\t</div>\r\n");
      out.write("      \t\t</li>\r\n");
      out.write("      \t\t<li class=\"nav-item\">\r\n");
      out.write("        \t\t<form action=\"/WebGymTracking/GymTrackingController\" method=\"get\">\r\n");
      out.write("            \t<input type=\"hidden\" name=\"command\" value=\"logout\" >\r\n");
      out.write("            \t<input class=\"btn btn-danger\" type=\"submit\" value=\"logout\">\r\n");
      out.write("        \t\t</form>\r\n");
      out.write("      \t\t</li>\r\n");
      out.write("    \t</ul>\r\n");
      out.write("  \t</div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("\t<img class=\"mb-4\" src=\"icon/iconAbout.svg\" alt=\"\" width=\"72\" height=\"72\"><br>\r\n");
      out.write("\t<h3>This page created and desinged by : </h3>\r\n");
      out.write("\t<br><h5>&#169;<a class=\"btn btn-link\" href=\"https://www.linkedin.com/in/sapir-abuksis/\" role=\"button\">Sapir Abukasis</a> &#38; \r\n");
      out.write("\t<a class=\"btn btn-link\" href=\"https://www.linkedin.com/in/alexey-shpigelman/\" role=\"button\">Alexey Shpigelman</a></h5>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<a href=\"userMain.jsp\" class=\"badge badge-info\">Back To Main</a>\r\n");
      out.write("</div>\r\n");
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
