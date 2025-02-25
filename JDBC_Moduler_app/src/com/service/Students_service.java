package com.service;

import com.dao.Students_dao;

public class Students_service {
	public void insertData() throws Exception {
		Students_dao sd = new Students_dao();
		sd.insertData();
	}

	public void deleteData() throws Exception {
		Students_dao sd = new Students_dao();
		sd.deleteData();

	}
	public void updateData() throws Exception {
		Students_dao sd = new Students_dao();
		sd.updateData();
	}

	public void getAllData() throws Exception{
		Students_dao sd = new Students_dao();
		sd.getAllData();
		
		
	}
		

}
