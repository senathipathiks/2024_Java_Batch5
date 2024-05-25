package com.ims.controller;

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

import com.ims.bean.Customer;
import com.ims.dao.IMSDAO;

public class Controller extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("action");
		IMSDAO dao = new IMSDAO();
		if (name.equals("Insert")) {
			Customer c = new Customer((request.getParameter("id")), request.getParameter("name"),request.getParameter("age"), request.getParameter("phoneNo"),request.getParameter("emailID"), request.getParameter("nomineeName"),request.getParameter("nomineeRelation"), request.getParameter("address"));
			int n=0;
			try {
				n = dao.doInsert(c);

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
			String cusid = request.getParameter("id");
			int n =0;
			Customer c = new Customer((request.getParameter("id")), request.getParameter("name"), request.getParameter("age"), request.getParameter("phoneNo"), request.getParameter("emailID"), request.getParameter("nomineeName"), request.getParameter("nomineeRelation"), request.getParameter("address"));
			try {
				n = dao.doUpdate(c);

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
			Customer c1 = new Customer((request.getParameter("id")), request.getParameter("name"), request.getParameter("age"), request.getParameter("phoneNo"), request.getParameter("emailID"), request.getParameter("nomineeName"), request.getParameter("nomineeRelation"), request.getParameter("address"));

			try {
				c1 = dao.doFind(empid);
			} catch (SQLException c) {
				c.printStackTrace();
			}
			if (c1 != null) {
				RequestDispatcher rd = request.getRequestDispatcher("FindSuccess.jsp");
				request.setAttribute("res", c1);
				rd.forward(request, response);

			} else {
				RequestDispatcher rd = request.getRequestDispatcher("FindFailure.jsp");
				rd.forward(request, response);

			}
		}
		if (name.equals("View")) {
			int n=0;
			RequestDispatcher rd = request.getRequestDispatcher("ViewSuccess.jsp");
			LinkedList<Customer> list = new LinkedList<>();
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
