

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginRequestDispatcherServlet
 */
@WebServlet("/LoginRequestDispatcherServlet")
public class LoginRequestDispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginRequestDispatcherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String name = "Ponraj";
		final String pass = "Ponraj123";
		
		PrintWriter out = response.getWriter();		 
		
		if(request.getParameter("uname").equals(name) && request.getParameter("pwd").equals(pass)) {
			RequestDispatcher rd = request.getRequestDispatcher("WelcomePage.jsp");
			request.setAttribute("uname", name);
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
			out.print("<center><h1><font color=red>Invalid Username / Password</font></h1></center>");
		}
	}

}
