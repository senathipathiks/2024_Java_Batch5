

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginCred
 */
public class LoginCred extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCred() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		PrintWriter out = response.getWriter();
		final String name = "Nandhakumaran";
		final String pass = "Nandha@123456";
		
		if(request.getParameter("uname").equals(name) && request.getParameter("pswd").equals(pass)){
			
//			cookies
//			Cookie ckCookie = new Cookie("uname",name);
//			response.addCookie(ckCookie);
			
//			Session
			HttpSession session = request.getSession();
			session.setAttribute("uname", name)	;	
			
//			Normal
//			request.setAttribute("message", name);
			
			
			request.getRequestDispatcher("/Welcome.jsp").forward(request, response);  

		}
		else {
			response.sendRedirect("WelcomeGuest.jsp");  
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		final String name = "Nandhakumaran";
		final String pass = "Nandha@123456";
		
		if(request.getParameter("uname").equals(name) && request.getParameter("pswd").equals(pass)){

//			response.sendRedirect("Welcome.jsp?message=" + name); 
			
//			request.setAttribute("message", name);		
			request.getRequestDispatcher("/Welcome.jsp").forward(request, response);  

		}
		else {
//			response.sendRedirect("WelcomeGuest.jsp");  
			request.getRequestDispatcher("LoginCred.jsp").include(request, response);
			out.println("<center><h3 style=color:red>Invalid User Credentials</h3></center>");
		}
		
	}

}
