package com.sun.dao;

import java.sql.Connection;
import java.sql.SQLException;
import com.sun.entity.Employee;
import com.sun.util.Dbutil;
public class EmployeeDao implements AutoCloseable{

	private Connection connection;

	public EmployeeDao() throws SQLException {
		connection = Dbutil.getConnection();
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	public void addEmp(Employee e) throws SQLException
	{
		//add
	}
	
}
