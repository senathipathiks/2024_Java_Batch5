

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MultiServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			
			int n = Integer.parseInt(request.getParameter("n"));
			int n1 = Integer.parseInt(request.getParameter("n1"));
			
			for(int i = 1; i <= n1; i++) {
				out.println("<h1>"+i+"*"+n+"="+(i*n));
				
			}
		
	
	}

}
