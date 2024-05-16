package com.service;

import java.util.List;

import com.dto.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	void addRecord(Employee employee);
	
}
