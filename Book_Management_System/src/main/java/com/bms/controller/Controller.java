package com.bms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.LinkedList;

import com.bms.DAO.bmsDAO;
import com.bms.bean.books;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int n = 0;
		String name = request.getParameter("action");
		bmsDAO dao = new bmsDAO();
		if (name.equalsIgnoreCase("Insert")) {
			books b = new books(Integer.parseInt(request.getParameter("id")), request.getParameter("name"),
					request.getParameter("author"), request.getParameter("buys"));

			try {
				n = dao.doInsert(b);
			} catch (SQLException s) {
				s.printStackTrace();
			}
			if (n > 0) {
				RequestDispatcher rd = request.getRequestDispatcher("InsertedSuccess.jsp");
				rd.forward(request, response);

			} else {
				RequestDispatcher rd = request.getRequestDispatcher("InsertedFailure.jsp");
				rd.forward(request, response);
			}
		}
		
		else if (name.equalsIgnoreCase("Delete")) {
			int id1 = Integer.parseInt(request.getParameter("id"));
			try {
				n = dao.doDelete(id1);
			} catch (SQLException s) {
				s.printStackTrace();
			}
			if (n > 0) {
				RequestDispatcher rd1 = request.getRequestDispatcher("DeleteSuccess.jsp");
				rd1.forward(request, response);

			} else {
				RequestDispatcher rd1 = request.getRequestDispatcher("DeleteFailure.jsp");
				rd1.forward(request, response);

			}

		}
		

		else if (name.equalsIgnoreCase("Update")) {
			int id = Integer.parseInt(request.getParameter("Bookid"));
			books e = new books(Integer.parseInt(request.getParameter("Bookid")), request.getParameter("Bookname"),
					request.getParameter("Bookauthor"), request.getParameter("Bookdateofbuy"));
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
				rd.forward(request, response);

			}
		}
		else if (name.equals("Find")) {
			int id = Integer.parseInt(request.getParameter("Bookid"));

			books e1 = new books(Integer.parseInt(request.getParameter("Bookid")), request.getParameter("Bookname"),
					request.getParameter("Bookauthor"), request.getParameter("Bookdateofbuy"));

			try {
				e1 = dao.doFind(id);
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
		else if (name.equals("View")) {
			LinkedList<books> list = new LinkedList<>();
			int x=0;
			try {
				list = dao.viewAll();
				x=list.size();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(x!=0) {
			RequestDispatcher rd = request.getRequestDispatcher("ViewSuccess.jsp");
			request.setAttribute("list", list);
			rd.forward(request, response);
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("FindFailure.jsp");
				rd.forward(request, response);
			}
		}

	}

	}
