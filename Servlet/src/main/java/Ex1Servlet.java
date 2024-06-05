
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * Servlet implementation class Ex1Servlet
 */
public class Ex1Servlet extends HttpServlet {
	private HashMap<String, String> UserCredentials;

	public void init() throws ServletException {
		UserCredentials = new HashMap<>();
		UserCredentials.put("Subash", "secret123");
		UserCredentials.put("Netaji", "password456");

	}

	public Ex1Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");

		if (UserCredentials.containsKey(username) &&  UserCredentials.get(username).equals(password)) {
			response.getWriter().write("Name/Password Match");
		} else {
			response.getWriter().write("Name/Password Does Not Match");
		}
	}

}
