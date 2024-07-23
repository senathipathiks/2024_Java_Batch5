package com.lms.controller;

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
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import com.lms.beans.Employee;
import com.lms.dao.LmsDao;

/**
 * Servlet implementation class LmsController1
 */
public class LmsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LmsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 
		 String action = request.getParameter("button");
		 
		PrintWriter out = response.getWriter();
 
		LmsDao dao = new LmsDao();
 
		if (action.equals("Insert")) {
			Employee e = new Employee(Integer.parseInt(request.getParameter("id")),request.getParameter("name"),request.getParameter("pos"),request.getParameter("dep"));
			int n=0;
			try {
				n = dao.doInsert(e);
			}
			catch(SQLException ex) {
				ex.printStackTrace();
			}
			if(n>0) {
				response.sendRedirect("InsertSuccess.jsp");
			}
			else {
				response.sendRedirect("InsertFailure.jsp");
			}
		}
		
		else if(action.equals("Update")) {
			Employee up = new Employee(Integer.parseInt(request.getParameter("id")),request.getParameter("name"),request.getParameter("pos"),request.getParameter("dep"));
			int n=0;
			
			try {
				n = dao.doUpdate(up);
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			if(n>0) {
				response.sendRedirect("UpdateSuccess.jsp");
			}
			else {
				response.sendRedirect("UpdateFailure.jsp");
			}
		}
		
		else if(action.equals("Delete")) {
			int n=0;
			try {
				n = dao.doDelete(Integer.parseInt(request.getParameter("id")));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(n>0) {
				response.sendRedirect("DeleteSuccess.jsp");
			}
			else {
				response.sendRedirect("DeleteFailure.jsp");

			}
		}
		
		else if(action.equals("Find")) {
			Employee f = new Employee(Integer.parseInt(request.getParameter("id")),request.getParameter("name"),request.getParameter("pos"),request.getParameter("dep"));
			LinkedList<Employee> list= new LinkedList<>();
			int id = Integer.parseInt(request.getParameter("id"));
			try {
				list = dao.doFind(id);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			if(!list.isEmpty()) {
				RequestDispatcher rd= request.getRequestDispatcher("FindSuccess.jsp");
				request.setAttribute("list", list);
				rd.forward(request, response);
			}
			else{
				RequestDispatcher rd= request.getRequestDispatcher("FindFailure.jsp");
				rd.forward(request, response);
			}
		}

		else if (action.equals("ViewAll")) {
					RequestDispatcher rd = request.getRequestDispatcher("ViewSuccess.jsp");
					LinkedList<Employee> list = new LinkedList<>();
					try {
						list = dao.viewAll();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					request.setAttribute("list", list);
					rd.forward(request, response);
		 
				}
	}
}