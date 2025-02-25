package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Fruits {
	public void insertData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("insert into Fruits values(1,'banana','yellow'),(2,'apple','red'),(3,'mango','yellow'),(4,'watermellon','green'),(5,'dragon','pink')");
		System.out.println("data is inserted...");
		c.close();
	}
	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("update Fruits set name='grapes' where id=1");
		System.out.println("Fruits data updated successfully....");
		c.close();
	}
	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from Fruits where id=2");
		System.out.println("Fruits data deleted successfully....");
		c.close();
	}
	
	public void getallData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from Fruits");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
	}
	
		public static void main(String[] args) throws Exception {
			Fruits f = new Fruits();
			//f.insertData();
			//f.updateData();
			//f.deleteData();
			f.getallData();
		}
}
