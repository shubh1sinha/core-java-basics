package com.demo.java;

public class AppCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer(1, "Shubh", "cust@gmail", 8709409648l);
		String profile = c.getCustomerProfile();

		System.out.println(profile);
		c.setEmail("customer@gmail.com");

		String profile1 = c.getCustomerProfile();
		System.out.println(profile1);

	}

}
