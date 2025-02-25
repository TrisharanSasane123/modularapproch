package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class School {
	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate(
				"insert into School values(1,'morden','pune'),(2,'rjspm','pune'),(3,'pratibha','pune'),(4,'jspm','pune'),(5,'wadiya','pune')");
		System.out.println("School data inserted successfully....");
		c.close();
	}

	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("update School set name='priyadarshani' where id=1");
		System.out.println("School data updated successfully....");
		c.close();
	}
	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from School where id=1");
		System.out.println("School data deleted successfully....");
		c.close();
	}
	
	public void getallData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from School");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
	}
	
	public static void main(String[] args) throws Exception {
		School sc = new School();
		//sc.insertData();
		//sc.updateData();
		//sc.deleteData();
		sc.getallData();

	}

}
