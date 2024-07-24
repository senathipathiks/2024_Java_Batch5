

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = -5128025697871243043L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final String name = "Nandhakumaran";
		final String pass = "Nandha@123456";
		PrintWriter out = response.getWriter();
		if(request.getParameter("uname").equals(name) && request.getParameter("pswd").equals(pass)){
				out.println("Welcome "+name);
	}
	else {
		out.println("Welcome Guest");
	}
		
	}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			final String name = "Nandhakumaran";
			final String pass = "Nandha@123456";
			PrintWriter out = response.getWriter();
			if(request.getParameter("uname").equals(name) && request.getParameter("pswd").equals(pass)){
//					out.println("Welcome "+name);
//				out.print("<a href = "Welcome.jsp"/>");
		}
		else {
			out.println("Welcome Guest");
		}

	}
}

