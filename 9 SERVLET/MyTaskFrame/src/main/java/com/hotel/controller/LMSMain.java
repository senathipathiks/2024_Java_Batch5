package com.hotel.controller;

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

import com.hotel.bean.Employee;
import com.hotel.dao.LMSDAO;

/**
 * Servlet implementation class LMSMain
 */
public class LMSMain extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public LMSMain() {
//        super();
//        // TODO Auto-generated constructor stub
//    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int n = 0;
				
					String empid=request.getParameter("id");
					String empname=request.getParameter("name");
					String designation=request.getParameter("desig");
					String department=request.getParameter("dept");
					Employee e=new Employee(Integer.parseInt(empid), empname, designation, department);
					LMSDAO dao = new LMSDAO();
		
		PrintWriter out = response.getWriter();
		if("insert".equals(request.getParameter("ins"))) {
			Employee e2 = new Employee(Integer.parseInt(request.getParameter("id")),request.getParameter("name"),request.getParameter("desig"),request.getParameter("dept"));

			try {
				n =dao.doInsert(e2);
				 			
			}
			catch(SQLException e1) {
				
				e1.printStackTrace();
			}
			if(n>0) {
				out.println("Inserted Successfully...");
				}
				else {
					RequestDispatcher rd1=request.getRequestDispatcher("InsertFail.jsp");
					rd1.forward(request, response);
				}
		}
		
		
	
		else if("delete".equals(request.getParameter("del")))
		{
			RequestDispatcher rd=request.getRequestDispatcher("delete.jsp");
			try {
				n=dao.doDelete(Integer.parseInt(empid));
				out.println("Deleted Successfully...");
			}
			catch(SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		else if("update".equals(request.getParameter("upd"))) {
			
			RequestDispatcher rd=request.getRequestDispatcher("Update.jsp");				
			 try {
				n=dao.doUpdate(e);
				out.println("Updated Successfully...");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
		else if("find".equals(request.getParameter("find"))) {
			int cnt=0;	
			RequestDispatcher rd=request.getRequestDispatcher("Find.jsp");				
			try {
					ResultSet rs =dao.doFindByID(Integer.parseInt(empid));
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
