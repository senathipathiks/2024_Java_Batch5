

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MulServlet
 */
@WebServlet("/MulServlet")
public class MulServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MulServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String  pass = request.getParameter("tno");
		
		int n = Integer.parseInt(pass);
		out.println("<h1>Multiplication Table for " + n +"</h1>");
		out.println("<table border=1>");
		for(int i=1;i<=10;i++)
		{
			out.println("<tr> <td>"+ i +" * "+ n + " = "+(i*n)+" </td> </tr>");
		}
	}

}
