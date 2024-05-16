

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginPageServlet
 */
public class LoginPageServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		final String name = "Vigneswaran";
		final String pass = "root";
		
		if(request.getParameter("uname").equals(name) && request.getParameter("pwd").equals(pass)) {
			response.sendRedirect("Welcome.jsp"+"message="+name);
		}
		else {
			response.sendRedirect("WelcomeGuest.jsp");
		}
		
	}

}
