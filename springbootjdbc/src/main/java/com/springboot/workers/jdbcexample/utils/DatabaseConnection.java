package com.springboot.workers.jdbcexample.utils;

import java.sql.*;

public class DatabaseConnection {

	static final String url="jdbc:mysql://localhost:3306/jdbc_demo";
	static final String username ="root";
	static final String password ="Pass@123";
	public static Connection con = null;
	
	private DatabaseConnection() {
		// TODO Auto-generated constructor stub
	}
	public static Connection getConnection() throws SQLException {
		if(con==null) {
			con=DriverManager.getConnection(url,username,password);
			System.out.println("Successfully connected to database server "+
			con.getMetaData().getDatabaseProductName()+" Version "+
					con.getMetaData().getDatabaseProductVersion());
		}
		return con;
		
	}
	public static void closeConnection() throws SQLException {
		con.close();
	}
	
}
