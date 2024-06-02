

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Form
 */
public class Form extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		final String name = "Gopi";
		final String pass = "123";
		PrintWriter out = response.getWriter();
		if(request.getParameter("uname").equals(name)&&request.getParameter("pass").equals(pass)) {
//			response.sendRedirect("index?uname="+name);
//			Cookie ck = new Cookie("uname", name);
//			response.addCookie(ck);
			HttpSession session = request.getSession();
			session.setAttribute("uname", name);
			RequestDispatcher rd = request.getRequestDispatcher("index");
			request.setAttribute("uname",name);
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
			out.print("<h1><font color=red> Invalid Username / password</font></h1>");
//			response.sendRedirect("login.jsp");
		}
	}

}
