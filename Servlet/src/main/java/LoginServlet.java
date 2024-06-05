
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = "subash";
		String pass = "123456";
		PrintWriter out = response.getWriter();
		
		if (request.getParameter("uname").equals(name) && request.getParameter("pwd").equals(pass)) {
			out.println("Welcome" + name);
			
			//addcookie
			Cookie ck = new Cookie("cname",name);
			response.addCookie(ck);
			
			response.sendRedirect("Inbox.jsp?uname="+name);
		} else {
			response.sendRedirect("Login.jsp");
		}
	}

}
