package com.assesmentpractice.com;

public class Person {
	protected int id;
	protected String name;
	protected Address address;
	protected Phone phone;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public String getPersonDetails() {
		return "Id: "+id+"\nName: "+name;
	}
}
