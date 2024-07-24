package com.sms.controller;

import jakarta.servlet.RequestDispatcher;
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
				response.sendRedirect("InsertSuccess.jsp");
//				request.getRequestDispatcher("InsertSuccess.jsp").forward(request, response);
			}
			else {
				response.sendRedirect("InsertFailure.jsp");

			}
		
		}
		
if(action.equals("Find")) {
			
			
	String fin = request.getParameter("id");
	try{
		LinkedList<Student> list = dao.doFind(fin);
		if(!list.isEmpty()) {
			request.setAttribute("list",list);
			request.getRequestDispatcher("FindSuccess.jsp").forward(request,response);
			}
			 else {
request.getRequestDispatcher("FindFailure.jsp").forward(request, response);	
}

		}catch (Exception e) {
		System.out.println(e);
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
		request.getRequestDispatcher("DeleteSuccess.jsp").forward(request, response);
	}
	else {
		request.getRequestDispatcher("DeleteFailure.jsp").forward(request, response);
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
response.sendRedirect("UpdateSuccess.jsp");		
}
		else {
			response.sendRedirect("UpdateFailure.jsp");
		}
	
}

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
