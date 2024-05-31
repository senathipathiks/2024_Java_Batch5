

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookieservlet
 */
@WebServlet("/Cookieservlet")
public class Cookieservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cookieservlet() {
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
		final String name = "Vashanth";
		final String pass = "Tsv@123";
		
		if(request.getParameter("uname").equals(name) && request.getParameter("pswd").equals(pass)){
            Cookie ck = new Cookie("uname", name);
//			request.setAttribute("message", name);
//			request.getRequestDispatcher("/Welcomeuser.jsp").forward(request, response);  
//           
            response.addCookie(ck);
            response.sendRedirect("Welcomecookie.jsp");
            }
		else {
			response.sendRedirect("login.jsp"); 
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
