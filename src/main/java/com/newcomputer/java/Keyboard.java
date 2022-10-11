package com.newcomputer.java;

public class Keyboard {
private String type;

public Keyboard(String type) {
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
	return "Keyboard type=" + type;
}

}
