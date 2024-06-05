package com.lmsdb.main;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.LinkedList;

import com.lmsdb.bean.Employee;
import com.lmsdb.dao.LMSDAO;

/**
 * Servlet implementation class MainServlets
 */
public class MainServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MainServlets() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		// -insert.jsp & update.jsp -----------------------------
		String id = request.getParameter("id");
		String name = request.getParameter("uname");
		String desig = request.getParameter("desig");
		String dept = request.getParameter("dept");
		// ------------------------------------------

		// -delete.jsp ----------------------------
		String deleteid = request.getParameter("deleteid");
		// -------------------------------------------

		// -find.jsp --------------------------------
		String findid = request.getParameter("findid");
		// --------------------------------------------

		String button = request.getParameter("button");

		int cnt = 0;
		int case1 = 0;
		int case2 = 0;
		int case3 = 0;
		int case4 = 0;
		int case5 = 0;
		try {
			if (button.equals("insert")) {
				case1 = 1;
				Employee e = new Employee(id, name, desig, dept);
				LMSDAO lms = new LMSDAO();
				int n = lms.doInsert(e);
				if (n > 0) {
					response.sendRedirect("InsertSuccess.jsp");
				}

			}
			if (button.equals("delete")) {
				case2 = 1;
				LMSDAO lms = new LMSDAO();
				int n = lms.doDelete(deleteid);
				if (n > 0) {
					response.sendRedirect("DeleteSuccess.jsp");
				}
			}
			if (button.equals("update")) {
				case3 = 1;
				Employee e = new Employee(id, name, desig, dept);
				LMSDAO lms = new LMSDAO();
				int n = lms.doUpdate(e);
				if (n > 0) {
					response.sendRedirect("UpdateSuccess.jsp");
				} else {
					response.sendRedirect("UpdateFailure.jsp");
				}
			}
			if (button.equals("find")) {
				case4 = 1;
				LMSDAO lms = new LMSDAO();

				LinkedList<Employee> ls = lms.doFind(findid);
				if (ls.size() > 0) {
					RequestDispatcher rd = request.getRequestDispatcher("FindSuccess.jsp");
					request.setAttribute("ls", ls);
					rd.forward(request, response);
				} else {
					response.sendRedirect("FindFailure.jsp");
				}

			}
			if (button.equals("view")) {
				case5 = 1;
				LMSDAO lms = new LMSDAO();

				LinkedList<Employee> ls = lms.viewAll();
				if (ls.size() > 0) {
					RequestDispatcher rd = request.getRequestDispatcher("ViewAllSuccess.jsp");
					request.setAttribute("ls", ls);
					rd.forward(request, response);
				} else {
					response.sendRedirect("ViewAllFailure.jsp");
				}
			}
		} catch (Exception e1) {
			if (case1 == 1) {
				response.sendRedirect("InsertFailure.jsp");
			}
			if (case1 == 2) {
				response.sendRedirect("DeleteFailure.jsp");
			}
			if (case1 == 3) {
				response.sendRedirect("UpdateFailure.jsp");
			}
			if (case1 == 4) {
				response.sendRedirect("FindFailure.jsp");
			}
			if (case1 == 5) {
				response.sendRedirect("ViewAllFailure.jsp");
			}

		}

	}

}
