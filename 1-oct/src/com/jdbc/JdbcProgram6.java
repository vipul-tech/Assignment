package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcProgram6 {
	
	public static void main(String[] args) throws SQLException  {
		List<Student> studentList = new ArrayList<Student>();
	
		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String username="system";
		String password="123456"; // this way of using passwords openly in code is not 
								// recommended
	
		String selectCommand ="SELECT * FROM stud";
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
	
		cn = DriverManager.getConnection(url,username,password);
		st = cn.createStatement();
		rs = st.executeQuery(selectCommand);
	
		while(rs.next()) {
			int rollNo = rs.getInt("rollno");
			String firstName = rs.getString("firstname");
			String lastName = rs.getString("lastname");
			int age = rs.getInt("age");
			Student temp = new Student(rollNo,firstName,lastName,age);
			studentList.add(temp);	
		}
	
		for(Student x: studentList) {
			System.out.println(x.getRollNo()+" "+x.getFirstName()+" "+x.getLastName()+" "+x.getAge());
		}
	}
}
