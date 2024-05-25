

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MultiplicationServlet
 */
@WebServlet("/MultiplicationServlet")
public class MultiplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String muln = request.getParameter("num");
		int mul = Integer.parseInt(muln);
		
		out.println("<h1>Multiplication Table of "+mul+"</h1>");
		out.println("<table border=1> "
				+ "<th colspan=2><"
				+ "td>"+mul+" Table</td></th>");
		for(int i=1;i<=10;i++) {
			out.println("<tr><td>"+i+" * "+mul+" = "+(i*mul)+"</td></tr>");
		}
		out.println("</table>");
	}

}
