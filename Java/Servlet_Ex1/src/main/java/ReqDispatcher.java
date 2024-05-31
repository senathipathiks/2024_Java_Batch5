

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ReqDispatcher
 */
public class ReqDispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReqDispatcher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String name = "Nagarjun";
		final String pass="123";
		PrintWriter out = response.getWriter();
		
		if(request.getParameter("user").equals(name) && request.getParameter("pass").equals(pass)) {
				RequestDispatcher rd = request.getRequestDispatcher("WelcomeUserReqDis.jsp");
				request.setAttribute("name", name);
				rd.forward(request, response);
			}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("WelcomeGuestReqDis.jsp");
			rd.include(request, response);
			out.println("<h1 font color=red>Invalid Username/Password</h1>");
		}
	}
	
}
