package sunbeam;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		
		System.out.println("Welcome to our Application\n");
		
		System.out.println("1. SALARIED EMPLOYEE");
		System.out.println("2. HOURLY EMPLOYEE");
		System.out.println("3. SALARIED COMMISSION EMPLOYEE");
		System.out.println("ENTER YOUR CHOICE");
		
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		
		//SalariedCommissionEmployee
		
		switch(choice)
		{
		case 1:
				Employee e1 = new SalariedEmployee();
				e1.accept();
				e1.display(); 
				
			break;
		case 2:
			Employee e2 = new HourlyEmployee();
			e2.accept();
			e2.display();
	
			break;
		case 3:
			Employee e3 = new SalariedCommissionEmployee();
			e3.accept();
			e3.display();
			SalariedCommissionEmployee sce = (SalariedCommissionEmployee) e3;
			System.out.println("Incremented Salary = " + sce.increment());
			break;
		default : 
			System.out.println("WRONG CHOICE ENTERED,,, PLS INPUT VALID CHOICE\n................EXITING................");
		}
	}
}