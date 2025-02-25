package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) throws Exception{
		// step 2 register and load Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step 3 get connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		
		//step 4 Statement & preparedStatement
		Statement s = c.createStatement();
		
		// step 5  
		s.executeUpdate("insert into Students values(1,'ravi','pune'),(2,'kunal','nashik')");
		
		s.executeUpdate("insert into Employees values(1,'shubham','dev'),(2,'rohan','test'),(3,'aniket','dev'),(4,'akash','marketing'),(5,'sarvesh','dev')");
		
		s.executeLargeUpdate("insert into Cars values(101,'scorpio','black'),(102,'thar','black'),(103,'fortuner','white'),(104,'range rover','red'),(105,'crysta','white')");
		System.out.println("Data is inserted successfully...");
		
		// step 6 close all connection
		c.close();
		
	}

}
