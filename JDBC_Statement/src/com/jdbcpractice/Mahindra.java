package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Mahindra {
	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate(
				"insert into Mahindra values(1,'Scorpio','2200000'),(2,'Thar','2400000'),(3,'Bolero','1400000'),(4,'tuv300','1200000'),(5,'xuv7oo','2500000')");
		System.out.println("Data is inserted...");
		c.close();

	}

	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("update Mahindra set m_name='Thar Roxx' where m_no=5");
		System.out.println("data updated successfully....");
		c.close();
	}

	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from Mahindra where m_no=1");
		System.out.println(" data deleted successfully....");
		c.close();
	}

	public void getallData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root", "root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from Mahindra");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		}
	}

	public static void main(String[] args) throws Exception {
		Mahindra m = new Mahindra();
		// m.insertData();
		// m.updateData();
		//m.deleteData();
		m.getallData();
	}
}
