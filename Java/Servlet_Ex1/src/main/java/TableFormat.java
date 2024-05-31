

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class TableFormat
 */
public class TableFormat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TableFormat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String fn=request.getParameter("fname");
		String ln = request.getParameter("lname");
		String age = request.getParameter("age");
		String ph = request.getParameter("ph"); 
		
		out.println("<h1>Registration Details</h1>");
		out.println("<table border=1> <tbody>"
				+ "<tr> <td>First Name</td>"+"<td>"+fn+"</td> </tr>"
				+ "<tr> <td>Last Name</td>"+"<td>"+ ln +"</td> </tr>"
				+ "<tr> <td>Age</td>"+"<td>"+age+"</td> </tr>"
				+ "<tr> <td>Phone Number</td>"+"<td>"+ph+"</td> </tr>"+"</tbody> </table>");
	}

}
