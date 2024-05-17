

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		final String name = "Gokul Anand";
//		final String pwd = "Anand@Ajith";
//		
//		PrintWriter out = response.getWriter();
//		
//		if(request.getParameter("uname").equals(name) && request.getParameter("pswd").equals(pwd))
//		{
//			out.println("Welcome" + name);
//		}
//		else
//		{
//			out.println("Welcome Guest");
//		}
		
		
//		final String name = "Gokul Anand";
//		final String pwd = "Anand@Ajith";
//		
//		PrintWriter out = response.getWriter();
//		
//		if(request.getParameter("uname").equals(name) && request.getParameter("pswd").equals(pwd))
//		{
//			response.sendRedirect("Welcome.jsp?uname=" + name);
//		}
//		else 
//		{
//			response.sendRedirect("Login.jsp");
//		}
	}

}
