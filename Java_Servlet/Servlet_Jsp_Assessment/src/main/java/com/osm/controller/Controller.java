package com.osm.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import com.osm.bean.Member;
import com.osm.dao.OsmDao;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String button = request.getParameter("action");

		OsmDao dao = new OsmDao();

		if (button.equalsIgnoreCase("Insert")) {
			Member member = new Member(Integer.parseInt(request.getParameter("id")), request.getParameter("name"),
					request.getParameter("location"), request.getParameter("email"),
					Integer.parseInt(request.getParameter("total")));
			int n = 0;
			RequestDispatcher rd = request.getRequestDispatcher("InsertMember.jsp");
			try {
				n = dao.insert(member);
			} catch (SQLException e) {
				// TODO: handle exception
			}

			if (n > 0) {
				rd.include(request, response);
				out.println("<h1><font color=green>Member Details Inserted Successfully</font></h1>");
			} else {
				rd.include(request, response);
				out.println("<h3><font color=red>Member Details Not Inserted</font></h3>");
			}
		}

		else if (button.equalsIgnoreCase("update")) {
			Member Member = new Member(Integer.parseInt(request.getParameter("id")), request.getParameter("name"),
					request.getParameter("location"), request.getParameter("email"),
					Integer.parseInt(request.getParameter("total")));
			RequestDispatcher rd = request.getRequestDispatcher("UpdateMember.jsp");
			int n = 0;
			try {
				n = dao.update(Member);
			} catch (SQLException e) {
				// TODO: handle exception
			}

			if (n > 0) {
				rd.include(request, response);
				out.print("Member Details Updated Successfully");
			} else {
				out.print("Member Details Not Updated");
			}
		}

		else if (button.equalsIgnoreCase("view")) {
			int count = 0;
			RequestDispatcher rd = request.getRequestDispatcher("ViewAllMembers.jsp");
			ArrayList<Member> almem = new ArrayList<Member>();
			try {
				almem = dao.viewAll();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			out.println(
					"<table border=2px ><tr><th>Member ID</th><th>Name</th><th>Location</th><th>Email</th></tr>");
//				while(rs.next()) {
//					out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td> "+rs.getString(3)+"</td></tr>");
//					count++;
//				}

			for (Member mem : almem) {
				out.println("<tr><td>" + mem.getId() + "</td><td>" + mem.getName() + "</td><td>" + mem.getLocation()
						+ "</td><td> " + mem.getEmail() + "</td></tr>");
				count++;
			}
			out.println("</table>");
			rd.include(request, response);
			if (count < 1) {
				out.println("No records found");
			}
		}

		else if (button.equalsIgnoreCase("find")) {
			int count=0;
			int id = Integer.parseInt(request.getParameter("id"));
			ArrayList<Member> almem = new ArrayList<Member>();
			try {				
				almem = dao.find(id);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			out.println("<table align=center class=container border=1><thead><tr><th><h3>Member ID</h3></th><th><h3>Name</h3></th><th><h3>Location</h3></th><th><h3>Email</h3></th><th><h3>Total Survey Taken</h3></th></tr></thead>");
			//	while(rs.next()) {
			//		out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td> "+rs.getString(3)+"</td></tr>");
			//		count++;
			//	}
			
			for(Member mem : almem) {
				out.println("<tr><td>" + mem.getId() + "</td><td>" + mem.getName() + "</td><td>" + mem.getLocation()
				+ "</td><td> " + mem.getEmail() + "</td></td>" + "</td><td> " + mem.getTotalSurveytaken() + "</td></tr>");
				count++;
			}
			out.println("</table>");
		}

		else if (button.equalsIgnoreCase("delete")) {
			int n = 0;
			try {
				n = dao.delete(Integer.parseInt(request.getParameter("id")));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			if (n > 0) {
				out.print("Member Details Deleted Successfully");
			} else {
				out.print("No Recore found");
			}
		}
	}

}
