package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcProgram8 {

	public static void main(String[] args) throws SQLException  {
		//List<Student> studentList = new ArrayList<Student>();

		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String username="system";
		String password="123456"; // this way of using passwords openly in code is not 
		Connection cn = null;
		CallableStatement cst = null;
		String caller = "call test(?,?,?,?)";
		cn = DriverManager.getConnection(url,username,password);
		cst = cn.prepareCall(caller);
		cst.setInt(1, 200);
		cst.setString(2, "Ankit");
		cst.setString(3,"Singh");
		cst.setInt(4, 25);
		cst.executeUpdate();
		System.out.println("procedure called successfully");
	}
}
