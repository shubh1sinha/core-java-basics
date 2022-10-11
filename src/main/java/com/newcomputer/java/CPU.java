package com.newcomputer.java;

public class CPU {
	private String os;
	private String core;
	private int size;
	public CPU(String os, String core, int size) {
		this.os = os;
		this.core = core;
		this.size = size;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getCore() {
		return core;
	}
	public void setCore(String core) {
		this.core = core;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "CPU os=" + os + ", core=" + core + ", size=" + size ;
	}
	

}
