package com.area.java;

public class Triangle extends Polygons {
	public Triangle(int dim1, int dim2) {
		super(dim1, dim2);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		float res = (float) (0.5 * dim1 * dim2);
		System.out.println("Area of Triangle is: " + res);

	}

}
