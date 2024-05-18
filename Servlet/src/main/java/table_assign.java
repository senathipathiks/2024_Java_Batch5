import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class table_assign<th> extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String username = request.getParameter("uname");
		String userage = request.getParameter("uage");
		String userphone = request.getParameter("uphone");
		Integer ph = Integer.parseInt(userphone);
		out.println(
			"<table border=1>"
			+ "<tr>"
			+ "<td> Name </td>"
			+ "<td>" + username + "</td>"
			+ "</tr>"
			+ "<tr>"
			+ "<td> Age </td>"
			+ "<td>" + userage + "</td>"
			+ "</tr>"
			+ "<tr>"
			+ "<td> Phone Number </td>"
			+ "<td>" + userphone + "</td>"
			+ "</tr>"
			+ "</table>"
		);
	}

}
