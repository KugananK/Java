package com.qa;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcDemo {

	final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://localhost:3306/cafe";
	final String USER = "root";
	final String PASSWORD = "root";

	public Connection connect() {

		
	
		Connection conn = null;
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			System.out.println("connected to database");
			
		} catch (Exception e) {
			e.printStackTrace();
			}
		
		return conn;
	}
}
