package com.shapes.java;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base: ");
		int n = sc.nextInt();
		
		System.out.println("Enter height: ");
		int m = sc.nextInt();
		
		Shapes triangle = new Triangle(n, m);
		Shapes rectangle = new Rectangle(n,m);
		
		triangle.computeArea();
		rectangle.computeArea();
		
		sc.close();

	}

}
