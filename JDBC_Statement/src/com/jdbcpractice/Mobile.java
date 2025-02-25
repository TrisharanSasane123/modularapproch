package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Mobile {
	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate(
				"insert into Mobile values(1,'S24','Samsung'),(2,'A77s','Oppo'),(3,'13r','1Plus'),(4,'c3','realme'),(5,'16promax','apple')");
		System.out.println("Mobile data inserted successfully....");
		c.close();
	}

	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("update Mobile set name='15max' where id=5");
		System.out.println("Mobile data updated successfully....");
		c.close();
	}
	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from Mobile where id=4");
		System.out.println("Mobile data deleted successfully....");
		c.close();
	}
	
	public void getallData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from Mobile");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
	
	}
	public static void main(String[] args)throws Exception {
		Mobile m =  new Mobile();
		//m.insertData();
		//m.updateData();
		//m.deleteData();
		m.getallData();
		
	}

}
