package com.mai.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mail m = new Mail("sinha@gmail.com", "shubh@gmail.com");
		m.composeMail("Regarding project completion", "The given task is completeted.", "Thanks & Regards");
		m.sendMail();

	}

}
