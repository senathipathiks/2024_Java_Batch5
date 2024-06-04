import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AddServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		final String no = request.getParameter("num");
		final String nos = request.getParameter("num");
		out.println("The Addition of two numbers " + no + "and" + nos + "is");
		Integer y = Integer.parseInt(no);
		Integer z = Integer.parseInt(nos);
		
		out.println(y + z);
		
		
       
	}

}
