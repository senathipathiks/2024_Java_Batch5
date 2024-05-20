

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserDetails
 */
@WebServlet("/UserDetails")
public class UserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("uname");
		String  age = request.getParameter("uage");
		String  phnum = request.getParameter("uph");
		String  email = request.getParameter("uemail");
		String  pass = request.getParameter("upass");
		
		out.println("<table border=1> "
				+ "<tr> "
				+ "<th> Name</th> "
				+ "<td>" + name +"</td> </tr>"
				+ "<tr> "
				+ "<th> Age</th> "
				+ "<td>" + age +"</td> </tr>"
				+ "<tr> "
				+ "<th> Phone Num</th> "
				+ "<td>" + phnum +"</td> </tr>"
				+ "<tr> "
				+ "<th> Email</th> "
				+ "<td>" + email +"</td> </tr>"
				+ "<tr> "
				+ "<th> Password</th> "
				+ "<td>" + pass +"</td> </tr>"
				);
		
	}
}
