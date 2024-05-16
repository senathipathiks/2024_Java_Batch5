

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimInt
 */
@WebServlet("/SimInt")
public class SimInt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimInt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		String pr = request.getParameter("p");
		String no = request.getParameter("n");
		String ra = request.getParameter("r");
		int pri = Integer.parseInt(pr);
		int year = Integer.parseInt(no);
		int rate = Integer.parseInt(ra);
		
		float si = (pri*year*rate)/100;
		out.println("Simple Interest is:"+si);
	}

	}

	

