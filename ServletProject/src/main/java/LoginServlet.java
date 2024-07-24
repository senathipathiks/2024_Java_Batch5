

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
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public LoginServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		final String name="Supraja";
		final String pass="Admin123";
		PrintWriter out=response.getWriter();
		if(request.getParameter("uname").equals(name)&&request.getParameter("pwd").equals(pass))
		{
			//out.println("Welcome "+name);
			response.sendRedirect("Welcome.jsp?uname="+name);
		}
		else
		{
			//out.println("Check your pass or username");
			response.sendRedirect("login.jsp");
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
