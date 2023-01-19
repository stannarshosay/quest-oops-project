package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//JAVA DATABASE CONNECTIVITY API(APPLICATION PROGRAMMING INTERFACE)
public class RunJDBCStatementInsert {

	public static void main(String[] args) {
		
		final String USERNAME = "root";
		final String PASSWORD = "root";
		final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		final String CONNECTION_URL = "jdbc:mysql://localhost:3306/student_management_db";
		
		
		try {
			
			
			
			//register the driver class
			Class.forName(DRIVER_CLASS);	
			//create a connection object
			Connection connection = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
			
			System.out.println("Connection is successfull!");
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
