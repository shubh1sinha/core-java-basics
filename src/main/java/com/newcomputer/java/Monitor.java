package com.newcomputer.java;

public class Monitor {
	private String spec;
	private String resolution;
	public Monitor(String spec, String resolution) {
		this.spec = spec;
		this.resolution = resolution;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	@Override
	public String toString() {
		return "Monitor spec=" + spec + ", resolution=" + resolution;
	}
	

}
