package com.demo.java;

public class Customer {
	private int custId;
	private String email;
	private String name;
	private long phone;

	public Customer(int custId, String name, String email, long phone) {
		this.custId = custId;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public String getCustomerProfile() {
		return custId + " " + name + " " + email + " " + phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
