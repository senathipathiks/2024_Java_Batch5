

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub 
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	final String name="Shalini";
	final String pass="Sha123";
	PrintWriter out=response.getWriter();
	if(request.getParameter("uname").equals(name)&&request.getParameter("pwd").equals(pass))
	{
		RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
		request.setAttribute("uname", name);
		rd.forward(request,response);
		//response.sendRedirect("Welcome.jsp?uname="+name);
		//out.println("Welcome"+name);
	}
	else
	{
		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		rd.include(request,response);
		out.print("<h1> <font color=red> Invalid username/Password</font></h1>");
		//response.sendRedirect("login.jsp");
		//out.println("Welcome guest");
	}
	}

}
