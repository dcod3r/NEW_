package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestingJbdc01 {

	public static void main(String[] args) {
		
//		try {
//			Connection connection = DriverManager.getConnection("jdbc : mysql : // loacalhost :: 3306 / classwork", "D6_87105_Pawan", "password");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classwork", "D6_87105_Pawan", "password");
//			System.out.println("Connection successful");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classwork", "D6_87105_Pawan", "password");
				System.out.println("Connection is Sucesfull");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
