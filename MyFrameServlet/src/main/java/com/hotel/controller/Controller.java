package com.hotel.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import com.hotel.bean.Employee;
import com.hotel.dao.HOTELDAO;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int n = 0;
//		
			int empid=Integer.parseInt(request.getParameter("id"));
			String empname=request.getParameter("name");
			String empdesig=request.getParameter("desig");
			String empdept=request.getParameter("dept");
			Employee e=new Employee(empid,empname,empdesig,empdept);
			HOTELDAO dao = new HOTELDAO();
			if("Insert".equals(request.getParameter("ins"))) {
				RequestDispatcher rd=request.getRequestDispatcher("Insert.jsp");

				try {
					int cnt=0;
					n =dao.doInsert(e);
					
					out.println("Inserted Successfully...");
				}
				catch(SQLException e1) {
					
					e1.printStackTrace();
				}
				
				
			}
			
			
		
			else if("Delete".equals(request.getParameter("del")))
			{
				RequestDispatcher rd=request.getRequestDispatcher("Delete.jsp");
				try {
					n=dao.doDelete(empid);
					out.println("Deleted Successfully...");
				}
				catch(SQLException e1) {
					e1.printStackTrace();
				}
				
			}
			else if("Update".equals(request.getParameter("upd"))) {
				
				RequestDispatcher rd=request.getRequestDispatcher("Update.jsp");				
				 try {
					n=dao.doUpdate(e);
					out.println("Updated Successfully...");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
				
			}
			else if("Find".equals(request.getParameter("find"))) {
				int cnt=0;	
				RequestDispatcher rd=request.getRequestDispatcher("Find.jsp");				
				try {
						ResultSet rs =dao.doFindByID(empid);
						out.println("<table border=3px> <tr><th>Employee Id </th> <th>Employee Name </th> <th> Designation </th> <th> Department </th></tr> ");
						while(rs.next()) {
							out.println("<tr> <td>"+rs.getInt(1)+"</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3)+"</td><td>" + rs.getString(4)+"</td></tr>");
							
							 cnt++;
						}
						out.println("</table>");
						if(cnt<=0) {
							  out.println("No records found");
						}
						out.println("Found Successfully...");
				} catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
							 
			}				
			
			
		
	}

}
