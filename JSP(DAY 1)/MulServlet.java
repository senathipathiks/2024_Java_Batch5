

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MulServlet
 */
public class MulServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int a = Integer.parseInt(request.getParameter("num"));
	PrintWriter out = response.getWriter();
	for(int i=0;i<a;i++) {
		out.println(a+"*"+i+"="+a*i);
	     }
	}

}
