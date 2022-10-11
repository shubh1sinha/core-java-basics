package com.question1.java;

public class Employee {
	private int empId;
	private String name;
	private double salary;

	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public String getEmployeeDetails() {
		return "Employee id:" + empId + "\n Employee Name:" + name + "\nEmployee Salary: " + salary;
	}

}
