
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class UserDetailServlet
 */
public class UserDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uname");
		String pno = request.getParameter("pno");
		String loc = request.getParameter("loc");
		String age = request.getParameter("age");
		String email = request.getParameter("email");
		
		out.println("<table border=1> "
				+ "<tr> "
				+ "<th> Name</th> "
				+ "<td>" + name +"</td> </tr>"
				+ "<tr> "
				+ "<th> PhoneNumber</th> "
				+ "<td>" + pno +"</td> </tr>"
				+ "<tr> "
				+ "<th> Location</th> "
				+ "<td>" + loc +"</td> </tr>"
				+ "<tr> "
				+ "<th> Age</th> "
				+ "<td>" + age +"</td> </tr>"
				+ "<tr> "
				+ "<th> Email</th> "
				+ "<td>" + email +"</td> </tr>"
				);
		
		}
	}
