

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
		
		final String name = "Ponraj";
		final String pass = "Ponraj123";
		
		PrintWriter out = response.getWriter();
		
//		 String redirectURL = "http://localhost:8081/ServletTask/WelcomePage.jsp ? message="+name;
		 
		
		if(request.getParameter("uname").equals(name) && request.getParameter("pwd").equals(pass)) {
			response.sendRedirect("Inbox.jsp?uname="+name);
		} else {
			out.println("Welcome Guest!");
		}
	}

}
