package org.studentmanagementsystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnectionToDatabbase() {
		Connection connection = null;

		try {
			// 1. Register driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver registered succesfully!");

			// 2. Establish connection with database
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system", "root", "root");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver is missing");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Connection fail");
			e.printStackTrace();
		}

		if (connection != null) {
			System.out.println("Connection made to DB!");
		}
		return connection;
	}
}
