package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcProgram5 {
	
	public static void main(String[] args) throws SQLException  {
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
			int stdNumber = rs.getInt("rollno");
			String firstName = rs.getString("firstname");
			String lastName = rs.getString("lastname");
			int age = rs.getInt("age");
			System.out.println(stdNumber +" " +firstName +" " + lastName+" "+age);
		}
	}
}
