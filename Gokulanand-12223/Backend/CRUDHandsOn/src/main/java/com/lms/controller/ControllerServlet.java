package com.lms.controller;
import java.sql.ResultSet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.bean.Employee;
import com.lms.dao.LMSDAO;
import com.mysql.cj.protocol.Resultset;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		LMSDAO dao = new LMSDAO();
		
		String action=request.getParameter("button");
		if(action.equals("Insert"))
		{
				Employee e = new Employee(request.getParameter("id"),request.getParameter("name"),request.getParameter("desig"),request.getParameter("depart"));
				int n = 0;
				try {
					n = dao.doInsert(e);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				if(n>0)
				{
					out.println("Record Inserted Successfully...");
				}
				else
				{
					out.println("Failed to Insert... Kindly Retry...");
				}
		}
		
		if(action.equals("Update"))
		{
			Employee f = new Employee(request.getParameter("id"),request.getParameter("name"),request.getParameter("desig"),request.getParameter("depart"));
			int m = 0;
			try {
				m = dao.doUpdate(f);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			if(m>0)
			{
				out.println("Record Updated Successfully...");
			}
			else
			{
				out.println("Failed to Update... Kindly Retry...");
			}
		
		}
		
		if(action.equals("Delete"))
		{
			String p = request.getParameter("id");
			int cnt=0;
			try {
				cnt = dao.doDelete(p);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			if(cnt>0)
			{
				out.println("Record Deleted Successfully");
			}
			else
			{
				out.println("Failed to Delete...Kindly Retry...");
			}	
		}
		
		if(action.equals("Find"))
		{
			String q = request.getParameter("id");
			
			int cnt=0;
			try {
				ResultSet rs = dao.doFind(q);
				
				out.println("<table border=3px> <tr><th>Employee Id </th> <th>Employee Name </th> <th> Designation </th> <th> Department </th></tr>");
				while(rs.next()) {
					out.println("<tr> <td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");
					
					 cnt++;
				}
				out.println("</table>");
				if(cnt<=0) {
					  out.println("No records found");
				}
			
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

