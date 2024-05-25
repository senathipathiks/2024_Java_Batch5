

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginMessageServlet
 */
@WebServlet("/LoginMessageServlet")
public class LoginMessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		final String name = "rkk";
		final String pass = "123";
		
		if(request.getParameter("uname").equals(name) && request.getParameter("upwd").equals(pass)){
 
			response.sendRedirect("WelcomeUser.jsp?message=" + name);  
 
		}
		else {
			response.sendRedirect("WelcomeGuest.jsp?message=" + "Guest"); 
		}
	}

}
