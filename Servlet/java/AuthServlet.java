
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
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
	
	HashMap<String,String> map = new HashMap<>();
	public void init() {
		map.put("Ponraj","Ponraj123");
		map.put("Nandha","Nandha123");
		map.put("Vasith","Vasith123");
	}
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		
		PrintWriter out = response.getWriter();
		 
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pwd");
		
		if(map.containsKey(uname) && map.containsValue(pass)) {
			RequestDispatcher rd = request.getRequestDispatcher("ExNo1.jsp");
			rd.include(request, response);
			out.print("<center><h1><font color=red>Login SuccessFully</font></h1></center>");
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("ExNo1.jsp");
			rd.include(request, response);
			out.print("<center><h1><font color=red>Invalid Username / Password</font></h1></center>");
		}
		
	}

}
