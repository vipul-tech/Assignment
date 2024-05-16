package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcProgram4 {
	
	public static void main(String[] args) throws SQLException  {
		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String username="system";
		String password="123456"; // this way of using passwords openly in code is not 
								// recommended
		String insertCommand1="INSERT INTO stud VALUES(110,'Scott','Urman',23)";
		String insertCommand2="INSERT INTO stud VALUES(108,'Adam','Smith',45)";
		String insertCommand3="INSERT INTO stud VALUES(106,'John','Doe',32)";
		String insertCommand4="INSERT INTO stud VALUES(105,'Patrick','Naugt',24)";
	
		Connection cn = null;
		Statement st = null;
	
		cn = DriverManager.getConnection(url,username,password);
		st = cn.createStatement();
		st.addBatch(insertCommand1);
		st.addBatch(insertCommand2);
		st.addBatch(insertCommand3);
		st.addBatch(insertCommand4);
	
	
		st.executeBatch();
		System.out.println("  record(s) added...");
	}
}
