package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateUsingJava {
	public static void main(String[] args) {
		
		final String URL = "jdbc:mysql://localhost:3306/classwork";
		final String USERNAME = "D6_87105_Pawan";
		final String PASS = "password";
		
		try (Connection connection = DriverManager.getConnection(URL,USERNAME,PASS)){
			System.out.println("Connected to DB");
			try(Statement updatestmt = connection.createStatement())
			{
				String query = "UPDATE Employee SET salary = 40000 WHERE name = 'Suresh'";
				updatestmt.execute(query);
				System.out.println("Employee Updated");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
