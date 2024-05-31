package com.lms.main;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import com.lms.bean.Employee;

/**
 * Servlet implementation class JdbcMainservlet
 */
public class JdbcMainservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public JdbcMainservlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		int cnt =0;
//		out.println("<center>");   
		try {
			ArrayList< Employee> res = dao.dofind(id);
			if(! res.isEmpty()) 
	       {
		   
		    request.setAttribute("res", res) ;
			request.getRequestDispatcher("RecordFound.jsp").forward(request, response);
	   
//		   	out.println("<table border=3px align= center> <tr><th>Employee Id </th> <th>Employee Name </th> <th>Salary</th> <th> Designation </th></tr> ");
//			for(Employee e : res) {
//			out.println("<tr> <td>"+e.getEmpid()+"</td><td>"+e.getEmpname()+"</td><td>"+e.getsal()+"</td><td>"+e.getEmpdesg()+"</td></tr>");
//			
//			 cnt++;
//			}
//			out.println("</table>");
//		   
	       }
	     else
		   {
            request.getRequestDispatcher("NoRecordFound.jsp").forward(request, response);
	  
		   }
		
	}
		catch (SQLException e) {
	// TODO Auto-generated catch block
			System.out.println(e);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
