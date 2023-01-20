package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// SELECT * FROM students_tb;
// SELECT name FROM students_tb;
// SELECT id,name FROM students_tb;
// SELECT * FROM students_tb WHERE address = 'Mumbai';
// SELECT * FROM students_tb WHERE name LIKE '%n%';
// SELECT * FROM students_tb WHERE name LIKE '%r';
// SELECT * FROM students_tb WHERE name LIKE 'S%';

public class RunJDBCStatementSelect {
	
	public static void main(String[] args) {

		final String USERNAME = "root";
		final String PASSWORD = "root";
		final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		final String CONNECTION_URL = "jdbc:mysql://localhost:3306/student_management_db";
		final String SQL = "SELECT * FROM students_tb";

		try {

			// register the driver class
			Class.forName(DRIVER_CLASS);
			// create a connection object
			Connection connection = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);

			/*** EXECUTE SQL QUERIES ON THE CONNECTION ***/

			// create a statement object
			Statement statement = connection.createStatement();
			// execute the query on the statement
			ResultSet resultSet = statement.executeQuery(SQL);
			
			
			
			
			
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
