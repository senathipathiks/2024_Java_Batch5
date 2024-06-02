package com.cms.main;

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

import com.cms.bean.Employees;
import com.cms.dao.CmsDAO;

/**
 * Servlet implementation class ControllerPage
 */
public class ControllerPage extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String action = request.getParameter("button");
		CmsDAO dao = new CmsDAO();
		
		if(action.equalsIgnoreCase("insert")) {
			int n=0;
			int EmpID = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			String dep = request.getParameter("desig");
			
			Employees e = new Employees(EmpID,name,dep);
			try {
			n=dao.doInsert(e);
			}
			catch(SQLException s){
				s.printStackTrace();
			}
			if(n>0) {
//				response.getWriter().print("Inserted");
				RequestDispatcher rd = request.getRequestDispatcher("InsertSuccess.jsp");
				rd.forward(request, response);
			}
			else {
//				response.getWriter().print("Failed");
				RequestDispatcher rd = request.getRequestDispatcher("InsertFailure.jsp");
				rd.forward(request, response);
			}
			
		}
		else if(action.equalsIgnoreCase("delete")) {
			int id = Integer.parseInt(request.getParameter("id"));
			int n = 0;
			try {
			n=dao.doDelete(id);
			System.out.println("came inside try");
			}
			catch(SQLException s1){
				System.out.println(s1);
			}
			if(n>0) {
				RequestDispatcher rd = request.getRequestDispatcher("DeleteSuccess.jsp");
				rd.forward(request, response);
		
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("DeleteFailure.jsp");
				rd.forward(request, response);
				
			//	out.print("<h1><font color=red>Record not deleted Successfully</font></h1>");
			
			}
			
		}
		else if(action.equals("update")) {
			Employees e = new Employees(Integer.parseInt(request.getParameter("id")),request.getParameter("name"),request.getParameter("desig"));
				int n1 = 0;
				try {
					n1 = dao.doUpdate(e);		
				}
				catch(SQLException s) {
					s.printStackTrace();
				}
				if(n1 > 0){
					RequestDispatcher rd = request.getRequestDispatcher("UpdateSuccess.jsp");
					rd.forward(request, response);
//					out.print("<h1><font color=green>Record Updated Successfully</font></h1>");
				}
				else {
					RequestDispatcher rd = request.getRequestDispatcher("UpdateFailure.jsp");
					rd.forward(request, response);
//					out.print("<h1><font color=red>Record not Updated Successfully</font></h1>");
				}
			}
		else if(action.equals("find")) {
			int empid=Integer.parseInt(request.getParameter("id"));
			//RequestDispatcher rd=request.getRequestDispatcher("find.jsp");
			
			Employees e=null;
			try {
			e=dao.doFind(empid);
			}
			catch(SQLException e1){
				e1.printStackTrace();
			}
			 if(e!=null){
				 //rd.include(request, response);
				 RequestDispatcher rd = request.getRequestDispatcher("FindSuccess.jsp");
				 request.setAttribute("res",e);
				 rd.forward(request, response);
				 //out.print("<center><h1><font color=green>Record Found!</font></h1>");
				
			}
			 else {
				 //rd.include(request, response);
				
				 //out.print("<center><h1><font color=red>Record not Found!</font></h1>");
				 RequestDispatcher rd = request.getRequestDispatcher("FindFail.jsp");
				 rd.forward(request, response);
			 }
		}
		else if(action.equals("findAll")) {
			
			PrintWriter out1=response.getWriter();
			LinkedList<Employees> list1 = new LinkedList<Employees>();
			try {
				list1 = dao.doFindAll();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			RequestDispatcher rd=request.getRequestDispatcher("FindAllSuccess.jsp");
			request.setAttribute("list", list1);
			 rd.forward(request, response);
				}
		}
	}


