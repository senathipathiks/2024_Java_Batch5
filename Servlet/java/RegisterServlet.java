

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class RegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String name = "Aravind";
		final String pass = "Aravind2@";
		PrintWriter out = response.getWriter();
		if(request.getParameter("uname").equals(name) && request.getParameter("pwd").equals(pass)) {
			  response.sendRedirect("inbox.jsp?username=" + name); //url rewritting
		}
		else {
			 
			response.sendRedirect("Login1.jsp");
			
		}
		}

	

}
