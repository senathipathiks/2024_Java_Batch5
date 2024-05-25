

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginRedirectServlet
 */
@WebServlet("/LoginRedirectServlet")
public class LoginRedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		final String name = "rkk";
		final String pass = "123";
		
		if(request.getParameter("uname").equals(name) && request.getParameter("upwd").equals(pass)){
//			Cookie ck = new Cookie("uname", name);
//			response.addCookie(ck);
			
			HttpSession session = request.getSession();
			session.setAttribute("uname", name);
			
			request.getRequestDispatcher("LoginIndex.jsp?message=" + name).forward(request, response);
			
//			response.sendRedirect("LoginIndex.jsp?message=" + name);  
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("LoginRedirect.jsp");
			rd.include(request, response);
			out.println("<h1 style=color:red>Invalid name and password</h1>");
		}
	}

}
