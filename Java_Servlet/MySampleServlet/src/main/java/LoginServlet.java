
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		final String name = "rk";
		final String pwd = "rk";
		if (request.getParameter("uname").equals(name) && request.getParameter("upwd").equals(pwd)) {
			out.println("<h1>Welcome " + name + "</h1>");
		} else {
			out.println("<h1>Welcome Guest</h1>");
		}
	}

}
