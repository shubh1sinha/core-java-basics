package com.question4.java;

public abstract class Polygons {
	protected int dim1;
	protected int dim2;

	public Polygons(int dim1, int dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	public Polygons(int dim2) {
		this.dim2 = dim2;
	}

	public abstract void area();
}
