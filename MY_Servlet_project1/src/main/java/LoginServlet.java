

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		final String name = "Prabha";
		final String pass = "Prabha123";
		PrintWriter out = response.getWriter();
		if(request.getParameter("uname").equals(name)&&request.getParameter("pwd").equals(pass))
		{
			out.println("WELCOME " + name);
		}
		else
		{
			out.println("WELCOME Guest");
		}

	}

}
