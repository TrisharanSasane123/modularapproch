package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Students {
	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("update students set name='ram' where id=1");
		System.out.println("Data updated successfully...");
		c.close();
	}

	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from students where id=1");
		System.out.println("Data delete successfully...");
		c.close();
	}

	public static void main(String[] args) throws Exception {
		Students s = new Students();
		// s.updateData();
		s.deleteData();

	}

}
