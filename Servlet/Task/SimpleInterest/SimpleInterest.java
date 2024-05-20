

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleInterest
 */
@WebServlet("/SimpleInterest")
public class SimpleInterest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleInterest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String  p = request.getParameter("p");
		String  n = request.getParameter("n");
		String  r = request.getParameter("r");
		
		int p1 = Integer.parseInt(p);
		int n1 = Integer.parseInt(n);
		int r1 = Integer.parseInt(r);
		
		
		float cal = (p1*n1*r1)/100;
		
		out.println("The Simple Interest for This : "+ cal);
	}

	
	

}
