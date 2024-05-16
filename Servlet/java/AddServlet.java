

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class AddServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int num1 = Integer.parseInt(request.getParameter("n1"));
		int num2 = Integer.parseInt(request.getParameter("n2"));
		int ans = num1 + num2;
		out.println("<h1>Sum= "+ans);
		
	}

}
