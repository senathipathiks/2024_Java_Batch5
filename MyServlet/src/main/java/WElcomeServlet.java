

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Cookie;
import java.io.IOException;
import java.io.PrintWriter;


public class WElcomeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		
		//Cookie cookie[] = request.getCookies();
		//String name = request.getParameter("uname");
		
		HttpSession s1 = request.getSession();
		String name = (String)s1.getAttribute("uname");
		
		//String name = cookie[0].getValue().toString();
		out.println("<h1>Hi " + name + "!!!</h1>");
		
		
		out.println("<a href = SentItem>Click here to sent item page");

	}

}
