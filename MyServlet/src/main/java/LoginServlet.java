

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public LoginServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String name = "Ganapathy";
		final String pass = "Gana123";
		PrintWriter out = response.getWriter();
		
		if(request.getParameter("uname").equals(name)&&request.getParameter("pwd").equals(pass))
		{
//			Cookie ck = new Cookie("uname",name);
//			response.addCookie(ck);
			HttpSession session = request.getSession();
			session.setAttribute("uname", name);
			RequestDispatcher rd = request.getRequestDispatcher("WElcomeServlet");
			//request.setAttribute("uname", name);
			rd.forward(request,response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request,response);
			out.print("<h1><font color=red> Invalid username/password</font></h1>");
		
		}
	}

}

//Generic Servlet

//public class LoginServlet extends GenericServlet {
////	private static final long serialVersionUID = 1L;
////       
////    /**
////     * @see HttpServlet#HttpServlet()
////     */
////    public LoginServlet() {
////        super();
////        // TODO Auto-generated constructor stub
////    }
////
////	/**
////	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
////	 */
//	protected void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
//		final String name = "Ganapathy";
//		final String pass = "Gana123";
//		PrintWriter out = response.getWriter();
//		if(request.getParameter("uname").equals(name)&&request.getParameter("pwd").equals(pass))
//		{
//			out.println("WELCOME " + name);
//		}
//		else
//		{
//			out.println("WELCOME Guest");
//		}
//	}
//
//}
