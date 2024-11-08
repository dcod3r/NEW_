package com.practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test {

	
	private static final String FILE = "Employee1.db";
	
	public static void write (List<Employee> empList)
	{
		try(FileOutputStream fos = new FileOutputStream(FILE))
		{
			try(BufferedOutputStream bos = new BufferedOutputStream(fos))
			{
				 try(ObjectOutputStream oos = new ObjectOutputStream(fos))
				 {
					 oos.writeObject(empList);
				 }
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void read()
	{
		try(FileInputStream fis = new FileInputStream(FILE))
		{
			try(BufferedInputStream bis = new BufferedInputStream(fis))
			{
				try(ObjectInputStream ois = new ObjectInputStream(bis))
				{
					 List<Employee> empList = (List<Employee>) ois.readObject();
					 empList.forEach(System.out::println);
					 //System.out.println(empList);
				}
			}
		}catch(ClassNotFoundException e) {	e.printStackTrace(); }
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(01, "Akankasha", 20000));
		empList.add(new Employee(02, "Aman", 20000));
		empList.add(new Employee(03, "Ravi", 20000));
		empList.add(new Employee(04, "Pawan", 20000));
		empList.add(new Employee(05, "Kartik", 20000));
		
		//write(empList);
		read();
	}

}
