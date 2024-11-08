package sunbeam;

import java.util.Scanner;

class SalariedEmployee extends Employee{
	private double weeklySalary;

	public SalariedEmployee() {
		super();
		this.weeklySalary = 0;
	}

	public SalariedEmployee(String firstName, String lastName, int sSN,double weeklySalary) {
		super(firstName,lastName,sSN);
		this.weeklySalary = weeklySalary;
	}
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		super.accept();
		System.out.println("Enter the Salary of Salaried Employee");		
		weeklySalary = sc.nextDouble();
	}
	
	public void display()
	{
		super.display();
		System.out.println("Weekly Salary = " + weeklySalary);
	}
}
