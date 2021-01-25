package com.csi.service;

import com.csi.dao.EmployeeDao;
import com.csi.dao.EmployeeDaoImpl;

public class EmployeeService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao employeeDaoImpl = new EmployeeDaoImpl();
		
		//employeeDaoImpl.saveData();
		
		employeeDaoImpl.hibernateNQ();
	}

}
