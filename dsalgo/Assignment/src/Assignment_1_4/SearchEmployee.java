package Assignment_1_4;

import java.util.Scanner;

public class SearchEmployee {
	
	
	public static int SearchById (Employee[] employees ,int empid)
	{
		
		for (Employee emp : employees)
		{
			//System.out.println(emp);
            if (emp.getEmpid() == empid)
            {
            	return empid;
            }
		
		}
		return -1;
	}
	

	public static String SearchByName (Employee[] employees ,String name)
	{
		
		for (Employee emp : employees)
		{
           if(emp.getName().equals(name))
        	   System.out.println("employee name:- "+emp.toString());
		
		}
		return null;
	
	}
	
	public static double SearchBySalary (Employee[] employees , double salary)
	{
		
		for (Employee emp : employees)
		{
            if (emp.getSalary() == salary)
            {
            	return salary;
            }
		
		}
		return -1;
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee[] employees = new Employee[5];
        employees[0] = new Employee(1, "Ankasha", 50000);
        employees[1] = new Employee(2, "Atarva", 60000);
        employees[2] = new Employee(3, "rohit", 55000);
        employees[3] = new Employee(4, "swapnail", 70000);
        employees[4] = new Employee(5, "sanket", 65000);
		
		
		
		
		System.out.println("Enter the emloyee id:- ");
		int empid =sc.nextInt();
		int id = SearchById(employees,empid);
		if(id == -1)
		{
			System.out.println(" not found");
		}
		else
		{
			System.out.println("id is "+ employees[id-1]);
			
		}
				
		System.out.println("Enter the emloyee name:- ");
		String name =sc.next();
		String ename = SearchByName(employees,name);
		if(name == null)
		{
		System.out.println("Employee is not found");
			
		}
		else
		{
			System.out.println("Name is "+ name);
		}
		
		System.out.println("Enter the salary:- ");
		double salary= sc.nextDouble();
		
		double sal = SearchBySalary(employees,salary);
		{
			if(sal == -1)
			{
				System.out.println("not found ");
				
			}
			else
			{
				System.out.println("salary of employee:- ");
			}
			
		}
		
		
		
		
		
		

	}

}
