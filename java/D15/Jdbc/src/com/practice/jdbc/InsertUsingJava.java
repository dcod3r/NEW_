package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUsingJava {
	public static void main(String[] args) {
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classwork", "D6_87105_Pawan", "password");
			//System.out.println("Connection is Valid");
			
			Statement insertatmt = connection.createStatement();
			
			String query = "INSERT INTO Employee(name,salary) VALUES ('Suresh',20000)";
			insertatmt.execute(query);
			
			insertatmt.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
