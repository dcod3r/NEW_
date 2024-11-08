package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectLessSalaryLessThan {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/classwork";
		final String USERNAME = "D6_87105_Pawan";
		final String PASSWORD = "password";

		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			try (Statement selectStmt = connection.createStatement()) {

				System.out.println("Enter the salary - ");
				String sal = new Scanner(System.in).nextLine();

				String sql = "SELECT * FROM Employee WHERE salary>" + sal;
				selectStmt.execute(sql);
				ResultSet rs = selectStmt.getResultSet();
				while(rs.next())
				{
					int empid = rs.getInt(1);
					String name = rs.getString(2);
					double salary = rs.getDouble(3);
					System.out.println(empid + "," + name + "," + salary);
				}
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}