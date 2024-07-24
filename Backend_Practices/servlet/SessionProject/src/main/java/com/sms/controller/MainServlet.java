package com.sms.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.sms.bean.Student;
import com.sms.dao.SMSDao;


public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("button");
		
		PrintWriter out = response.getWriter();
		
		SMSDao dao = new SMSDao();
		
		if(action.equals("Insert")) {
	
			
			Student e = new Student(request.getParameter("id"), request.getParameter("name"), request.getParameter("emailid"), request.getParameter("pwd"));
			int n = 0;
			try {
				
				 n = dao.doInsert(e);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(n>0) {
//				response.sendRedirect("Display.jsp");
				request.getRequestDispatcher("Display.jsp").forward(request, response);
			}
			else {
				request.getRequestDispatcher("InsertFailure.jsp").include(request, response);
				out.println("<center><h3 style=color:red>Invalid Student Details</h3></center>");
			}
		
		}
		
if(action.equals("Find")) {
			
			
	String fin = request.getParameter("id");
	int cnt=0;
	try{
		LinkedList<Student> list = dao.doFind(fin);

		out.println("<table align=center border=3px><tr><th>Student ID</th><th>Student Name</th><th>Student Email</th><th>Password</th></tr>");

		for(Student li : list) {
			out.println("<tr><td>"+li.getStudid()+"</td><td>"+li.getStudName()+"</td><td>"+li.getStudEmail()+"</td><td>"+li.getPassword()+"</td></tr></table>");
			cnt++;
		}
	}catch (Exception e) {
		System.out.println(e);
	}
 if(cnt<=0) {
 	  out.println("<h3 style=color:red>No records found</h3>");
 }
 }
 
	

if(action.equals("Delete")) {
	int n=0;
	try {
		n = dao.doDelete(request.getParameter("id"));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(n>0) {
		request.getRequestDispatcher("Display.jsp").forward(request, response);
	}
	else {
		request.getRequestDispatcher("Delete.jsp").include(request, response);
		out.println("<center><h3 style=color:red>Record Deletion Failure</h3></center>");
	}
}

if(action.equals("Update")) {
	
	
	Student e = new Student(request.getParameter("id"), request.getParameter("name"), request.getParameter("emailid"), request.getParameter("pwd"));
	 int n = 0;
	
	 try {
		n=dao.doUpdate(e);
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	 if(n>0) {
			request.getRequestDispatcher("Display.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("Update.jsp").include(request, response);
			out.println("<center><h3 style=color:red>Record Updation Failure</h3></center>");
		}
	
}

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
