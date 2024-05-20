package com.emp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.emp.bean.Employee;
import com.emp.dao.EMPDAO;
import com.emp.util.Emputil;




/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

				PrintWriter out = response.getWriter();
				
				EMPDAO emp = new EMPDAO();
				String Add = request.getParameter("Insert");
				
				if(Add.equals("Add") ) 
				{
					Employee e = new Employee(request.getParameter("id"),request.getParameter("name"),request.getParameter("email"),request.getParameter("pass"));
					
					int n = 0;
					try {
						n = emp.doInsert(e);
					} catch (SQLException e1) {
						e1.printStackTrace();
					} 
					
					if(n>0)
					{
						response.sendRedirect("View.jsp");
					}
					else {
						RequestDispatcher rd = request.getRequestDispatcher("Add.jsp");
						rd.include(request, response);
						out.print("<center><h1><font color=red>Record Added Failed!</font></h1></center>");	
					}
				}
				if(request.getParameter("Insert").equals("Delete"))
				{
					String id = request.getParameter("id");
					
					int n = 0;
					try {
						n = emp.doDelete(id);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					if(n>0)
					{
						
						response.sendRedirect("View.jsp");					
						
					}
					else {
						RequestDispatcher rd = request.getRequestDispatcher("Delete.jsp");
						rd.include(request, response);
						out.print("<center><h1><font color=red>Record Deleted Failure!</font></h1></center>");
					}
				}
				if(request.getParameter("Insert").equals("Update"))
				{
					Employee e = new Employee(request.getParameter("id"),request.getParameter("name"),request.getParameter("email"),request.getParameter("pass"));
					
					int n2 = 0;
					try {
						n2 = emp.doUpdate(e);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					if(n2>0)
					{
						response.sendRedirect("View.jsp");
					} else {
						System.out.print("Record Updation Failure!");
					}
				}
				if(request.getParameter("Insert").equals("Search"))
				{
					String fin = request.getParameter("id");
					int cnt=0;
					try{
						ArrayList<Employee> list = emp.doFind(fin);
						
						out.println("<table align=center border=3px><tr><th>Employee ID</th><th>Employee Name</th><th> Email</th><th>Password</th></tr>");
				 
						for(Employee li : list) {
							out.println("<tr><td>"+li.getEmployee_id()+"</td><td>"+li.getEmpname()+"</td><td>"+li.getEmail()+"</td><td>"+li.getPassword()+"</td></tr></table>");
							cnt++;
						}
						
					}catch (Exception e) {
						System.out.println(e);
					}
					if(cnt<=0) {
						  out.println("<h3 style=color:red>No records found</h3>");
					  }
					
																	 
				}
				if(request.getParameter("btn").equals("DisplayAll")) {
					String fin = request.getParameter("id");
					int cnt=0;
					try{
						ArrayList<Employee> list = emp.viewAll();
						
						out.println("<table align=center border=3px><tr><th>Employee ID</th><th>Employee Name</th><th> Email</th><th>Password</th></tr>");
				 
						for(Employee li : list) {
							out.println("<tr><td>"+li.getEmployee_id()+"</td><td>"+li.getEmpname()+"</td><td>"+li.getEmail()+"</td><td>"+li.getPassword()+"</td></tr></table>");
							cnt++;
						}
					}catch (Exception e) {
						System.out.println(e);
					}
					if(cnt<=0) {
						  out.println("<h3 style=color:red>No records found</h3>");
					  }
				}
	}
}


		
		
	

