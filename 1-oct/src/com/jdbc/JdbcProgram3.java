package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcProgram3 {
	
	public static void main(String[] args) throws SQLException  {
		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String username="system";
		String password="123456"; // this way of using passwords openly in code is not 
								// recommended
		String deleteCommand="DELETE FROM stud WHERE rollno=100";	
		Connection cn = null;
		Statement st = null;	
		cn = DriverManager.getConnection(url,username,password);
		st = cn.createStatement();
		st.executeUpdate(deleteCommand);
		System.out.println("Record deleted..");
	}
}
