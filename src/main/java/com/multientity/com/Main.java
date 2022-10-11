package com.assesmentpractice.com;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(1,"Shubh");
		Address address = new Address("R-12","Uttam Nagar West","New-Delhi", "NDLS", 110059);
		p.setAddress(address);
		
		Phone phone = new Phone(8709409648l);
		p.setPhone(phone);
		
		System.out.println(p.getPersonDetails()+"\n"+p.getAddress()+"\n"+p.getPhone());

	}

}
