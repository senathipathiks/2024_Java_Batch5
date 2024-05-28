package com.car.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.car.bean.Car;
import com.car.dao.CarDAO;


/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		CarDAO car = new CarDAO();
		String action = request.getParameter("Insert");
		
		if(action.equals("Add") ) 
		{
			Car e = new Car(request.getParameter("id"),request.getParameter("brand"),request.getParameter("modal"),request.getParameter("price"));
			int n = 0;
			try {
				n = car.doInsert(e);
			} catch (SQLException e1) {
				e1.printStackTrace();
			} 
			
			if(n>0)
			{
				RequestDispatcher rd = request.getRequestDispatcher("InsertSuccess.jsp");
				rd.forward(request, response);
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("InsertFailure.jsp");
				rd.include(request, response);	
			}
		}
		if(action.equals("Delete"))
		{
			String id = request.getParameter("id");
			
			int n = 0;
			try {
				n = car.doDelete(id);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(n>0)
			{
				RequestDispatcher rd = request.getRequestDispatcher("DeleteSuccess.jsp");
				rd.forward(request, response);	
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("DeleteFailure.jsp");
				rd.forward(request, response);
			}
		}	
		if(action.equals("Update")) {
			
			Car e1 = new Car(request.getParameter("id"),request.getParameter("brand"),request.getParameter("modal"),request.getParameter("price"));
			
			int n;
			try {
				n = car.doUpdate(e1);
				
				if(n>0)
				{
					RequestDispatcher rd = request.getRequestDispatcher("UpdateSuccess.jsp");
					rd.forward(request, response);	
				} else {
					response.sendRedirect("UpdateFailure.jsp");
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}				
		if(action.equals("Search"))
		{					
			String id = request.getParameter("id");
			try{
				ArrayList<Car> list = car.doFind(id);	
				
				if(!list.isEmpty()) {
					RequestDispatcher rd = request.getRequestDispatcher("FindSuccess.jsp");
					request.setAttribute("resultList", list);
					rd.forward(request, response);			
				}
				else {
					RequestDispatcher rd = request.getRequestDispatcher("FindFailure.jsp");
					rd.forward(request, response);	
				}
				
			}catch (Exception e) {
				System.out.println(e);
			}
		}
		
		
		
		
		
	}

}
