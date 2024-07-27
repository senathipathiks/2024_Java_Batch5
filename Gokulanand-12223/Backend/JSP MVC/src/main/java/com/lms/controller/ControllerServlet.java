package com.lms.controller;
import java.sql.ResultSet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
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
		
		String action =request.getParameter("button");
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
					RequestDispatcher rd = request.getRequestDispatcher("InsertSuccess.jsp");
					rd.forward(request, response);
				}
				else
				{
					RequestDispatcher rd = request.getRequestDispatcher("InsertFailed.jsp");
					rd.forward(request, response);
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
				RequestDispatcher rd = request.getRequestDispatcher("UpdateSuccess.jsp");
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("UpdateFailed.jsp");
				rd.forward(request, response);
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
				RequestDispatcher rd = request.getRequestDispatcher("DeleteSuccess.jsp");
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("DeleteFailed.jsp");
				rd.forward(request, response);
			}	
		}
		
		if(action.equals("Find"))
		{
			
			String q = request.getParameter("id2");
			try 
			{
				LinkedList<Employee> list = dao.doFind(q);
				if(!list.isEmpty())
				{
					request.setAttribute("list", list);
					RequestDispatcher rd = request.getRequestDispatcher("FindSuccess.jsp");
					rd.forward(request, response);
				}
				else
				{
					RequestDispatcher rd = request.getRequestDispatcher("FindFailed.jsp");
					rd.forward(request, response);
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
				}
			}
	}		
	private boolean isEmpty(LinkedList<Employee> list) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

