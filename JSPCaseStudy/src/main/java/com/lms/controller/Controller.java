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

import com.lms.bean.Employee;
import com.lms.dao.LMSDAO;

public class Controller extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("action");
		LMSDAO dao = new LMSDAO();
		if (name.equals("Insert")) {
			Employee e = new Employee((request.getParameter("id")), request.getParameter("name"),
					request.getParameter("desig"), request.getParameter("dept"));
			int n=0;
			try {
				n = dao.doInsert(e);

			} catch (SQLException s) {
				s.printStackTrace();
			}
			if (n > 0) {

				response.sendRedirect("InsertSuccess.jsp");

			} else {
				response.sendRedirect("InsertFailure.jsp");
			}
		} 
		if (name.equalsIgnoreCase("Delete")) {
			String id = request.getParameter("id");
			int n=0;
			try {
				n = dao.doDelete(id);
			} catch (SQLException s) {
				s.printStackTrace();
			}
			if (n > 0) {
				RequestDispatcher rd = request.getRequestDispatcher("DeleteSuccess.jsp");
				rd.forward(request, response);

			} else {
				RequestDispatcher rd = request.getRequestDispatcher("DeleteFailure.jsp");
				rd.forward(request, response);

			}
		}
		if (name.equalsIgnoreCase("Update")) {
			String empid = request.getParameter("id");
			int n =0;
			Employee e = new Employee((request.getParameter("id")), request.getParameter("name"),
					request.getParameter("desig"), request.getParameter("dept"));
			try {
				n = dao.doUpdate(e);

			} catch (SQLException s) {
				s.printStackTrace();
			}
			if (n > 0) {
				RequestDispatcher rd = request.getRequestDispatcher("UpdateSuccess.jsp");
				rd.forward(request, response);

			} else {
				RequestDispatcher rd = request.getRequestDispatcher("UpdateFailure.jsp");
				rd.include(request, response);

			}
		} 
		if (name.equals("Find")) {
			int empid = Integer.parseInt(request.getParameter("id"));
			int n=0;
			Employee e1 = new Employee((request.getParameter("id")), request.getParameter("empname"),
					request.getParameter("empdesig"), request.getParameter("empdep"));

			try {
				e1 = dao.doFind(empid);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if (e1 != null) {
				RequestDispatcher rd = request.getRequestDispatcher("FindSuccess.jsp");
				request.setAttribute("res", e1);
				rd.forward(request, response);

			} else {
				RequestDispatcher rd = request.getRequestDispatcher("FindFailure.jsp");
				rd.forward(request, response);

			}
		}
		if (name.equals("View")) {
			int n=0;
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
