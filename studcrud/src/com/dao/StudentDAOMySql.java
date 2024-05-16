package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.Student;

public class StudentDAOMySql implements StudentDAO {

	Connection cn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	public StudentDAOMySql() {
		try {
			cn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void addRecord(Student student) {
	  
		try {
			pst = cn.prepareStatement(INSERT_COMMAND);
			pst.setInt(1, student.getStdNumber());
			pst.setString(2, student.getFirstName());
			pst.setString(3, student.getLastName());
			pst.executeUpdate();
			System.out.println("record added...");
			pst.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public List<Student> getAllStudents() {
		  List<Student> studentList = new ArrayList<Student>();
		  try {
			pst = cn.prepareStatement(SELECT_COMMAND);
			rs = pst.executeQuery();
			while(rs.next()){
				int stdNumber = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName= rs.getString(3);
				Student temp = new Student(stdNumber, firstName, lastName);
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
