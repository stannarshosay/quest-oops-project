package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RunSqlInjectionPreparedStatement {

	public static void main(String[] args) {
		
//		String name = "Sonakshi";
		
		//SQL INJECTION SCRIPT
		String name = "' OR '1'='1";
		
		final String USERNAME = "root";
		final String PASSWORD = "root";
		final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		final String CONNECTION_URL = "jdbc:mysql://localhost:3306/student_management_db";
		final String SQL = "SELECT * FROM students_tb WHERE name = ?";

		try {

			// register the driver class
			Class.forName(DRIVER_CLASS);
			// create a connection object
			Connection connection = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);

			/*** EXECUTE SQL QUERIES ON THE CONNECTION ***/

			// create a statement object
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setString(1, name);
			
			// execute the query on the statement
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				System.out.println(resultSet.getInt("id"));
				System.out.println(resultSet.getString("name"));
				System.out.println(resultSet.getString("address"));
				System.out.println("\n");

			}

			// close the connections
			preparedStatement.close();
			connection.close();
			
			System.out.println("Thank You!");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
