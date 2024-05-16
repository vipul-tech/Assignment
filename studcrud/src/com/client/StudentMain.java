package com.client;

import java.util.List;

import com.dto.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;

public class StudentMain {
public static void main(String[] args) {
	StudentService service = new StudentServiceImpl();
	//service.addRecord(new Student(11,"Guest11","Guest11"));
	List<Student> studentList = service.getAllStudents();
	for(Student x : studentList) {
		System.out.println(x.getStdNumber()+" "+x.getFirstName() +" "+x.getLastName());
	}
}
}
