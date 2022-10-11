package com.factorydp.java;

public abstract class Cycle {
	private int wheels;

	public Cycle(int wheels) {
		this.wheels = wheels;
	}
	public void getDetails() {
		System.out.printf("The cycle with %d wheels is created", wheels);
	}

}
