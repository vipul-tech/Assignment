package com.service;

import java.util.List;

import com.dao.StudentDAO;
import com.dao.StudentDAOMySql;
import com.dto.Student;

public class StudentServiceImpl implements StudentService {

	StudentDAO dao = new StudentDAOMySql();
	@Override
	public void addRecord(Student student) {
	     dao.addRecord(student);
		
	}
	@Override
	public List<Student> getAllStudents() {
		 
		return dao.getAllStudents();
	}

}
