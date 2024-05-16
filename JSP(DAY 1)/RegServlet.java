

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class RegServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uname");
		int age = Integer.parseInt(request.getParameter("age"));
		int ph = Integer.parseInt(request.getParameter("num"));
		out.println("<table border='1px'><tr><th> Name</th><th>Age</th> <th>Number</th> </tr> <tr><td>"+name+"</td> <td>"+age+"</td><td>"+ph+"</td></tr></table>");
	}
}
