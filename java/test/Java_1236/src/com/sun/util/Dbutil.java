package com.sun.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbutil {

	private final static String URL = "jdbc:mysq//localhost:3306/classwork";
	private final static String USER = "D6_87105_Pawan";
	private final static String PASS = "password";
	
	public static Connection getConnection() throws SQLException  {
		
		return DriverManager.getConnection(URL,USER,PASS);
	}
}
