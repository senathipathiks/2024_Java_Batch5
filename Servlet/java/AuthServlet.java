

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;


public class AuthServlet extends HttpServlet {
	
	public void init() {
		HashMap<String,String> m = new HashMap<>();
		m.put("Aravind", "Aravind2@");
		m.put("Raj", "Raj23$");
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		
	}

}
