

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		
		final String p = request.getParameter("num");
		final String n = request.getParameter("num");
		final String r = request.getParameter("num");
		
		out.println("The Simple Interest is : ");
		Integer x = Integer.parseInt(p);
		Integer y = Integer.parseInt(n);
		Integer z = Integer.parseInt(r);
		
		out.println(x * y * z / 100);
	}

}
