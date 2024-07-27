

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final String name = "Gokul Anand";
		final String pwd = "123";
//		PrintWriter out = response.getWriter();
		
		if(request.getParameter("uname").equals(name) && request.getParameter("pswd").equals(pwd))
		{
			Cookie ck = new Cookie("uname",name);
			response.addCookie(ck);
			request.getRequestDispatcher("WelcomeServlet").forward(request, response);
		}
		else {
			response.sendRedirect("Login.jsp");
		}
	}

}
