package com.car.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.car.bean.Car;
import com.car.util.Carutil;


public class CarDAO {
	
	List<Car> Emp = new ArrayList<>();

	public int doInsert(Car e) throws SQLException
	{
		Connection con1 = Carutil.getConnection();
		String sql = "insert into car values(?,?,?,?)";
		PreparedStatement ps = con1.prepareStatement(sql);
		
		ps.setString(1, e.getcId());
		ps.setString(2,e.getcBrand());
		ps.setString(3, e.getcModal());
		ps.setString(4, e.getcPrice());
	
		
		int n = ps.executeUpdate();
		con1.close();
		return n;
	}
	
	public int doDelete(String id) throws SQLException
	{
		Connection con1 = Carutil.getConnection();
		String sql = "Delete from car where cId=?";
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1, id);		
		int n = ps.executeUpdate();
		con1.close();
		return n;
	}
	public int doUpdate(Car e) throws SQLException
	{
		int cnt = 0;
		
		Connection con1 = Carutil.getConnection();
		String sql = "update car set cBrand=?, cModal=?, cPrice=? where CId=?";
		
		PreparedStatement ps = con1.prepareStatement(sql);
		
		ps.setString(1,e.getcBrand());
		ps.setString(2, e.getcModal());
		ps.setString(3, e.getcPrice());
		ps.setString(4, e.getcId());
		
		
		 cnt = ps.executeUpdate();
		con1.close();
		return cnt;
	}
	
	public ArrayList<Car> viewAll() throws SQLException 
	{
		Connection con1 = Carutil.getConnection();
		int count = 0;
		String sql = "Select * from car";
		PreparedStatement ps = con1.prepareStatement(sql);
		ResultSetMetaData rsmd = ps.getMetaData();
		ResultSet rs = ps.executeQuery();
		ArrayList<Car> al = new ArrayList<Car>();
		
		while(rs.next()) {
			
			Car car = new Car();
			
			car.setcId(rs.getString(1));
			car.setcBrand(rs.getString(2));
			car.setcModal(rs.getString(3));
			car.setcPrice(rs.getString(4));
						
			al.add(car);
		}
		return al;
	}	
	public ArrayList<Car> doFind(String id) throws SQLException 
	{
		Connection con1 = Carutil.getConnection();
		int count = 0;		
		String sql = "Select * from car where CId=?" ;
		PreparedStatement ps = con1.prepareStatement(sql);
		ps.setString(1,id);
		ResultSet rs = ps.executeQuery();
		
		ArrayList<Car> al = new ArrayList<Car>();
		
		while(rs.next()) {
			
			Car car = new Car();
			car.setcId(rs.getString(1));
			car.setcBrand(rs.getString(2));
			car.setcModal(rs.getString(3));
			car.setcPrice(rs.getString(4));		
			
			al.add(car);
		}
		return al;
	}
}
