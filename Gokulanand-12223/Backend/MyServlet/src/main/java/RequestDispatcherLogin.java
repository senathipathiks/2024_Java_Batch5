

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDispatcher
 */
@WebServlet("RequestDispatcher")
public class RequestDispatcherLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestDispatcherLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final String name = "Gokul Anand";
		final String pwd = "Anand@Ajith";
		PrintWriter out = response.getWriter();
		
		if(request.getParameter("uname").equals(name) && request.getParameter("pswd").equals(pwd))
		{
			RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
			request.setAttribute("uname", name);
			rd.forward(request, response);
		}	
		else
		{
			response.sendRedirect("Guest.jsp");  
			request.getRequestDispatcher("Login.jsp").include(request, response);
			out.println("<center><h3 style=color:red>Invalid User Credentials</h3></center>");	
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
