package com.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class  P1{

	public static void main(String[] args) {
//		try (FileReader reader = new FileReader("C:\\Users\\Pawan Kumar Gupta\\Downloads\\github-recovery-codes.txt")) {
//			int ch;
//			while ((ch = reader.read()) != -1) {
//				System.out.print((char) ch);
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try(FileReader readi = new FileReader("C:\\Users\\Pawan Kumar Gupta\\Downloads\\github-recovery-codes.txt"))
		{
			int ch;
			while ((ch = readi.read()) != -1) 
			{
				System.out.print((char) ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
