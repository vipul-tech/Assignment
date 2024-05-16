package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcProgram7 {

	public static void main(String[] args) throws SQLException  {
		//List<Student> studentList = new ArrayList<Student>();

		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String username="system";
		String password="123456"; // this way of using passwords openly in code is not 
		// recommended
        String updateCommand =" UPDATE stud SET firstname= ?, lastname=?, age=? WHERE rollno=? ";
		Connection cn = null;
		PreparedStatement pst = null;
		cn = DriverManager.getConnection(url,username,password);
		pst = cn.prepareStatement(updateCommand);
		pst.setString(1,"Rohan");
		pst.setString(2,"Sharma");
		pst.setInt(3, 23);
		pst.setInt(4,110);  
		pst.executeUpdate();
		System.out.println("Record updated..");
	}
}
