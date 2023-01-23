package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RunJDBCPreparedStatementUpdate {

	public static void main(String[] args) {
		
		String name = "Roy Krishna";
		String address = "ATK";
		int id = 10;

		final String USERNAME = "root";
		final String PASSWORD = "root";
		final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		final String CONNECTION_URL = "jdbc:mysql://localhost:3306/student_management_db";
		final String SQL = "UPDATE students_tb SET name = ?,address = ? WHERE id = ?";

		try {

			// register the driver class
			Class.forName(DRIVER_CLASS);
			// create a connection object
			Connection connection = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);

			/*** EXECUTE SQL QUERIES ON THE CONNECTION ***/

			// create a prepared statement object
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setString(1,name);
			preparedStatement.setString(2, address);
			preparedStatement.setInt(3, id);
			
			// execute the query on the statement
			int noOfRowsAffected = preparedStatement.executeUpdate();

			if (noOfRowsAffected > 0) {
				System.out.println("Rows affected : " + noOfRowsAffected);
			} else {
				System.out.println("No rows affected");
			}

			// close the connections
			preparedStatement.close();
			connection.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
