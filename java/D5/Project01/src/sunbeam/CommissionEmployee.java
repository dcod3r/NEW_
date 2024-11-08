package sunbeam;

import java.util.Scanner;

class CommissionEmployee extends Employee{
	
	protected double grossSales;
	protected double commissionRate;
	
	public CommissionEmployee() {
		super();
		this.grossSales = 0;
		this.commissionRate = 0;
	}
	
	public CommissionEmployee(String firstName, String lastName, int sSN, double grossSales, double commissionRate) {
		super(firstName, lastName, sSN);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public void accept()
	{
		super.accept();
		System.out.print("Enter the gross Sales : ");
		Scanner sc = new Scanner(System.in);
		grossSales = sc.nextDouble();
		System.out.println("Enter the Commission Rate");
		commissionRate = sc.nextDouble();
	}
	
	public void display()
	{
		super.display();
		System.out.println("Gross Sale = " + grossSales);
		System.out.println("Commission Rate = " + commissionRate);
	}
}
