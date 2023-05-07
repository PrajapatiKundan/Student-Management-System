package org.studentmanagementsystem.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.studentmanagementsystem.dao.DBConnection;

public class AuthenticateService {
	public static boolean authenticate(String userName, String password) {
		boolean isValidUser = false;
		try {
			Connection connection = DBConnection.getConnectionToDatabbase();
			
			String query = "select * from admin where user_name=? and password=?";
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setString(1, userName);
			statement.setString(2, password);
			
			ResultSet set = statement.executeQuery();
			
			while(set.next()) {
				isValidUser = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isValidUser;
	}
}
