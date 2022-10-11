package com.newcomputer.java;

public class Mouse {
	private String type;

	public Mouse(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Mouse type=" + type ;
	}
	

}
