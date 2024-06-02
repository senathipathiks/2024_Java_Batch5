package com.jsp.controller;

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

import com.jsp.bean.Donor;
import com.jsp.dao.DonorDao;


public class MainServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action =request.getParameter("Button");
		DonorDao dao=new DonorDao();
		int n=0;
		if(action.equals("Insert"))
		{
			int donorid=Integer.parseInt(request.getParameter("donorid"));
			String donorname=request.getParameter("donorname");
			String donorbg=request.getParameter("donorbg");
			String donorphoneno=request.getParameter("donorphoneno");
			
			Donor e=new Donor(donorid,donorname,donorbg,donorphoneno);
			try {
				n=dao.doInsert(e);
			}
			catch(SQLException e1)
			{
				e1.printStackTrace();
			}
			if(n>0)
			{
				RequestDispatcher rd=request.getRequestDispatcher("InsertSuccess.jsp");
				rd.forward(request,response);
					
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("InsertFailure.jsp");
				rd.forward(request,response);
						
			
			}
		
		}
		else if(action.equals("Delete"))
		{
			int donorid=Integer.parseInt(request.getParameter("donorid"));
		
			
			try {
				n=dao.doDelete(donorid);
			}
			catch(SQLException e1)
			{
				e1.printStackTrace();
			}
			if(n>0)
			{
				RequestDispatcher rd=request.getRequestDispatcher("DeleteSuccess.jsp");
				rd.forward(request,response);
					
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("DeleteFailure.jsp");
				rd.forward(request,response);
						
			
			}
		}
		else if(action.equals("Update"))
		{
			int donorid=Integer.parseInt(request.getParameter("donorid"));
			Donor e=new Donor(Integer.parseInt(request.getParameter("donorid")),request.getParameter("donorname"),request.getParameter("donorbg"),request.getParameter("donorphoneno"));
			
			try {
				n=dao.doUpdate(e);
			}
			catch(SQLException e1)
			{
				e1.printStackTrace();
			}
			if(n>0)
			{
				RequestDispatcher rd=request.getRequestDispatcher("UpdateSuccess.jsp");
				rd.forward(request,response);
					
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("UpdateFailure.jsp");
				rd.forward(request,response);
						
			
			}
		}
		else if(action.equals("Find"))
		{
			int donorid=Integer.parseInt(request.getParameter("donorid"));
			Donor e1=new Donor(Integer.parseInt(request.getParameter("donorid")),request.getParameter("donorname"),request.getParameter("donorbg"),request.getParameter("donorphoneno"));
			PrintWriter out=response.getWriter();
			try {
				e1=dao.doFind(donorid);
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			if(e1!=null)
			{
				RequestDispatcher rd=request.getRequestDispatcher("FIndSuccess.jsp");
				request.setAttribute("res",e1);
				rd.forward(request,response);
				
						
				
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("FIndFailure.jsp");
				rd.include(request,response);
				
			
			}
		}
		else if(action.equals("FindAll"))
		{
			
	
//			Employee e1=new Employee(Integer.parseInt(request.getParameter("donorid")),request.getParameter("donorname"),request.getParameter("donorbg"),request.getParameter("empdepart"));
			PrintWriter out=response.getWriter();
			LinkedList<Donor> list1 = new LinkedList<Donor>();
			try {
				list1=dao.doFindAll();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
			RequestDispatcher rd=request.getRequestDispatcher("FindAllSuccess.jsp");
			request.setAttribute("list",list1);
			rd.forward(request, response);
			
		}
		
	}

	

}
