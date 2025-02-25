package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Students_dao {
	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		PreparedStatement ps = c.prepareStatement("insert into Students(id,name,city) values(?,?,?)");
		ps.setInt(1, 5);
		ps.setString(2, "sarvesh");
		ps.setString(3, "nagpur");
		ps.executeUpdate();
		System.out.println("Data is inserted");
		c.close();
	}
	
	public void deleteData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		PreparedStatement ps = c.prepareStatement("delete from Students where id=?");
		ps.setInt(1, 2);
		ps.executeUpdate();
		System.out.println("Data is deleted...");
		c.close();
	}
	public void updateData()throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		PreparedStatement ps = c.prepareStatement("update Students set name=? where id=?");
		ps.setInt(2, 1);
		ps.setString(1, "rahul");
		ps.executeUpdate();
		System.out.println("Data is updated...");
		c.close();
	}
	public void getAllData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		PreparedStatement ps = c.prepareStatement("select * from Students");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3));
		}
	
		
		
	
	}
	}



