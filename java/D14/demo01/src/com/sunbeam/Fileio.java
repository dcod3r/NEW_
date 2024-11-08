package com.sunbeam;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileio {
	
	public static void writeData(Employee f)
	{
		try (FileOutputStream fos = new FileOutputStream("Employee.db", true)){
			try(DataOutputStream dos = new DataOutputStream(fos)){
				dos.writeInt(f.empid);
				dos.writeUTF(f.name);
				dos.writeDouble(f.Salary);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void readData()
	{
		try (FileInputStream fis = new FileInputStream("Employee.db"))
		{
			try(DataInputStream dis = new DataInputStream(fis))
			{
				while(true)
				{
					int id = dis.readInt();
					String name = dis.readUTF();
					double salary = dis.readDouble();
					
					Employee e = new Employee(id, name, salary);
					System.out.println(e);
				}
			}	
		}catch(EOFException e) {	System.out.println("Ended");}
		
		catch (IOException e) {	e.printStackTrace();	}
	}
	public static void main(String[] args) {
		Employee e = new Employee(01, "Anil", 10000);
		Employee e1 = new Employee(02, "Pawan", 20000);
		Employee e2 = new Employee(03, "Akankasha", 30000);
		Employee e3 = new Employee(04, "Aman", 40000);
		
//		writeData(e);
//		writeData(e1);
//		writeData(e2);
//		writeData(e3);
		
		readData();
		
	}

}
