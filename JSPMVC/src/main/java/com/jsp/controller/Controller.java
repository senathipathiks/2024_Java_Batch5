package com.jsp.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;

import com.jsp.bean.Employee;

import com.jsp.dao.LMSDAO;

public class Controller extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int n = 0;
		
			String empid=request.getParameter("id");
			String empname=request.getParameter("name");
			String empdesignation=request.getParameter("desig");
			String department=request.getParameter("dept");
			Employee e=new Employee( empid, empname, empdesignation,department);
			LMSDAO dao = new LMSDAO();
			if("Insert".equals(request.getParameter("ins"))) {
				RequestDispatcher rd=request.getRequestDispatcher("insert.jsp");

				try {
					
					n =dao.doInsert(e);
					
				}
				catch(SQLException e1) {
					
					e1.printStackTrace();
				}
				if(n > 0) {
					RequestDispatcher rd1=request.getRequestDispatcher("insertsuccess.jsp");
					rd1.forward(request, response);
				}
				else
				{
					RequestDispatcher rd1=request.getRequestDispatcher("insertfailure.jsp");
					rd1.include(request, response);
				}
				
					
			}
			
			
		
			else if("Delete".equals(request.getParameter("del")))
			{
				RequestDispatcher rd=request.getRequestDispatcher("delete.jsp");
				try {
					n=dao.doDelete(empid);
				}
				catch(SQLException e1) {
					e1.printStackTrace();
				}
				if(n > 0) {
					RequestDispatcher rd1=request.getRequestDispatcher("deletesuccess.jsp");
					rd1.forward(request, response);
				}
				else
				{
					RequestDispatcher rd1=request.getRequestDispatcher("deletefailure.jsp");
					rd1.include(request, response);
				}
				
			}
			else if("Update".equals(request.getParameter("upd"))) {
				
				RequestDispatcher rd=request.getRequestDispatcher("update.jsp");				
				 try {
					n=dao.doUpdate(e);
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 if(n > 0) {
						RequestDispatcher rd1=request.getRequestDispatcher("updatesuccess.jsp");
						rd1.forward(request, response);
					}
					else
					{
						RequestDispatcher rd1=request.getRequestDispatcher("updatefailure.jsp");
						rd1.include(request, response);
					}
				 
				
			}
			else if("Find".equalsIgnoreCase(request.getParameter("Find"))) {

				
				String id = request.getParameter("id");
				LinkedList<Employee> list = new LinkedList<>();
				int cnt=0;
				try{
					list = dao.doFindByID(id);
					cnt = list.size();
			 
					
				}catch (Exception f) {
					System.out.println(f);
				}
			if(cnt > 0) {
			
				  RequestDispatcher rd1=request.getRequestDispatcher("Findsuccess.jsp");
				  request.setAttribute("list", list);
					rd1.forward(request, response);
			}
			else
			{
				RequestDispatcher rd1=request.getRequestDispatcher("findfailure.jsp");
				rd1.include(request, response);

			}
			}
			
			
			

		
//		PrintWriter out = response.getWriter();
//		LMSDAO dao = new LMSDAO();
//		
//		String action=request.getParameter("button");
//		if(action.equals("Insert"))
//		{
//				Employee e = new Employee(request.getParameter("id"),request.getParameter("name"),request.getParameter("desig"),request.getParameter("dept"));
//				int n = 0;
//				try {
//					n = dao.doInsert(e);
//				} catch (SQLException e1) {
//					e1.printStackTrace();
//				}
//				if(n>0)
//				{
//					out.println("Record Inserted Successfully...");
//				}
//				else
//				{
//					out.println("Failed to Insert... Kindly Retry...");
//				}
//		}
			
//		
//			else if("Delete".equals(request.getParameter("del")))
//			{
//				RequestDispatcher rd=request.getRequestDispatcher("Delete.jsp");
//				try {
//					n=dao.doDelete(empid);
//					out.println("Deleted Successfully...");
//				}
//				catch(SQLException e1) {
//					e1.printStackTrace();
//				}
//				
//			}
//			else if("Update".equals(request.getParameter("upd"))) {
//				
//				RequestDispatcher rd=request.getRequestDispatcher("Update.jsp");				
//				 try {
//					n=dao.doUpdate(e);
//					out.println("Updated Successfully...");
//				} catch (Exception e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				 
//				
//			}
//			else if("Find".equals(request.getParameter("find"))) {
//				int cnt=0;	
//				RequestDispatcher rd=request.getRequestDispatcher("Find.jsp");				
//				try {
//						ResultSet rs =dao.doFindByID(empid);
//						out.println("<table border=3px> <tr><th>Employee Id </th> <th>Employee Name </th> <th> Designation </th> <th> Department </th></tr> ");
//						while(rs.next()) {
//							out.println("<tr> <td>"+rs.getInt(1)+"</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3)+"</td><td>" + rs.getString(4)+"</td></tr>");
//							
//							 cnt++;
//						}
//						out.println("</table>");
//						if(cnt<=0) {
//							  out.println("No records found");
//						}
//						out.println("Found Successfully...");
//				} catch (Exception e1) 
//				{
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//							 
//			}				
			
			
		
	}

}
//
//public class Controller extends HttpServlet {
//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		    PrintWriter out = response.getWriter();
//			HttpSession session = request.getSession();
//			LMSDAO lms = new LMSDAO();
//			String button = request.getParameter("action");
//			if(button.equalsIgnoreCase("view")) {
//				int count=0;
//				try {
//					ArrayList<Employee> alstu = lms.viewAll();
//					
//					out.println("<table border=2px ><tr><th>Student ID</th><th>Name</th><th>City</th><th>Mobile Number</th></tr>");
//					
//					for(Employee stu : alstu) {
//						out.println("<tr><td>"+stu.getEmpid()+"</td><td>"+stu.getDepartment()+"</td><td>"+stu.getEmpdesignation()+"</td><td> "+stu.getEmpname()+"</td></tr>");
//						count++;
//					}
//					out.println("</table>");
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					System.out.println(e1);
//				}
//				if(count<1) {
//					out.println("No records found");
//				}
//			}
//		
//			if(button.equalsIgnoreCase("find")) {
//				int count=0;
//				try {
//					ArrayList<Employee> alstu = lms.doFind();
//					
//					out.println("<table border=2px ><tr><th>Student ID</th><th>Name</th><th>City</th><th>Mobile Number</th></tr>");
//					
//					for(Employee stu : alstu) {
//						out.println("<tr><td>"+stu.getEmpid()+"</td><td>"+stu.getDepartment()+"</td><td>"+stu.getEmpdesignation()+"</td><td> "+stu.getEmpname()+"</td></tr>");
//						count++;
//					}
//					out.println("</table>");
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					System.out.println(e1);
//				}
//				if(count<1) {
//					out.println("No records found");
//				}
//			}
//				
//		}
//}
//	



	
