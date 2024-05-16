

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class LogReqServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String name = "Aravind";
		final String pass = "Aravind2@";
		PrintWriter out = response.getWriter();
		if(request.getParameter("uname").equals(name) && request.getParameter("pwd").equals(pass)) {
			RequestDispatcher rd = request.getRequestDispatcher("dispatcher.jsp");  
			request.setAttribute("uname",name);
			rd.forward(request,response);
			
		}
		else {
			 
			RequestDispatcher rd = request.getRequestDispatcher("Login3.jsp");
			rd.include(request,response);
			out.println("<h1><font color=red> Invaild username/password </font></h1>");
			
		}
	}

}
