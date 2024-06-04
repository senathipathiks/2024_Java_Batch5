

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SentItem
 */
public class SentItem extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
//		Cookie cookie[] = request.getCookies();
//		String name = cookie[0].getValue().toString();
		
		HttpSession s1 = request.getSession();
		String name = (String)s1.getAttribute("uname");
		
		out.println("<h1>Hi " + name + "!!!</h1>");
		
		out.print("<a href = ProfilePage?uname="+name+">Click here to profile page");
	}

}
