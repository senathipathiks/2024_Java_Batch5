

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SameName
 */
@WebServlet("/SameName")
public class SameName extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String buttons[] = request.getParameterValues("button");
		
		if(buttons[0].equals("Hello")) {
			request.getRequestDispatcher("LoginRedirect.jsp").forward(request, response);
		}
		else if(buttons[0].equals("Multiply")) {
			response.sendRedirect("Multiplication.jsp");
		}
	}

}
