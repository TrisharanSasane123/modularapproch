package com.service;

import com.dao.Employee_dao;

public class Employee_service {
	public void insertData() throws Exception{
		Employee_dao ed = new Employee_dao();
		ed.insertData();
		
		
		
	}
	public void updateData() throws Exception{
		Employee_dao ed = new Employee_dao();
		ed.updateData();
	}
	public void deleteData() throws Exception{
		Employee_dao ed = new Employee_dao();
		ed.deleteData();
	
	}
	public void getAllData()throws Exception{
		Employee_dao ed = new Employee_dao();
		ed.getallData();
		
	}


}
