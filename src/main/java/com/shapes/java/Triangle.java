package com.shapes.java;

public class Triangle extends Shapes{
	public Triangle(int base, int height) {
		super(base, height);
	}

	@Override
	public void computeArea() {
		// TODO Auto-generated method stub
		double area = 0.5*base*height;
		System.out.println("Area of triangle is: "+area);
	}
	
	

}
