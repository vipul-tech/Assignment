package com.service;

import java.util.List;

import com.dto.Student;

public interface StudentService {

	public void addRecord(Student student);

	public List<Student> getAllStudents();

}
