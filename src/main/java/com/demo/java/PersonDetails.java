package com.demo.java;

public class PersonDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(1, "Shubh");
		Person p1 = new Person(2, "Sinha", "email.com");
		Person p2 = new Person(3, "Shubh Sinha", "email.com", 8709409648l);

		String Details = p1.getPersonDetails();
		String Details1 = p.getPersonDetails();
		String Details2 = p2.getPersonDetails();
		
		System.out.println(Details1);

		System.out.println(Details);
		
		System.out.println(Details2);
	}

}
