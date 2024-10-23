package assigment3_2;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0; // Default to 0.0
        }
    }

    // Get and set methods
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

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    // Method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to raise salary by a given percentage
    public void raiseSalary(double percentage) {
        if (percentage > 0) {
            monthlySalary += monthlySalary * (percentage / 100);
        }
    }
}