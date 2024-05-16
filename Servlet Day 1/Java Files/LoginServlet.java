

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
@WebServlet("/LoginServlet")
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
		// TODO Auto-generated method stub
				final String name="vidhusha";
				final String pass="vs@123";
				PrintWriter out = response.getWriter();
				if(request.getParameter("uname").equals(name)&&request.getParameter("pswrd").equals(pass)) {
					
					//out.println("welcome"+name);
					//response.sendRedirect("welcome.jsp?uname="+name);
					RequestDispatcher rd =request.getRequestDispatcher("welcome.jsp");
					request.setAttribute("uname", name);
					rd.forward(request, response);
					
				}
				else {
					
					RequestDispatcher rd =request.getRequestDispatcher("login.jsp");
					rd.include(request, response);
					//out.println("welcome Guest");
					//response.sendRedirect("login.jsp");
					out.println("<h3><bold><font color= red> invalid username/password </bold></h3>");
					
					
					
				}
//				doGet(request, response);
				
			}

	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	

