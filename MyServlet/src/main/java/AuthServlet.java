

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class AuthServlet extends HttpServlet {
	
	HashMap<String,String> m = new HashMap<>();
	public void init() {
		m.put("Aravind", "Aravind2@");
		m.put("Raj", "Raj23$");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final String name = "Ganapathy";
		final String pass = "Gana123";
		PrintWriter out = response.getWriter();
		if(request.getParameter("uname").equals(name)&&request.getParameter("pwd").equals(pass))
		{
			RequestDispatcher rs = request.getRequestDispatcher("auth.jsp");
			rs.include(request,response);
			out.print("<h1><font color=green> Name/Password Match</font></h1>");
		
		}
		else
		{
			RequestDispatcher rs = request.getRequestDispatcher("auth.jsp");
			rs.include(request,response);
			out.print("<h1><font color=red> Name/Password does not Match</font></h1>");
		
		}
	
	}

}
