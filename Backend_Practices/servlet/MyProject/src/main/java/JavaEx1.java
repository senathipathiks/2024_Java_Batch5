

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class JavaEx1
 */
public class JavaEx1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JavaEx1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
