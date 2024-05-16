

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class UserServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uname");
		int age = Integer.parseInt(request.getParameter("age"));
		String email = request.getParameter("em");
		String gender = request.getParameter("gen");
		out.println("<table border='1px'> <tr> <th> Name</th> <th>Age</th> <th>Email</th> <th>Gender</th> </tr> <tr><td>"+name+"</td> <td>"+age+"</td><td>"+email+"</td><td>"+gender+"</td></tr></table>");
	}
}
