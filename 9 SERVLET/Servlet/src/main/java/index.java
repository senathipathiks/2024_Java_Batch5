

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
 * Servlet implementation class index
 */
public class index extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		//String name = request.getParameter("uname");	
//		Cookie cookie[] = request.getCookies();
//		out.println("<h1>Hello "+cookie[0].getValue().toString()+" !!!</h1>");
		HttpSession s1 = request.getSession();
		String name = (String) s1.getAttribute("uname");
		out.print("<h1>Hi "+name+ "!!!</h1>");
	
		out.println("<h1>this is index page</h1>");
		out.println("<a href=MyServlet>Click here to send</a>");
	}


}
