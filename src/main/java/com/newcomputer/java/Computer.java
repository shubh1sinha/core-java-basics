package com.newcomputer.java;

public class Computer {
	protected Monitor monitor;
	protected Mouse mouse;
	protected Keyboard keyboard;
	protected CPU cpu;
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public Mouse getMouse() {
		return mouse;
	}
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public Keyboard getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
public String getComputerDetails() {
	return "My Computer: \n";
}
}
