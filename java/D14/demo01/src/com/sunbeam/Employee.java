package com.sunbeam;

class Employee {

	int empid;
	String name;
	double Salary;
	
	public Employee() {

	}
	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", Salary=" + Salary + "]";
	}
}

