package com.dao;

import java.util.List;

import com.dto.Employee;

public interface EmployeeDAO {
	public static final String URL ="jdbc:oracle:thin:@//localhost:1521/XE";
	public static final String USERNAME="system";
	public static final String PASSWORD="123456";
	public static final String INSERT_COMMAND="INSERT INTO Em VALUES(?,?,?,?,?)";
	public static final String SELECT_COMMAND="SELECT * FROM Em";
	void addRecord(Employee employee);
	List<Employee> getAllEmployees();
}
