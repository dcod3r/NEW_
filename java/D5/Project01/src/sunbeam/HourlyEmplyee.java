package sunbeam;

import java.util.Scanner;

class HourlyEmployee extends Employee{

	private double wage;
	private int hrs;
	
	public HourlyEmployee() {
		super();
		this.wage = 0;
		this.hrs = 0;
	}
	public HourlyEmployee(String firstName, String lastName, int sSN,double wage, int hrs) {
		super(firstName,lastName,sSN);
		this.wage = wage;
		this.hrs = hrs;
	}
	public void accept()
	{
		super.accept();
		System.out.println("Enter the Wage of Hourly Employee Per hour");
		Scanner sc = new Scanner(System.in);
		wage = sc.nextDouble();
		System.out.println("Enter Hours Worked in a week");
		hrs = sc.nextInt();
		sc.close();
	}
	public double totalWage()
	{
		if(hrs > 40)
			return 40*wage + (hrs-40) * wage * 1.5;
		else 
			return hrs * wage;
	}
	public void display()
	{
		super.display();
		System.out.println("Hours worked = " + hrs);
		System.out.println("Weekly Salary = " + totalWage());
	}
}