package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcProgram1 {
	public static void main(String[] args) throws SQLException  {
		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String username="system";
		String password="123456"; // this way of using passwords openly in code is not 
								// recommended
		String insertCommand="INSERT INTO stud VALUES(104,'Scott','Urman',21)";
		Connection cn = null;
		Statement st = null;
		cn = DriverManager.getConnection(url,username,password);
		st = cn.createStatement();
		int x = st.executeUpdate(insertCommand);
		System.out.println(x +"  record(s) added...");	
	}
}
