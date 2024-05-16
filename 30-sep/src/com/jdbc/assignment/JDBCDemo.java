package com.jdbc.assignment;

import java.sql.*;

public class JDBCDemo {
	static Connection con;
	static
	{
    	try{
        		Class.forName("oracle.jdbc.driver.OracleDriver");
        		con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","system","123456");
    	}
    	catch(ClassNotFoundException | SQLException e){
        		e.printStackTrace();
    	}
	}
	
	static void display() {
		String query = "select * from Stud";
    	try {
        		Statement ps = con.createStatement();
        		ResultSet res = ps.executeQuery(query);

        		while (res.next()){
            		System.out.println("Roll No : "+res.getInt(1));
            		System.out.println("First Name : "+res.getString(2));
            		System.out.println("Last Name : "+res.getString(3));
            		System.out.println("Age : "+res.getInt(4));
            		System.out.println();
        		}
        		res.close();
        		ps.close();
    	} 
    	catch (SQLException e) {
        		e.printStackTrace();
    	}
	}
	static void insert() {
		try {
	         Statement stmt = con.createStatement();
	         System.out.println("Inserting records into the table...");          
	         String sql = "INSERT INTO Stud VALUES (100, 'Smriti', 'Sagar', 20)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO Stud VALUES (101, 'Rohan', 'Singh', 23)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO Stud VALUES (102, 'Vipul', 'Kumar', 22)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO Stud VALUES(103, 'Sumit', 'Mittal', 21)";
	         stmt.executeUpdate(sql);
	         System.out.println("Inserted records into the table...");   	  
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	}
	public static void main(String[] args) {
	      insert();
	      display();
	   }
	}
