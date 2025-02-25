package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Bike {
	public void insertData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("insert into Bike values(1,'classic350','Royal Enfield'),(2,'Pulsar','Bajaj'),(3,'r15','Yamaha'),(4,'gt650','Royal enfield'),(5,'ninja','kawasaki')");
		System.out.println("Bike data is inserted..");
		c.close();
		
	}
	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("update Bike set name='Himalaya' where b_no=4");
		System.out.println("Bike data updated successfully....");
		c.close();
	}
	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from Bike where b_no=1");
		System.out.println("Bike data deleted successfully....");
		c.close();
	}
	
	public void getallData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from Bike");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
	}
	
	public static void main(String[] args) throws Exception {
		Bike b = new Bike();
		//b.insertData();
		//b.updateData();
		//b.deleteData();
		b.getallData();
	}

}
