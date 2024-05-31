

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		PrintWriter out =  response.getWriter();
		final String name="Vashanth";
		final String pwd = "Tsv@13";
		if(request.getParameter("uname").equals(name)&& request.getParameter("pswd").equals(pwd)) {
//			out.println("Welcome to Servlet "+name);
			request.setAttribute("message", name);
			request.getRequestDispatcher("/Welcome.jsp").forward(request, response);  
		}
		else {
			
			 request.getRequestDispatcher("login.jsp").include(request, response);
			 out.println("<h1 style=color:red> Invalid Login credentials</h1>");
			 
			 }
		
	}

}
