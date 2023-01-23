package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


// Sonakshi's account logged in
// Sonakshi is logged in with her username => Sonakshi from a website text field
// this her profile page logic
public class RunSqlInjectionStatement {

	public static void main(String[] args) {
		
//		String name = "Sonakshi";
		
		//SQL INJECTION SCRIPT
		String name = "' OR '1'='1";
		
		final String USERNAME = "root";
		final String PASSWORD = "root";
		final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		final String CONNECTION_URL = "jdbc:mysql://localhost:3306/student_management_db";
		final String SQL = "SELECT * FROM students_tb WHERE name = '"+name+"'";

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

			while (resultSet.next()) {

				System.out.println(resultSet.getInt("id"));
				System.out.println(resultSet.getString("name"));
				System.out.println(resultSet.getString("address"));
				System.out.println("\n");

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
