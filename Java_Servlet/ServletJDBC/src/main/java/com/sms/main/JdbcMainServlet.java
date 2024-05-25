package com.sms.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.dao.SmsDao;
import com.sms.bean.Student;

/**
 * Servlet implementation class JdbcMainServlet
 */
@WebServlet("/JdbcMainServlet")
public class JdbcMainServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String button = request.getParameter("action");

		SmsDao dao = new SmsDao();

		if (button.equalsIgnoreCase("insert")) {
			Student student = new Student(Integer.parseInt(request.getParameter("id")), request.getParameter("name"),
					request.getParameter("city"), request.getParameter("mobile"));
			int n = 0;
			RequestDispatcher rd = request.getRequestDispatcher("InsertStudent.jsp");
			try {
				n = dao.insert(student);
			} catch (SQLException e) {
				// TODO: handle exception
			}

			if (n > 0) {
				rd.include(request, response);
				out.println("<h3><font color=green>Student Details Inserted Successfully</font></h3>");
			}
			else {
				rd.include(request, response);
				out.println("<h3><font color=red>Student Details Not Inserted</font></h3>");
			}
		}
		
		else if (button.equalsIgnoreCase("update")) {
			Student student = new Student(Integer.parseInt(request.getParameter("id")), request.getParameter("name"),
					request.getParameter("city"), request.getParameter("mobile"));
			RequestDispatcher rd = request.getRequestDispatcher("UpdateStudent.jsp");
			int n = 0;
			try {
				n = dao.update(student);
			} catch (SQLException e) {
				// TODO: handle exception
			}

			if (n > 0) {
				rd.include(request, response);
				out.print("Student Details Updated Successfully");
			}
			else {
				out.print("Student Details Not Updated");
			}
		}
		
		else if(button.equalsIgnoreCase("view")) {
			int count=0;
			RequestDispatcher rd = request.getRequestDispatcher("ViewAllStudents.jsp");
			ArrayList<Student> alstu = new ArrayList<Student>();
			try {
				alstu = dao.viewAll();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			out.println("<table border=2px ><tr><th>Student ID</th><th>Name</th><th>City</th><th>Mobile Number</th></tr>");
//				while(rs.next()) {
//					out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td> "+rs.getString(4)+"</td></tr>");
//					count++;
//				}
			
			for(Student stu : alstu) {
				out.println("<tr><td>"+stu.getStuid()+"</td><td>"+stu.getName()+"</td><td>"+stu.getCity()+"</td><td> "+stu.getMobile()+"</td></tr>");
				count++;
			}
			out.println("</table>");
			rd.include(request, response);
			if(count<1) {
				out.println("No records found");
			}
		}
		
		else if(button.equalsIgnoreCase("find")) {
			int count=0;
			ArrayList<Student> alstu = new ArrayList<Student>();
			try {				
				alstu = dao.find(Integer.parseInt(request.getParameter("id")));
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			out.println("<table border=2px ><tr><th>Student ID</th><th>Name</th><th>City</th><th>Mobile Number</th></tr>");
//				while(rs.next()) {
//					out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td> "+rs.getString(4)+"</td></tr>");
//					count++;
//				}
			
			for(Student stu : alstu) {
				out.println("<tr><td>"+stu.getStuid()+"</td><td>"+stu.getName()+"</td><td>"+stu.getCity()+"</td><td> "+stu.getMobile()+"</td></tr>");
				count++;
			}
			out.println("</table>");
			if(count<1) {
				out.println("No records found");
			}
		}
		
		else if(button.equalsIgnoreCase("delete")) {
			int n=0;
			try {
				n = dao.delete(Integer.parseInt(request.getParameter("id")));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			if (n > 0) {
				out.print("Student Details Deleted Successfully");
			}
			else {
				out.print("No Recore found");
			}
		}
	}
}
