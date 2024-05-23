

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LogServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final String name="Shalini";
		final String pass="Sha123";
		PrintWriter out=response.getWriter();
		if(request.getParameter("uname").equals(name)&&request.getParameter("pwd").equals(pass))
		{
			//Cookie ck=new Cookie("uname",name);
			//esponse.addCookie(ck);
			HttpSession session= request.getSession();
			session.setAttribute("uname",name);
			RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");
			//response.sendRedirect("Welcome.jsp?uname="+name);
			rd.forward(request, response);
		}
		else
		{
			//response.sendRedirect("Log.jsp");
		}
	}

}
