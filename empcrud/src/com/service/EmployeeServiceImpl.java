package com.service;

import java.util.List;

import com.dao.EmployeeDAO;
import com.dao.EmployeeDAOSql;
import com.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDAO dao = new EmployeeDAOSql();
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}
	@Override
	public void addRecord(Employee employee) {
		// TODO Auto-generated method stub
		dao.addRecord(employee);
	}

}
