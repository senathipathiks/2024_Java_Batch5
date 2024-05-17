

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;


public class AuthServlet extends HttpServlet {
	HashMap<String,String> map = new HashMap<>();
		public void init() {
			map.put("vidhusha","vs@123");
			map.put("ani", "ani123");
		}
       
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uname");
		String pass = request.getParameter("pwd");
		if(map.containsKey(name) && map.containsValue(pass)) {
			out.println("<h1> Login Successful </h1>");
		}
		else {
			out.println("<h1> Login Failed </h1>");
		}
		}

	

}
