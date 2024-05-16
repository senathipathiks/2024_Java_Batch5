

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class InterestServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int p = Integer.parseInt(request.getParameter("p"));
		int n = Integer.parseInt(request.getParameter("y"));
		int r = Integer.parseInt(request.getParameter("i"));
		
		out.println("<h1>Simple Interest="+(p*n*r/100));
	}

}
