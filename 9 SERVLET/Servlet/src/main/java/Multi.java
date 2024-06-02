

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Multi
 */
public class Multi extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		int i = 1;
		final String no = request.getParameter("num");
		out.println("<h1>The Multiplication table for " + no + "is");
		Integer y = Integer.parseInt(no);
		while(i!=11)
		{
			out.println("<h1>" +y + "*" + i + "=" + y * i );
			i++;
		}
	}

}
