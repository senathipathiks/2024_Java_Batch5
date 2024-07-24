

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ActionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		if("Hello".equals(action)) {
			response.sendRedirect("Hello.jsp");
		}
		if("Multiplication".equals(action)) {
			response.sendRedirect("Multiplication.jsp");
		}
	}

	

}
