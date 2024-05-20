package com.crud.controller;

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

import com.crud.bean.Employee;
import com.crud.dao.EmpDao;


public class MainServletControl extends HttpServlet {

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
			RequestDispatcher rd=request.getRequestDispatcher("Insert.jsp");
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
				rd.include(request,response);
				response.getWriter().print("<h1><font-color-green>Record Inserted</font-color></h1>");		
			}
			else
			{
				rd.include(request,response);
				response.getWriter().print("<h1><font-color-green>Record not Inserted</font-color></h1>");		
			
			}
		
		}
		else if(action.equals("Delete"))
		{
			int empid=Integer.parseInt(request.getParameter("empid"));
			RequestDispatcher rd=request.getRequestDispatcher("Delete.jsp");
			
			try {
				n=dao.doDelete(empid);
			}
			catch(SQLException e1)
			{
				e1.printStackTrace();
			}
			if(n>0)
			{
				rd.include(request,response);
				response.getWriter().print("<h1><font-color-green>Record Deleted</font-color></h1>");		
			}
			else
			{
				rd.include(request,response);
				response.getWriter().print("<h1><font-color-green>Record not Deleted/font-color></h1>");		
			
			}
		}
		else if(action.equals("Update"))
		{
			int empid=Integer.parseInt(request.getParameter("empid"));
			RequestDispatcher rd=request.getRequestDispatcher("Update.jsp");
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
				rd.include(request,response);
				response.getWriter().print("<h1><font-color-green>Record Updated</font-color></h1>");		
			}
			else
			{
				rd.include(request,response);
				response.getWriter().print("<h1><font-color-green>Record not Updated</font-color></h1>");		
			
			}
		}
		else if(action.equals("Find"))
		{
			int empid=Integer.parseInt(request.getParameter("empid"));
			RequestDispatcher rd=request.getRequestDispatcher("Find.jsp");
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
				rd.include(request,response);
				out.print("<table border=1><tr>");
				out.print("<th>EmpID<th>");
				out.print("<th>EMpName<th>");
				out.print("<th>EmpDesig<th>");
				out.print("<th>EmpDepartment<th>");
				out.print("<tr>");
				out.print("<td>"+e1.getEmpId()+"<td>");
				out.print("<td>"+e1.getEmpname()+"<td>");
				out.print("<td>"+e1.getEmpdesig()+"<td>");
				out.print("<td>"+e1.getEmpdept()+"<td>");
//				response.getWriter().print("<h1><font-color-green>Record Found</font-color></h1>");		
			}
			else
			{
				rd.include(request,response);
				response.getWriter().print("<h1><font-color-green>Record not Found</font-color></h1>");		
			
			}
		}
		else if(action.equals("FindAll"))
		{
			
			RequestDispatcher rd=request.getRequestDispatcher("FindAll.jsp");
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
			
				rd.include(request,response);
				out.print("<table border=1><tr>");
				out.print("<th>EmpID<th>");
				out.print("<th>EMpName<th>");
				out.print("<th>EmpDesig<th>");
				out.print("<th>EmpDepartment<th>");
				out.print("<tr>");
				for(Employee e1:list1)
				{
					out.print("<tr>");
					out.print("<td>"+e1.getEmpId()+"<td>");
					out.print("<td>"+e1.getEmpname()+"<td>");
					out.print("<td>"+e1.getEmpdesig()+"<td>");
					out.print("<td>"+e1.getEmpdept()+"<td>");
					out.print("</tr>");
				}
			
		}
		
	}

	

}
