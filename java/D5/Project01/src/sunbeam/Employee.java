package sunbeam;

import java.util.Scanner;

public class Employee {

	private String firstName;
	private String lastName;
	private int SSN;
	
	public Employee()
	{
		this(null, null, 0);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	public Employee(String firstName, String lastName, int sSN) {
		this.firstName = firstName;
		this.lastName = lastName;
		SSN = sSN;
	}
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Firstname : ");
		firstName = sc.next();
		System.out.print("Enter the Lastname : ");
		lastName = sc.next();
		System.out.println("Enter the SSN");
		SSN = sc.nextInt();
		//sc.close();
	}
	public void display()
	{
		System.out.println("Name = " + firstName + " " + lastName);
		System.out.println("SSN = " + SSN);
	}
}