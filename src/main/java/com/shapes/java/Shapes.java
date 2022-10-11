package com.shapes.java;

public abstract class Shapes {
	protected int base;
	protected int height;
	
	public Shapes(int base, int height) {
		this.base=base;
		this.height=height;
	}
  public abstract void computeArea();

}
