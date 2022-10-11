package com.shapes.java;

public class Rectangle extends Shapes{

	public Rectangle(int base, int height) {
		super(base, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void computeArea() {
		// TODO Auto-generated method stub
		double area = base*height;
		System.out.println("The area of rectangle is: "+area);
		
	}
	

}
