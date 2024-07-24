

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;


public class AuthServlet extends HttpServlet {
	
	
//	HashMap<String,String> m = new HashMap<>();
//	public void init() {
//		m.put("Nandhakumaran", "Nandha@123");
//		m.put("Vashanth", "Vashanth@999");
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		PrintWriter out = response.getWriter();
//		String name = request.getParameter("name");
//		String pwd = request.getParameter("pwd");
//		if(m.containsKey(name) && m.containsValue(pwd)) {
//			out.println("<h1>Login Successfully!");
//		}
//		else {
//			out.println("<h1><font color=red >Invalid username/ password <font>");
//		}
		
		HashMap<String, String> hMap = new HashMap<>();
		hMap.put("jeeva", "j123");
		hMap.put("gopi", "g123");
		hMap.put("gana", "ga123");
		hMap.put("nandha", "n123");
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		final String name = request.getParameter("uname");
		final String pswd = request.getParameter("pswd");
		String user = hMap.get(name);
		PrintWriter out = response.getWriter();
		if(user == null) {
//			System.out.println(user);
			request.getRequestDispatcher("Auth.jsp").include(request, response);
			out.println("<font color=red >Invalid username<font>");
		} else {
			boolean pck = user.equals(pswd);
//			System.out.println(user);
			if(pck && (user != null)) {
	//			response.sendRedirect("welcome.jsp?name="+name);
				request.setAttribute("uname", name);
				request.getRequestDispatcher("Welcome.jsp?name="+name).forward(request,response);
				
			} else {
				request.getRequestDispatcher("Auth.jsp").include(request, response);
				out.println("<font color=red >Invalid username/password<font>");
			}
			
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
