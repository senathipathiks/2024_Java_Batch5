

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SimpleInterestServlet
 */
public class SimpleInterestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SimpleInterestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		int p = Integer.parseInt(request.getParameter("p"));
		int n = Integer.parseInt(request.getParameter("n"));
		int r = Integer.parseInt(request.getParameter("r"));
		
		out.println("Simple Interest : "+(((p*n*r)/100)));
	}

	

}
