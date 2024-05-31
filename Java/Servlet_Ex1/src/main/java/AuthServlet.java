

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Servlet implementation class AuthServlet
 */
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HashMap <String,String> hmap = new HashMap<>();
	public void init() {
	hmap.put("Admin","Admin@123");
	hmap.put("Nagarjun","Nagarjun@123");
	hmap.put("Arjun","Arjun@123");
	}
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
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		if(hmap.containsKey(name) && hmap.containsValue(pass)){
			RequestDispatcher rd = request.getRequestDispatcher("Auth.jsp");
			rd.include(request, response);
			out.println("<h1><font color=gold>Name / Password Match<font>");
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("Auth.jsp");
			rd.include(request, response);
			out.println("<h1><font color=red>Name / Password not match<font>");
			}
		}
	}
