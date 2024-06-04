
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet_pages extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	response.getWriter().append("Served at: ").append(request.getContextPath());
		final String name = "Prabha";
		final String pass = "Prabha123";
		PrintWriter out = response.getWriter();
		if(request.getParameter("uname").equals(name)&&request.getParameter("pwd").equals(pass))
		{
			response.sendRedirect("welcome.jsp?uname= " + name);
		}
		else
		{
			response.sendRedirect("loginprint.jsp");
		}

	}

}
