

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MultiplicationServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		int i = 1;
		
		final String no = request.getParameter("num");
		out.println("The Multiplication table for " + no + "is");
		Integer y = Integer.parseInt(no);
		while(i!=11)
		{
			out.println(y + "*" + i + "=" + y * i );
			i++;
		}
       
	}

}
