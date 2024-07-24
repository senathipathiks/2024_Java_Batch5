package com.lms.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.LinkedList;

import com.lms.bean.Employee;
import com.lms.dao.LMSDAO;


public class Controller extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		LMSDAO dao=new LMSDAO();
		String action=request.getParameter("button");
		int n = 0;
		if (action.equals("Insert")) {
			Employee e=new Employee(Integer.parseInt(request.getParameter("id")), request.getParameter("ename"),
					request.getParameter("desg"), request.getParameter("dept"));
			try {
				n = dao.doInsert(e);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
 
			if (n > 0) {
				RequestDispatcher rd = request.getRequestDispatcher("Insert.jsp");
				rd.include(request, response);
				out.print("<center><h1><font color=green>Record Added Successfully!</font></h1></center>");
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("Insert.jsp");
				rd.include(request, response);
				out.print("<center><h1><font color=red>Record Added Failed!</font></h1></center>");
			}
		}
		
		else if (action.equals("Delete")){
			int empid=Integer.parseInt(request.getParameter("eid"));
			RequestDispatcher rd=request.getRequestDispatcher("Delete.jsp");
			try {
				n=dao.doDelete(empid);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(n>0) {
				rd.include(request, response);
				out.print("<center><h1><font color=green>Record Deleted Successfully!</font></h1></center>");	
			}
			else {
				rd.include(request, response);
				out.print("<center><h1><font color=green>Record Deletion Failed!</font></h1></center>");
			}
		}
		else if(action.equals("Update")) {
			Employee e=new Employee(Integer.parseInt(request.getParameter("id")), request.getParameter("ename"),
					request.getParameter("desg"), request.getParameter("dept"));
			try {
				n = dao.doUpdate(e);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
 
			if (n > 0) {
				RequestDispatcher rd = request.getRequestDispatcher("Update.jsp");
				rd.include(request, response);
				out.print("<center><h1><font color=green>Record Update Successfully!</font></h1></center>");
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("Update.jsp");
				rd.include(request, response);
				out.print("<center><h1><font color=red>Record Update Failed!</font></h1></center>");
			}
		}
		else if(action.equals("Find")) {
			int empid=Integer.parseInt(request.getParameter("eid"));
			RequestDispatcher rd=request.getRequestDispatcher("Find.jsp");
			Employee e=null;
			try {
			e=dao.doFind(empid);
			}
			catch(SQLException e1){
				e1.printStackTrace();
			}
			 if(e!=null){
				 rd.include(request, response);
				 out.print("<center><h1><font color=green>Record Found!</font></h1>");
				 out.println("<table border=3><tr>");
				 out.println("<th>Emp Id</th>");
				 out.println("<th>Emp Name</th>");
				 out.println("<th>Emp Desg</th>");
				 out.println("<th>Emp Dept</th>");
				 out.println("</tr>");
				 out.println("<tr>");
				 out.println("<td>"+e.getEmpid()+"</td>");
				 out.println("<td>"+e.getEmpname()+"</td>");
				 out.println("<td>"+e.getEmpdesig()+"</td>");
				 out.println("<td>"+e.getEmpdept()+"</td>");
				 out.println("</tr>");
				 out.println("</table>");
                 out.println("</center>");
			}
			 else {
				 rd.include(request, response);
				 out.print("<center><h1><font color=red>Record not Found!</font></h1>"); 
			 }
		}
		else if(action.equals("ViewAll")) {
			RequestDispatcher rd=request.getRequestDispatcher("ViewAll.jsp");
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
