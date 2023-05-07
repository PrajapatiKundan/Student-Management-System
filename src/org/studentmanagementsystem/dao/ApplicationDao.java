package org.studentmanagementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.studentmanagementsystem.beans.Student;

public class ApplicationDao {
	public static List<Student> getAllStudents() {
		List<Student> students = new ArrayList<>();
		Student student = null;

		try {
			Connection connection = DBConnection.getConnectionToDatabbase();
			String query = "select * from students";
			Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery(query);
			
			if(set!=null) {
				while (set.next()) {
					student = new Student();
					student.setRollNumer(set.getInt("roll_number"));
					student.setName(set.getString("name"));
					student.setFatherName(set.getString("father_name"));
					student.setCity(set.getString("city"));
					student.setPhone(set.getString("phone"));
					student.setCourse(set.getString("course"));
					students.add(student);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return students;
	}
	
	public static int registerStudent(Student student) {
		int rowsUpdated = 0;
		try {
			Connection connection = DBConnection.getConnectionToDatabbase();
			String query = "insert into students values (?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, student.getRollNumer());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getFatherName());
			preparedStatement.setString(4, student.getCity());
			preparedStatement.setString(5, student.getPhone());
			preparedStatement.setString(6, student.getCourse());
			rowsUpdated = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowsUpdated;
	}
	
	public static int deleteStudentRecord(int rollNumber) {
		int rowsUpdated = 0;
		
		try {
			Connection connection = DBConnection.getConnectionToDatabbase();
			String query = "delete from students where roll_number=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, rollNumber);
			rowsUpdated = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowsUpdated;
	}
}
