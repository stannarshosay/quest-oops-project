package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// UPDATE students_tb SET address = 'Galaxy' WHERE address = 'World';

// UPDATE students_tb SET address = 'Bangalore',name = 'Sana Nasar' WHERE id = 2;

public class RunJDBCStatementUpdate {

	public static void main(String[] args) {

		String name = "Sonam";
		String address = "Maharashtra";
		int id = 6;

		final String USERNAME = "root";
		final String PASSWORD = "root";
		final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		final String CONNECTION_URL = "jdbc:mysql://localhost:3306/student_management_db";
		final String SQL = "UPDATE students_tb SET name = '" + name + "',address = '" + address + "' WHERE id = " + id;

		try {

			// register the driver class
			Class.forName(DRIVER_CLASS);
			// create a connection object
			Connection connection = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);

			/*** EXECUTE SQL QUERIES ON THE CONNECTION ***/

			// create a statement object
			Statement statement = connection.createStatement();
			// execute the query on the statement
			int noOfRowsAffected = statement.executeUpdate(SQL);

			if (noOfRowsAffected > 0) {
				System.out.println("Rows affected : " + noOfRowsAffected);
			} else {
				System.out.println("No rows affected");
			}

			// close the connections
			statement.close();
			connection.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
