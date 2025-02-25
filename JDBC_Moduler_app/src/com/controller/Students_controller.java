package com.controller;

import com.service.Students_service;

public class Students_controller {
	public static void main(String[] args)throws Exception {
		Students_service ss = new Students_service();
		//ss.insertData();
		//ss.deleteData();
		//ss.updateData();
		ss.getAllData();
	}

}
