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

import org.apache.catalina.tribes.util.Jre14Compat;

import com.lms.bean.Employee;
import com.lms.dao.LMSDAO;


public class Controller extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action =request.getParameter("button");
		LMSDAO dao=new LMSDAO();
		int n=0;
		if(action.equals("Insert"))
		{
			int empid=Integer.parseInt(request.getParameter("id"));
			String empname=request.getParameter("ename");
			String empdesig=request.getParameter("desg");
			String empdept=request.getParameter("dept");
			
			Employee e=new Employee(empid,empname,empdesig,empdept);
			try {
				n=dao.doInsert(e);
			}
			catch(SQLException e1)
			{
				e1.printStackTrace();
			}
			if(n>0)
			{
				RequestDispatcher rd=request.getRequestDispatcher("InsertSuccess.jsp");
				rd.forward(request,response);
					
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("InsertFailure.jsp");
				rd.forward(request,response);
						
			
			}
		
		}
		else if(action.equals("Delete"))
		{
			int empid=Integer.parseInt(request.getParameter("eid"));
		
			
			try {
				n=dao.doDelete(empid);
			}
			catch(SQLException e1)
			{
				e1.printStackTrace();
			}
			if(n>0)
			{
				RequestDispatcher rd=request.getRequestDispatcher("DeleteSuccess.jsp");
				rd.forward(request,response);
					
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("DeleteFailure.jsp");
				rd.forward(request,response);
						
			
			}
		}
		else if(action.equals("Update"))
		{
			int empid=Integer.parseInt(request.getParameter("id"));
			Employee e=new Employee(Integer.parseInt(request.getParameter("id")),request.getParameter("ename"),request.getParameter("desg"),request.getParameter("dept"));
			
			try {
				n=dao.doUpdate(e);
			}
			catch(SQLException e1)
			{
				e1.printStackTrace();
			}
			if(n>0)
			{
				RequestDispatcher rd=request.getRequestDispatcher("UpdateSuccess.jsp");
				rd.forward(request,response);
					
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("UpdateFailure.jsp");
				rd.forward(request,response);
						
			
			}
		}
		else if(action.equals("Find"))
		{
			int empid=Integer.parseInt(request.getParameter("eid"));
			Employee e1=new Employee(Integer.parseInt(request.getParameter("eid")),request.getParameter("ename"),request.getParameter("desg"),request.getParameter("dept"));
			PrintWriter out=response.getWriter();
			try {
				e1=dao.doFind(empid);
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			if(e1!=null)
			{
				RequestDispatcher rd=request.getRequestDispatcher("FIndSuccess.jsp");
				request.setAttribute("res",e1);
				rd.forward(request,response);	
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("FIndFailure.jsp");
				rd.include(request,response);
				
			
			}
		}
		else if(action.equals("ViewAll"))
		{
			
	
//			Employee e1=new Employee(Integer.parseInt(request.getParameter("empid")),request.getParameter("empname"),request.getParameter("empdesig"),request.getParameter("empdepart"));
			PrintWriter out=response.getWriter();
			LinkedList<Employee> list1 = new LinkedList<Employee>();
			try {
				list1=dao.viewAll();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
			RequestDispatcher rd=request.getRequestDispatcher("FindAllSuccess.jsp");
			request.setAttribute("list",list1);
			rd.forward(request, response);
			
		}
		
	}

	

}
