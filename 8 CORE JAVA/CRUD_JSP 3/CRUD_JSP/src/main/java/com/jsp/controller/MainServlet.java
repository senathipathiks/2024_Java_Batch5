package com.jsp.controller;

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

import com.jsp.bean.Employee;
import com.jsp.dao.EmpDao;


public class MainServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action =request.getParameter("Button");
		EmpDao dao=new EmpDao();
		int n=0;
		if(action.equals("Insert"))
		{
			int empid=Integer.parseInt(request.getParameter("empid"));
			String empname=request.getParameter("empname");
			String empdesig=request.getParameter("empdesig");
			String empdept=request.getParameter("empdept");
			
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
			int empid=Integer.parseInt(request.getParameter("empid"));
		
			
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
			int empid=Integer.parseInt(request.getParameter("empid"));
			Employee e=new Employee(Integer.parseInt(request.getParameter("empid")),request.getParameter("empname"),request.getParameter("empdesig"),request.getParameter("empdepart"));
			
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
			int empid=Integer.parseInt(request.getParameter("empid"));
			Employee e1=new Employee(Integer.parseInt(request.getParameter("empid")),request.getParameter("empname"),request.getParameter("empdesig"),request.getParameter("empdepart"));
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
		else if(action.equals("FindAll"))
		{
			
	
//			Employee e1=new Employee(Integer.parseInt(request.getParameter("empid")),request.getParameter("empname"),request.getParameter("empdesig"),request.getParameter("empdepart"));
			PrintWriter out=response.getWriter();
			LinkedList<Employee> list1 = new LinkedList<Employee>();
			try {
				list1=dao.doFindAll();
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
