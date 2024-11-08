package com.prt;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;

public class UsingPrintStream {
	private static final String FILE_NAME = "employee5.db";

	public static void write(Employee e) {
		try (PrintStream pout = new PrintStream(FILE_NAME)) {
			//pout.println(e);
			pout.println(e.empid + "," + e.name + "," + e.salary);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}

	public static void read() {
		try (FileInputStream fis = new FileInputStream(FILE_NAME)) {
			try (BufferedInputStream bis = new BufferedInputStream(fis)) {
				try (ObjectInputStream ois = new ObjectInputStream(bis)) {
					Employee emp = (Employee) ois.readObject();
					System.out.println(emp);
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Employee e = new Employee(1, "Anil", 10000);
		write(e);
	}

}
