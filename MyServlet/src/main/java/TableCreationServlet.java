

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TableCreationServlet
 */
@WebServlet("/TableCreationServlet")
public class TableCreationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TableCreationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String fn=request.getParameter("fname");
		String ln = request.getParameter("lname");
		String aging = request.getParameter("age");
		String designation = request.getParameter("desig");
		
		out.println("<h1>Registration Details</h1>");
		out.println("<table border=1> <tbody>"
				+ "<tr> <td>First Name</td>"+"<td>"+fn+"</td> </tr>"
				+ "<tr> <td>Last Name</td>"+"<td>"+ ln +"</td> </tr>"
				+ "<tr> <td>Age</td>"+"<td>"+aging+"</td> </tr>"
				+ "<tr> <td>Phone Number</td>"+"<td>"+designation+"</td> </tr>"+"</tbody> </table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
