

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginRequestDispatcherServlet
 */
public class LoginRequestDispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginRequestDispatcherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = "subash";
		String pass = "123456";
		PrintWriter out = response.getWriter();
		
		if (request.getParameter("uname").equals(name) && request.getParameter("pwd").equals(pass)) {
			out.println("Welcome" + name);
			RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
			request.setAttribute("uname",name);
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
			out.println("<center><h1><font color=red>Invalid username / password></font></h1></center>");
		}
	}

}
