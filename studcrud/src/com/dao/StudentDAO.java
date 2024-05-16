package com.dao;

import java.util.List;

import com.dto.Student;

public interface StudentDAO {
	public static final String URL ="jdbc:oracle:thin:@//localhost:1521/XE";
	public static final String USERNAME="system";
	public static final String PASSWORD="123456";
	public static final String INSERT_COMMAND="INSERT INTO student VALUES(?,?,?)";
	public static final String SELECT_COMMAND="SELECT * FROM student";
	void addRecord(Student student);
	List<Student> getAllStudents();
}
