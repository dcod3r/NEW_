package Assignment_2_3;

import java.util.Scanner;

import Assignment_1_4.Employee;

public class SortSalary {

	
	public static void sortSalary(Employee employees[])
	{
		int flag = 0;
		for(int i = 0; i < employees.length - 1; i++)
		{
			for(int j  = 0; j < employees.length-i-1; j++)
			{
				if(employees[j].getSalary() > employees[j+1].getSalary())
				{
					Employee temp = employees[j];
					employees[j] = employees[j+1];
					employees[j+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0)
				break;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee[] employees = new Employee[5];
        employees[0] = new Employee(1, "Ankasha", 80000);
        employees[1] = new Employee(2, "Atarva", 70000);
        employees[2] = new Employee(3, "rohit", 55000);
        employees[3] = new Employee(4, "swapnail", 90000);
        employees[4] = new Employee(5, "sanket", 65000);
		
         System.out.println("Before Sort");
         for(Employee e : employees)
        	 System.out.println(e.toString());
     
        sortSalary(employees);
        
        System.out.println("After Sort");
        for(Employee e : employees)
       	 System.out.println(e.toString());
    
	}
}
