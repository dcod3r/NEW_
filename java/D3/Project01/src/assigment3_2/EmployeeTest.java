package assigment3_2;

public class EmployeeTest {
	public static void main(String[] args) {
		// Create two Employee objects
        Employee employee1 = new Employee("Aditya", "Sabale", 100000);
        Employee employee2 = new Employee("Rohan", "Paramane", 6000);
        Employee employee3 = new Employee("Iron", "Man", 50000);
        
        // Display each employee's yearly salary
        System.out.println("Yearly salary of " + employee1.getFirstName() + " "
                + employee1.getLastName() + ": " + employee1.getYearlySalary());
        
        System.out.println("Yearly salary of " + employee2.getFirstName() + " "
                + employee2.getLastName() + ": " + employee2.getYearlySalary());
        
        System.out.println("Yearly salary of " + employee3.getFirstName() + " "
        		+ employee3.getLastName() + ": " + employee3.getYearlySalary());
        
        // Give each employee a 10% raise
        // Testing employee 3 for 20% raise
        employee1.raiseSalary(10);
        employee2.raiseSalary(10);
        employee3.raiseSalary(20);

        // Display each employee's yearly salary after the raise
        System.out.println("\nAfter 10% raise:");
        System.out.println("Yearly salary of " + employee1.getFirstName() + " "
                + employee1.getLastName() + ": " + employee1.getYearlySalary());
        
        System.out.println("Yearly salary of " + employee2.getFirstName() + " "
                + employee2.getLastName() + ": " + employee2.getYearlySalary());
        
        System.out.println("Yearly salary of " + employee3.getFirstName() + " "
                + employee3.getLastName() + ": " + employee3.getYearlySalary());
	}
}
