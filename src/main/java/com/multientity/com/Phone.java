package com.assesmentpractice.com;

public class Phone {
	protected long number;

	public Phone(long number) {
		this.number = number;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Phone: " + number;
	}

}
