package sunbeam;

import java.util.Scanner;

class SalariedCommissionEmployee extends CommissionEmployee{
	
	private double base_salary;

	public SalariedCommissionEmployee() {
		super();
		this.base_salary = 0;
	}

	public SalariedCommissionEmployee(String firstName, String lastName, int sSN, double grossSales, double commissionRate, double base_salary) {
		super(firstName, lastName, sSN, grossSales, commissionRate);
		this.base_salary = base_salary;
	}
	
	public void accept()
	{
		super.accept();
		System.out.println("Enter Base Salary of Saliried Commission Employee");
		Scanner sc = new Scanner(System.in);
		base_salary = sc.nextDouble();
	}
	
	public double increment()
	{
		return base_salary +  0.1 * base_salary;
	}
	public void display()
	{
		super.display();
		System.out.println("Salary of Salaried Commission Employee = " + (base_salary + grossSales*(commissionRate/100)));
	}
}
