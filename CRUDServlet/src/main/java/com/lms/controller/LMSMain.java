package com.lms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lms.bean.Employee;
import com.lms.dao.LMSDAO;

/**
 * Servlet implementation class LMSMain
 */
@WebServlet("/LMSMain")
public class LMSMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LMSMain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		String name=request.getParameter("ename");
		String desig=request.getParameter("edesig");
		String dept=request.getParameter("edept");
		Employee e =new Employee(id,name,desig,dept);
		LMSDAO lms=new LMSDAO();
		if("Insert".equals(request.getParameter("ins"))) {
			try
			{
				lms.doInsert(e);
				out.println("<h1>Inserted Successfully");
			}
			catch(Exception e1)
			{
				out.println(e1);
				
			}
			
		}else if("Delete".equals(request.getParameter("del"))) {
			try {
				lms.dodelete(id);
				out.println("Deleted......");
			}
			catch(Exception e1) {
				out.println(e1);
			}
		}
		else if("Sub".equals(request.getParameter("upd")))
		{
			try {
				lms.doUpdate(e);
				out.println("Updated successfully...");
			}
			catch(Exception e1)
			{
				out.println(e1);
			}
		}
		else if ("FindByID".equals(request.getParameter("find"))) {
//          String result = lms.doFind(id);
			RequestDispatcher rd = request.getRequestDispatcher("findbyid.jsp");
			Employee e1 = null;
			try {
				e1 = lms.doFind(id);
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
//          out.println("<h1>Employee Details</h1>");
//          out.println("<p> </p>");
			if (e1 != null) {
				rd.include(request, response);
				out.println("<table border=1><tr>");
				out.println("<th>EmpId</th>");
				out.println("<th>EmpName</th>");
				out.println("<th>EmpDesign</th>");
				out.println("<th>EmpDept</th>");
				out.println("</tr>");

				out.println("<tr>");
				out.println("<td>" + e1.getEmpid() + "</td>");
				out.println("<td>" + e1.getEmpname() + "</td>");
				out.println("<td>" + e1.getEmpdesig() + "</td>");
				out.println("<td>" + e1.getEmpdept() + "</td>");
				out.println("</tr>");
				out.println("</table>");

			}
			else {
				rd.include(request, response);
				out.println("<h1><font color=red> Invalid </font></h1>");
			}

		} else if ("View".equals(request.getParameter("vw"))) {

			RequestDispatcher rd = request.getRequestDispatcher("findbyid.jsp");
			LinkedList<Employee> list1 = new LinkedList<Employee>();
			try {
				list1 = lms.doView();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			rd.include(request, response);
			out.println("<table border=1><tr>");
			out.println("<th>EmpId</th>");
			out.println("<th>EmpName</th>");
			out.println("<th>EmpDesign</th>");
			out.println("<th>EmpDept</th>");
			out.println("</tr>");
			for (Employee e3 : list1) {
				out.println("<tr>");
				out.println("<td>" + e3.getEmpid() + "</td>");
				out.println("<td>" + e3.getEmpname() + "</td>");
				out.println("<td>" + e3.getEmpdesig() + "</td>");
				out.println("<td>" + e3.getEmpdept() + "</td>");
				out.println("</tr>");

			}
			out.println("</table>");

		} else {
			out.println("Invalid action.");
		}
		
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
