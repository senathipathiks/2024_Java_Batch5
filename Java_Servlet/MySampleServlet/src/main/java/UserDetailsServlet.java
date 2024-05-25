

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserDetailsServlet
 */
@WebServlet("/UserDetailsServlet")
public class UserDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		final String name = request.getParameter("uname");
		final String age = request.getParameter("uage");
		final String phone = request.getParameter("uphone");
		final String email = request.getParameter("uemail");
		
		out.println(
			"<table border=1>"
			+ "<tr>"
			+ "<td> Name </td>"
			+ "<td>" + name + "</td>"
			+ "</tr>"
			+ "<tr>"
			+ "<td> Age </td>"
			+ "<td>" + age + "</td>"
			+ "</tr>"
			+ "<tr>"
			+ "<td> Phone Number </td>"
			+ "<td>" + phone + "</td>"
			+ "</tr>"
			+ "<tr>"
			+ "<td> Email </td>"
			+ "<td>" + email + "</td>"
			+ "</tr>"
			+ "</table>"
		);
	}

}
