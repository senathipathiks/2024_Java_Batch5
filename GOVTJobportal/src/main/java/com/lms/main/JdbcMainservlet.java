package com.lms.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.valves.rewrite.Substitution.StaticElement;
import org.apache.jasper.tagplugins.jstl.core.If;

import com.lms.bean.Applicant;
import com.lms.dao.LmsDao;

/**
 * Servlet implementation class JdbcMainservlet
 */
@WebServlet("/JdbcMainservlet")
public class JdbcMainservlet extends HttpServlet {
	static LmsDao dao = new LmsDao();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JdbcMainservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


       PrintWriter out = response.getWriter();
		String id = (request.getParameter("id"));
		int cnt =0;
  
		try {
			ArrayList< Applicant> res = dao.dofind(id);
			if(! res.isEmpty()) 
	       {
		   
		    request.setAttribute("res", res) ;
			request.getRequestDispatcher("RecordFound.jsp").forward(request, response);

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
		  String[] param = request.getParameterValues("button");
		  
		LmsDao dao = new LmsDao();
		PrintWriter out = response.getWriter();
		
		
		if(param[0].equals("Insert")){
			Applicant emp = new Applicant(request.getParameter("id"),request.getParameter("name"),request.getParameter("job"),request.getParameter("sts"));
			int n=0;
			try {
				n=dao.doinsert(emp);
			} catch (SQLException e) {
				// TODO: handle exception
				System.out.println(e);
				
			}
			if(n>0) {
				request.getRequestDispatcher("Insertionsuccess.jsp").include(request, response);

			}
			else {
				request.getRequestDispatcher("InsertionFailed.jsp").include(request, response);
				
			}
			
			
		}
		
		
       
         System.out.println(param);
		 if (param[0].equals("Delete")) {
			String eid = (request.getParameter("eid"));
			int data=0;
			
			
			 try {
				data=dao.dodelete(eid);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 if(data>0) {
				 request.getRequestDispatcher("DeleteSuccess.jsp").forward(request, response);

					
				}
			 else {
				 request.getRequestDispatcher("Deletefail.jsp").forward(request, response);			
				 out.println("<h2><font color=red>No records found</font></h2>");

			 }
			 
			
			
		}
		 
		 
		 
		 if(param[0].equals("update")) {
			 
			 
			 Applicant emp1 = new Applicant(request.getParameter("eid"),request.getParameter("name"),request.getParameter("desg"),request.getParameter("salary"));
			 int data = 0;
			 
//			 out.print("Hi Vasi");
			 
			 
			 try {
				data=dao.doupdate(emp1);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 if(data>0) {
				 request.getRequestDispatcher("UpdateSuccess.jsp").forward(request, response);

				}
			 else {

				 request.getRequestDispatcher("UpdateFailed.jsp").include(request, response);
			 }
			 
		 }
		 
		 if(param[0].equalsIgnoreCase("Filter")) {
			 int cnt=0;
			 String desgi = request.getParameter("desg");
			 try {
				ArrayList< Applicant> res = dao.dofindbyName(desgi);
				if(! res.isEmpty()) 
			       {
				   
				    request.setAttribute("res", res) ;
					request.getRequestDispatcher("FilterFound.jsp").include(request, response);
			       }
				else {
					request.getRequestDispatcher("Filter.jsp").include(request, response);
					out.println("<center>");
					out.println("<h3><font color=red> No records found for this filter!! </font></h3>");
					out.print("</center>");
					  
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			
			 
		 }
		
		
		
			}

}
