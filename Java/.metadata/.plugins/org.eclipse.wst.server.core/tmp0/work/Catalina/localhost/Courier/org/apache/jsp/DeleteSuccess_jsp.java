/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.10
 * Generated at: 2024-05-24 12:00:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import com.cms.dao.CmsDao;
import java.sql.ResultSet;
import java.util.LinkedList;
import com.cms.bean.User;

public final class DeleteSuccess_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/ViewAll.jsp", Long.valueOf(1716550494458L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.cms.dao.CmsDao");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("com.cms.bean.User");
    _jspx_imports_classes.add("java.util.LinkedList");
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("h1{\r\n");
      out.write("color:white\r\n");
      out.write("}\r\n");
      out.write("body{\r\n");
      out.write("background-image: linear-gradient(#0f0c29,#302b63,#24243e);\r\n");
      out.write("background-repeat:no-repeat;\r\n");
      out.write("background-size: cover;\r\n");
      out.write("height:440px;\r\n");
      out.write("background-attachment: fixed;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#b1:hover,#b2:hover,#b3:hover,#b4:hover,#b5:hover{\r\n");
      out.write("transform:scale(1.01);\r\n");
      out.write("}\r\n");
      out.write("@keyframes ani{\r\n");
      out.write("	from{\r\n");
      out.write("	opacity:0;\r\n");
      out.write("	}\r\n");
      out.write("	to{\r\n");
      out.write("	opacity:1;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("#cont{\r\n");
      out.write("  animation-name: ani;\r\n");
      out.write("  animation-duration: 3s;\r\n");
      out.write("  animation-timing-function: ease;\r\n");
      out.write("  animation-direction: forwards;\r\n");
      out.write("  animation-iteration-count: 1;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<a href=\"Welcome.jsp\" style=\"color:white; text-decoration:none;\"><b>Go Home</b></a>\r\n");
      out.write("<h1 align=\"center\" class=\"display-4 text-center\">User Details</h1>\r\n");
      out.write("<hr>\r\n");
      out.write("<form class=\"container\">\r\n");

CmsDao dao = new CmsDao();
int c=0;
try{
	LinkedList<User> list = dao.viewAll();
	out.println("<center><table border=1 class=table  text-center container table-dark><tr><th>User ID</th><th>User Name</th><th>Courier ID</th><th>User Address</th><th>Destination Address</th><th>Receiver Name</th></tr>");
	for(User e : list){
		out.print("<tr>");
		out.print("<td>"+e.getUid()+"</td><td>"+e.getUname()+"</td><td>"+e.getCid()+"</td><td>"+e.getUadd()+"</td><td>"+e.getDesti()+"</td><td>"+e.getRec_name()+"</td></tr>");
	}
	out.println("</table></center>");
}
catch(Exception e){
	e.printStackTrace();
}
if(c<=0){
	out.println("No Records Found!!!");
}

      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<style>\r\n");
      out.write("h1{\r\n");
      out.write("color:white\r\n");
      out.write("}\r\n");
      out.write("body{\r\n");
      out.write("background-image: linear-gradient(#0f0c29,#302b63,#24243e);\r\n");
      out.write("background-repeat:no-repeat;\r\n");
      out.write("background-size: cover;\r\n");
      out.write("height:440px;\r\n");
      out.write("background-attachment: fixed;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#b1:hover,#b2:hover,#b3:hover,#b4:hover,#b5:hover{\r\n");
      out.write("transform:scale(1.01);\r\n");
      out.write("}\r\n");
      out.write("@keyframes ani{\r\n");
      out.write("	from{\r\n");
      out.write("	opacity:0;\r\n");
      out.write("	}\r\n");
      out.write("	to{\r\n");
      out.write("	opacity:1;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("#cont{\r\n");
      out.write("  animation-name: ani;\r\n");
      out.write("  animation-duration: 3s;\r\n");
      out.write("  animation-timing-function: ease;\r\n");
      out.write("  animation-direction: forwards;\r\n");
      out.write("  animation-iteration-count: 1;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1 align=\"center\" class=\"display-4\"><font color=green>Record Deleted Successfully!!!</font></h1>\r\n");
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
