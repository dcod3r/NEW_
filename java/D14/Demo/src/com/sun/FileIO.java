package com.sun;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {

	
	public static void writeData(Employee f)
	{
		try (FileOutputStream fos = new FileOutputStream("Employee.db")){
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
		z
	}
	public static void main(String[] args) {
		Employee e = new Employee(01, "Anil", 10000);
		writeData(e);
	}
}