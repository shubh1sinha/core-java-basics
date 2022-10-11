package com.question3.java;

public class Box {
	private String name;
private double length;
private double breadth;
private double height;
public Box(String name, double length, double breadth, double height) {
	this.name=name;
	this.length = length;
	this.breadth = breadth;
	this.height = height;
}
public String getName() {
	return name;
}
public double resultVolume() {
	double volume=length*breadth*height;
	return volume;
}
}
