package com.demo.java;

public class overload {
	public void add() {
		System.out.println("add()--Nothing to add");
	}
	
	public void add(int a, int b) {
		System.out.println("add(int,int)--called");
	}
	
	public float add(int a, float b) {
		System.out.println("add(int,float)--called");
		return a+b;
	}
	
	public double add(int a, double b) {
		System.out.println("add(int,double)--called");
		return a+b;
	}
	
	public double add(double a, float b) {
		System.out.println("add(double,double)--called");
		return a+b;
	}
}
