package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.Employee;

public class EmployeeDAOSql implements EmployeeDAO {
	Connection cn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	public EmployeeDAOSql() {
		try {
			cn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addRecord(Employee employee) {
		try {
			pst = cn.prepareStatement(INSERT_COMMAND);
			pst.setInt(1, employee.getEmpId());
			pst.setString(2, employee.getName());
			pst.setInt(3, employee.getAge());
			pst.setString(4, employee.getDesig());
			pst.setInt(5, employee.getSalary());
			pst.executeUpdate();
			System.out.println("record added...");
			pst.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> studentList = new ArrayList<Employee>();
		  try {
			pst = cn.prepareStatement(SELECT_COMMAND);
			rs = pst.executeQuery();
			while(rs.next()){
				int empId = rs.getInt(1);
				String name = rs.getString(2);
				int age= rs.getInt(3);
				String desig = rs.getString(4);
				int salary = rs.getInt(5);
				Employee temp = new Employee(empId, name, age, desig, salary);
				studentList.add(temp);
				
			}
			rs.close();
			pst.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		return studentList;
	}
	
}
