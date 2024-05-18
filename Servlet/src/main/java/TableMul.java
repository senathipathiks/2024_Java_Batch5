
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TableMul extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int i = 1;
		final String no = request.getParameter("num");
		out.println("The Multiplication Table for " + no + " is ");
		Integer nums = Integer.parseInt(no);
		while(i!= 11) {
			out.println(nums + "*" + i + "=" + nums * i);
		i++;
			
		}
	}

}
