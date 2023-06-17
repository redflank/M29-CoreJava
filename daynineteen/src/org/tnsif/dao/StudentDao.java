package org.tnsif.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//this layer contains necessary database information
public class StudentDao {
	/*
	 * A connection (session) with a specific database. SQL statements are executed
	 * and results are returned within the context of a connection.
	 */
	public Connection createConnection() {
		// to connect with the database
		String url = "jdbc:mysql://127.0.0.1:3306/fastandfurious";
		String username = "root";
		String password = "root";
		
		try {
			//if driver class name is incorrect then it will be handled by using catch block
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Invalid Driver class name");
		}
		Connection connection;
		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			System.out.println("Invalid Credentials");
			connection = null;
			return connection;
		}
		
		
		return null;
	}
}
