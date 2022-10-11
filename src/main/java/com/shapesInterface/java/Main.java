package com.question4.java;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polygons p;
		Triangle t = new Triangle(2, 3);
		p = t;
		p.area();

		Rectangle rect = new Rectangle(5, 6);
		p = rect;
		p.area();

	}

}
