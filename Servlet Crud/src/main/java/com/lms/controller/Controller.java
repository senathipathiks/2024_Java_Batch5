package com.lms.controller;

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

import com.lms.bean.Employee;
import com.lms.dao.LMSDAO;


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
				out.println("Record inserted successfully!");
			}
			else {
				out.println("Record not inserted");
			}
		}
		else if(name.equalsIgnoreCase("Delete")) {
			int id = Integer.parseInt(request.getParameter("id"));
			RequestDispatcher rd = request.getRequestDispatcher("delete.jsp");
			try {
				n = dao.doDelete(id);
			}
			catch(SQLException s) {
				s.printStackTrace();
			}
			if(n > 0) {
				rd.include(request, response);
				out.print("<h1><font color=green>Record deleted successfully!!!</font></h1>");
			}
			else {
				rd.include(request, response);
				out.print("<h1><font color=red>Record deleted successfully!!!</font></h1>");
			}
		}
		else if(name.equalsIgnoreCase("Update")){
			int id = Integer.parseInt(request.getParameter("id"));
			RequestDispatcher rd = request.getRequestDispatcher("update.jsp");
			Employee e = new Employee(Integer.parseInt(request.getParameter("id")),request.getParameter("name"),request.getParameter("des"),request.getParameter("dept"));
			try {
				n = dao.doUpdate(e);
				
			}
			catch(SQLException s) {
				s.printStackTrace();
			}
			if(n > 0) {
				rd.include(request, response);
				out.println("<h1><font color=green>Record Updated Successfully</font></h1>");
			}
			else {
				rd.include(request, response);
				out.println("<h1><font color=red>Record not Updated Successfully</font></h1>");
			}
		}
		else if(name.equals("Find"))
		{
			int empid=Integer.parseInt(request.getParameter("id"));
			RequestDispatcher rd=request.getRequestDispatcher("find.jsp");
			
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
				rd.include(request,response);
				out.print("<table border=1><tr>");
				out.print("<th>EmpID<th>");
				out.print("<th>EMpName<th>");
				out.print("<th>EmpDesig<th>");
				out.print("<th>EmpDepartment<th>");
				out.print("<tr>");
				out.print("<td>"+e1.getEmpid()+"<td>");
				out.print("<td>"+e1.getEmpname()+"<td>");
				out.print("<td>"+e1.getEmpdesig()+"<td>");
				out.print("<td>"+e1.getEmpdept()+"<td>");
			}
			else
			{
				rd.include(request,response);
				response.getWriter().print("<h1><font-color-green>Record not Found</font-color></h1>");		
			
			}
		}
		else if(name.equals("View")) {
			RequestDispatcher rd=request.getRequestDispatcher("View.jsp");
			LinkedList<Employee> list=new LinkedList<>();
			try {
				list=dao.viewAll();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			rd.include(request, response);
			 out.println("<br>");
			 out.println("<center><table border=3><tr>");
			 out.println("<th>Emp Id</th>");
			 out.println("<th>Emp Name</th>");
			 out.println("<th>Emp Desg</th>");
			 out.println("<th>Emp Dept</th>");
			 out.println("</tr>");
			 for(Employee e:list) {
				 out.println("<tr>");
				 out.println("<td>"+e.getEmpid()+"</td>");
				 out.println("<td>"+e.getEmpname()+"</td>");
				 out.println("<td>"+e.getEmpdesig()+"</td>");
				 out.println("<td>"+e.getEmpdept()+"</td>");
				 out.println("</tr></center>");
			 }
		}
	}
}
