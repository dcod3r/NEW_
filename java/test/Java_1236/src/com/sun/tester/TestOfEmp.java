package com.sun.tester;

import java.sql.SQLException;
import java.util.Scanner;
import com.sun.dao.EmployeeDao;
public class TestOfEmp {

	public static int menu()
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter");
		return choice = sc.nextInt();
	}
	public static void main(String[] args) throws SQLException {
		
		EmployeeDao emp = new EmployeeDao();	
		
		switch(menu()) {
		
		case 1 :
		}
	}
}