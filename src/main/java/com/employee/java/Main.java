package com.question1.java;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id: ");
		int empId=sc.nextInt();
		System.out.println("Enter Employee name: ");
		String name = sc.next();
		System.out.println("Enter Employee salary: ");
		double salary = sc.nextDouble();
		Employee emp = new Employee(empId, name, salary);
		
		String details = emp.getEmployeeDetails();
		
		System.out.println("The employee Details are: \n"+details);
		sc.close();

	}

}
