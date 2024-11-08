package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectUsingJava {

	public static void main(String[] args) {
		
		final String URL = "jdbc:mysql://localhost:3306/classwork";
		final String USER = "D6_87105_Pawan";
		final String PASSWORD = "password";
		
		try(Connection connection = DriverManager.getConnection(URL,USER,PASSWORD))
		{
			System.out.println("Connection Stablished\n");
			try(Statement selectStmt = connection.createStatement())
			{
				String query = "SELECT * FROM Employee";
				selectStmt.execute(query);
				ResultSet rs = selectStmt.getResultSet();
				
				while(rs.next())
				{
					int empid = rs.getInt(1);
					String name = rs.getString(2);
					double salary = rs.getDouble(3);
					System.out.println(empid + "," + name + "," + salary);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
