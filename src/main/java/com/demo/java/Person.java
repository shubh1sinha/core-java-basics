package com.demo.java;

public class Person {
	private int pId;
	private String name;
	private String email;
	private long phone;

	public Person(int pId, String name) {
		this.pId = pId;
		this.name = name;
	}

	public Person(int pId, String name, String email) {
		//calling the constructor
		this(pId, name);
		this.email = email;
	}

	public Person(int pId, String name, String email, long phone) {
		
		//calling the constructor
		this(pId, name, email);
		this.phone = phone;
	}

	//Print Email and Number in one Method
	public String getPersonDetails() {
		//if email and number is empty
		if(email==null && phone==0)
		return pId + " " + name;
		
		//if email is not empty and phone is empty
		else if(email != null && phone==0)
			return pId + " " + name + " " + email;
		
		//all remaining
		else
			return pId + " " + name + " " + email + " " + phone;
			
		
	}
}
