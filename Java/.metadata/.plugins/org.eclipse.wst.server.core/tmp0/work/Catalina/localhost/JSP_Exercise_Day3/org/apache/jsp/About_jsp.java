/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.10
 * Generated at: 2024-05-24 05:07:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class About_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/Navbar.jsp", Long.valueOf(1716527186949L));
  }

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

  public boolean getErrorOnELNotFound() {
    return false;
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
      out.write("    ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg bg-transparent\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <a style=\"color:white\" class=\"navbar-brand\" href=\"Welcome.jsp\">Employee Management System</a>\r\n");
      out.write("    <button style=\"background-color:white;\" class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavAltMarkup\" aria-controls=\"navbarNavAltMarkup\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarNavAltMarkup\">\r\n");
      out.write("      <div class=\"navbar-nav\">\r\n");
      out.write("        <a style=\"color:white\"  class=\"nav-link active\" aria-current=\"page\" href=\"Buttons.jsp\">Dashboard</a>\r\n");
      out.write("        <a style=\"color:white\"  class=\"nav-link \" href=\"Insert.jsp\">Insert</a>\r\n");
      out.write("        <a style=\"color:white\"  class=\"nav-link \" href=\"Update.jsp\">Update</a>\r\n");
      out.write("        <a style=\"color:white\"  class=\"nav-link \" href=\"Delete.jsp\">Delete</a>\r\n");
      out.write("        <a style=\"color:white\"  class=\"nav-link \" href=\"Find.jsp\">Find</a>        \r\n");
      out.write("        <a style=\"color:white\"  class=\"nav-link \" href=\"ViewAll.jsp\">View All</a>\r\n");
      out.write("        <a style=\"color:white\"  class=\"nav-link \" href=\"About.jsp\">About Us</a>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("background-image: linear-gradient(#0f0c29,#302b63,#24243e);\r\n");
      out.write("background-repeat:no-repeat;\r\n");
      out.write("background-size: cover;\r\n");
      out.write("background-attachment:fixed;\r\n");
      out.write("}\r\n");
      out.write("#content{\r\n");
      out.write("position: fixed;\r\n");
      out.write("  inset: 0;\r\n");
      out.write("  width: fit-content;\r\n");
      out.write("  height: fit-content;\r\n");
      out.write("  margin: auto;\r\n");
      out.write("}\r\n");
      out.write("p{\r\n");
      out.write("color:white;}\r\n");
      out.write("@keyframes ani{\r\n");
      out.write("	from{\r\n");
      out.write("	opacity:0;\r\n");
      out.write("	}\r\n");
      out.write("	to{\r\n");
      out.write("	opacity:1;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("a{\r\n");
      out.write("text-decoration:none;\r\n");
      out.write("color:white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("background-attachment: fixed;\r\n");
      out.write("background-repeat: no-repeat;\r\n");
      out.write("background-size: cover;\r\n");
      out.write("}\r\n");
      out.write("#img{\r\n");
      out.write("\r\n");
      out.write("width:500px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<p class=\"display-1 text-center\">About us</p>\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<div class=\"col-md-6 align-content-center\">\r\n");
      out.write("<img id=\"img\" src=\"about.jpg\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-6 align-content-center\">\r\n");
      out.write("<p>About Our Employee Management System\r\n");
      out.write("At EMS, we recognize that managing employees efficiently is crucial for organizational success. Our Employee Management System (EMS) is designed to simplify HR processes, enhance productivity, and foster employee satisfaction.\r\n");
      out.write("<br>\r\n");
      out.write("Key Features of Our EMS:\r\n");
      out.write("Streamlined HR Functions: Our EMS acts as a single source of truth, integrating essential HR functions such as recruitment, onboarding, time and attendance tracking, performance management, training, payroll, and benefits administration.\r\n");
      out.write("Automation: Say goodbye to manual paperwork! Our system automates routine tasks, allowing HR professionals to focus on strategic initiatives.\r\n");
      out.write("Analytics-Driven Insights: We harness data analytics to provide actionable insights. From identifying trends to predicting workforce needs, our EMS empowers informed decision-making.\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("Our Commitment:\r\n");
      out.write("At EMS, we are committed to delivering an intuitive, user-friendly EMS that enhances your HR operations. Our dedicated support team ensures a seamless experience for you and your employees.\r\n");
      out.write("\r\n");
      out.write("Join us on this journey toward efficient workforce management!\r\n");
      out.write("<br>\r\n");
      out.write("Feel free to customize the content above to align with your companyâs unique values and mission. If you need further assistance or have specific requirements, donât hesitate to reach out.</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
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