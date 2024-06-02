

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

///**
// * Servlet implementation class AuthServlet
// */
//public class AuthServlet extends HttpServlet {
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
////		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//}

public class AuthServlet extends HttpServlet {
	HashMap<String,String> m = new HashMap<>();
	public void init() {
		m.put("Gopi", "Gopi@123");
		m.put("Krishnan", "12345");
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		if(m.containsKey(name) && m.containsValue(pwd)) {
			out.println("<h1>Login Successfully!");
		}
		else {
			out.println("<h1><font color=red >Invalid username/ password <font>");
		}
		
		
	}
 
}
 
