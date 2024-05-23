package com.lms.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.LinkedList;

import com.lms.bean.Employee;
import com.lms.dao.LMSDAO;

/**
 * Servlet implementation class MainServlet
 */
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
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		int n = 0 ;
		String name = request.getParameter("action");
		LMSDAO dao = new LMSDAO();
		//String action = request.getParameter("del");
		if(name.equalsIgnoreCase("Insert")) {
			Employee e = new Employee(request.getParameter("id"),request.getParameter("name"),request.getParameter("desig"),request.getParameter("dept"));
			
			try {
				n = dao.doInsert(e);
			}
			catch(SQLException s) {
				s.printStackTrace();
			}
			if(n > 0) {
				RequestDispatcher rd = request.getRequestDispatcher("InsertSuccess.jsp");
				rd.forward(request, response);
				
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("InsertFailure.jsp");
				rd.forward(request, response);
			}
		}
		else if(name.equalsIgnoreCase("Delete")) {
			String id = request.getParameter("id");
			try {
				n = dao.doDelete(id);
			}
			catch(SQLException s) {
				s.printStackTrace();
			}
			if(n > 0) {
				RequestDispatcher rd = request.getRequestDispatcher("DeleteSuccess.jsp");
				rd.forward(request, response);
				
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("DeleteFailure.jsp");
				rd.forward(request, response);
				
			}
		}
		else if(name.equalsIgnoreCase("Update")){
			int id = Integer.parseInt(request.getParameter("id"));
   Employee e = new Employee(request.getParameter("id"),request.getParameter("name"),request.getParameter("desig"),request.getParameter("dept"));
			try {
				n = dao.doUpdate(e);
				
			}
			catch(SQLException s) {
				s.printStackTrace();
			}
			if(n > 0) {
				RequestDispatcher rd = request.getRequestDispatcher("UpdateSuccess.jsp");
				rd.forward(request, response);
				
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("UpdateFailure.jsp");
				rd.include(request, response);
				
			}
		}
		else if(name.equals("Find"))
		{
			String empid=request.getParameter("id");
			
			Employee e1=new Employee(request.getParameter("id"),request.getParameter("empname"),request.getParameter("empdesig"),request.getParameter("empdept"));
			
			try {
				e1=dao.doFind(empid);
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			if(e1!=null)
			{
				RequestDispatcher rd=request.getRequestDispatcher("FindSuccess.jsp");
				request.setAttribute("res", e1);
				rd.forward(request,response);
				
 
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("FindFailure.jsp");
				rd.forward(request,response);
				
					
			
			}
		}
		
		else if(name.equals("View")) {
			RequestDispatcher rd=request.getRequestDispatcher("ViewSuccess.jsp");
			LinkedList<Employee> list=new LinkedList<>();
			try {
				list=dao.doView();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			request.setAttribute("list",list);
			rd.forward(request, response);
			
		}
	}

	}


