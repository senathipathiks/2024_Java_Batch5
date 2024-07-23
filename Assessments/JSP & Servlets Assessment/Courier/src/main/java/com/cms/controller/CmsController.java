package com.cms.controller;

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

import com.cms.bean.User;
import com.cms.dao.CmsDao;

/**
 * Servlet implementation class LmsController1
 */
public class CmsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CmsController() {
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
 
		CmsDao dao = new CmsDao();
 
		if (action.equals("Insert")) {
			User e = new User(Integer.parseInt(request.getParameter("uid")),request.getParameter("uname"),Integer.parseInt(request.getParameter("cid")),request.getParameter("uadd"),request.getParameter("dest"),request.getParameter("recname"));
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
			User up = new User(Integer.parseInt(request.getParameter("uid")),request.getParameter("uname"),Integer.parseInt(request.getParameter("cid")),request.getParameter("uadd"),request.getParameter("dest"),request.getParameter("recname"));
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
				n = dao.doDelete(Integer.parseInt(request.getParameter("uid")));
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
			LinkedList<User> list= new LinkedList<>();
			int id = Integer.parseInt(request.getParameter("uid"));
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
					LinkedList<User> list = new LinkedList<>();
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
