

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class additionoftwonumbers extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		final String a = request.getParameter("num1");
		final String b = request.getParameter("num2");
		Integer n1 = Integer.parseInt(a);
		Integer n2 = Integer.parseInt(b);
		out.println("The Addition of " + n1 + " and " + n2 + " is " + (n1+n2) );
	}

}
