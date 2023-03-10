package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//JAVA DATABASE CONNECTIVITY API(APPLICATION PROGRAMMING INTERFACE)
public class RunJDBCStatementInsert {

	public static void main(String[] args) {
		
		String name = "Vijay";
		String address = "Bangalore";
		
		final String USERNAME = "root";
		final String PASSWORD = "root";
		final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		final String CONNECTION_URL = "jdbc:mysql://localhost:3306/student_management_db";
		final String SQL = "INSERT INTO students_tb(name,address) VALUES('"+name+"','"+address+"')";		
		
		try {
			
			//register the driver class
			Class.forName(DRIVER_CLASS);	
			//create a connection object
			Connection connection = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
			
			/***EXECUTE SQL QUERIES ON THE CONNECTION***/		
			
			//create a statement object
			Statement statement = connection.createStatement();
			//execute the query on the statement			
			int noOfRowsAffected = statement.executeUpdate(SQL);
			
			if(noOfRowsAffected>0) {
				System.out.println("Rows affected : "+noOfRowsAffected);
			}else {
				System.out.println("No rows affected");
			}
			
			//close the connections
			statement.close();
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
