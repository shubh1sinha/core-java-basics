package com.question4.java;

public class Rectangle extends Polygons {
	public Rectangle(int dim1, int dim2) {
		super(dim1, dim2);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		double res = dim1 * dim2;
		System.out.println("The area of rectangle is: " + res);

	}

}
