

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SIServlet
 */
public class SIServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int a = Integer.parseInt(request.getParameter("n1"));
int b= Integer.parseInt(request.getParameter("n2"));
int c = Integer.parseInt(request.getParameter("rate"));
int res = (a*b*c)/100;
PrintWriter out = response.getWriter();
out.println(res);
	}

}
