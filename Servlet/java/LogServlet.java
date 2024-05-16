

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class LogServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = "Aravind";
		String pass = "Aravind2@";
		PrintWriter out = response.getWriter();
		if(name.equals(request.getParameter("uname")) && pass.equals(request.getParameter("pwd"))) {
			RequestDispatcher rd = request.getRequestDispatcher("inbox1.jsp");
			request.setAttribute("unmae",name);
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
			rd.include(request, response);
			out.println("<h1><font color = red>Invalid username / password </font></h1>");
		}
	
	}
}
