

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet1
 */
@WebServlet("/LoginServlet1")
public class LoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		final String name="Supraja";
		final String pass="Admin123";
		PrintWriter out=response.getWriter();
		if(request.getParameter("uname").equals(name)&&request.getParameter("pwd").equals(pass))
		{
			Cookie ck=new Cookie("uname",name);
			response.addCookie(ck);
			RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");
			request.setAttribute("uname", name);
			rd.forward(request,response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.include(request,response);
			out.println("<h2><font color=red>Invalid username?password</font></h2>");
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
