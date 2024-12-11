

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthServlet
 */
@WebServlet("/AuthServlet")
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	HashMap<String,String> m = new HashMap<>();
	public void init() {
		m.put("Aravind", "Aravind2@");
		m.put("Raj", "Raj23$");
		m.put("Vashanth","Tsv@123");
		m.put("Nandha", "Nan123");
		
		
	}
	
    public AuthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uname");
		String pwd = request.getParameter("pswd");
		if(m.containsKey(name) && (m.get(name).equals(pwd))) {
			//out.println("<h1>Login Successfully!");
			request.setAttribute("uname", name);
			request.getRequestDispatcher("Welcome.jsp?name="+name).forward(request,response);
			
		}
		else {
//			out.println("<h1><font color=red >Invalid username/ password <font>");
			
			request.getRequestDispatcher("SignIn.jsp").include(request, response);
			out.println("<font color=red >Invalid username/password<font>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
