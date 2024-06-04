package com.employee.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;

import com.employee.bean.Employee;
import com.employee.dao.LMSDAO;


public class Controller extends HttpServlet  {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter(); 
		int n = 0 ;
		String name = request.getParameter("action");
		LMSDAO dao = new LMSDAO();
		//String action = request.getParameter("del");
		if(name.equalsIgnoreCase("Insert")) {
			Employee e = new Employee(Integer.parseInt(request.getParameter("id")),request.getParameter("name"),request.getParameter("des"),request.getParameter("dept"));
			
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
			int id = Integer.parseInt(request.getParameter("id"));
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
			Employee e = new Employee(Integer.parseInt(request.getParameter("id")),request.getParameter("name"),request.getParameter("des"),request.getParameter("dept"));
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
			int empid=Integer.parseInt(request.getParameter("id"));
			
			Employee e1=new Employee(Integer.parseInt(request.getParameter("id")),request.getParameter("empname"),request.getParameter("empdesig"),request.getParameter("empdepart"));
			
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
				list=dao.viewAll();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			request.setAttribute("list",list);
			rd.forward(request, response);
			 
		}
	}
}
