package com.tms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.tms.bean.Trainnee;
import com.tms.dao.TMSDAO;

/**
 * Servlet implementation class LMSMain
 */
@WebServlet("/TMSMain")
public class TMSMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TMSMain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		String id=request.getParameter("tid");
		String name=request.getParameter("tname");
		String dept=request.getParameter("tdept");
		String role=request.getParameter("trole");
		Trainnee e =new Trainnee(id,name,dept,role);
		TMSDAO tms=new TMSDAO();
		if("Insert".equals(request.getParameter("ins"))) {
			try
			{
				tms.doInsert(e);
				RequestDispatcher rd= request.getRequestDispatcher("Insertsuccess.jsp");
				rd.forward(request, response);
			}
			catch(Exception e1)
			{
				RequestDispatcher rd= request.getRequestDispatcher("Insertfailure.jsp");
				rd.forward(request, response);
				//out.println(e1);
			}
		}
		else if("Delete".equals(request.getParameter("del"))) {
			String id1 = request.getParameter("id");
			int n = 0;
			try {
				 n=tms.dodelete(id1);         
				//out.println("Deleted......");
			}
			catch(Exception e1) {
				e1.printStackTrace();
			}
			if(n>0)
			{
				RequestDispatcher rd=request.getRequestDispatcher("DeleteSuccess.jsp");
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("DeleteFailure.jsp");
				rd.forward(request,response);
			}
		}
		else if("Update".equals(request.getParameter("upd")))
		{
			int n=0;
			try 
			{
				tms.doUpdate(e);
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
			if(n>0)
			{
				RequestDispatcher rd= request.getRequestDispatcher("UpdateFailure.jsp");
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("UpdateSuccess.jsp");
				rd.forward(request,response);
			}
		}
		else if ("FindByID".equals(request.getParameter("find"))) {
              try {
				Trainnee result = tms.doFind(id);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//RequestDispatcher rd = request.getRequestDispatcher("findbyid.jsp");
			Trainnee e1 = null;
			try {
				e1 = tms.doFind(id); 
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
//          
			if (e1 != null) {
				RequestDispatcher rd = request.getRequestDispatcher("Found.jsp");
				rd.include(request, response);
				out.println("<table border=1><tr>");
				out.println("<th>TraineeId</th>");
				out.println("<th>Traineename</th>");
				out.println("<th>Traineedept</th>");
				out.println("<th>Trainingrole</th>");
				out.println("</tr>");

				out.println("<tr>");
				out.println("<td>" + e1.getTraineeid() + "</td>");
				out.println("<td>" + e1.getTraineename() + "</td>");
				out.println("<td>" + e1.getTraineedept() + "</td>");
				out.println("<td>" + e1.getTrainingrole() + "</td>");
				out.println("</tr>");
				out.println("</table>");

			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("Notfound.jsp");
				rd.include(request, response);
				//out.println("<h1><font color=red> Invalid </font></h1>");
			}

		} 
		else if ("View".equals(request.getParameter("vw"))) 
		{

			RequestDispatcher rd = request.getRequestDispatcher("Findbyid.jsp");
			LinkedList<Trainnee> list1 = new LinkedList<Trainnee>();
			try {
				list1 = tms.doView();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			rd.include(request, response);
			out.println("<table border=1><tr>");
			out.println("<th>TraineeId</th>");
			out.println("<th>Traineename</th>");
			out.println("<th>Traineedept</th>");
			out.println("<th>Trainingrole</th>");
			out.println("</tr>");
			for (Trainnee e3 : list1) 
			{
				out.println("<tr>");
				out.println("<td>" + e3.getTraineeid() + "</td>");
				out.println("<td>" + e3.getTraineename() + "</td>");
				out.println("<td>" + e3.getTraineedept() + "</td>");
				out.println("<td>" + e3.getTrainingrole() + "</td>");
				out.println("</tr>");

			}
			out.println("</table>");

		} 
		else {
			out.println("Invalid action.");
		}
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
			

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}


