package com.question1.java;

import java.util.*;

public class DemoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<>();
		ll.add("Shubh");
		ll.add("Sinha");
		ll.add("Molu");
		ll.add("Golu");
		ll.add("Nikku");
		ll.add("Summi");
		ll.add("Shubh");
		ll.add("Goli");
		ll.add("Amit");
		ll.add("Harsh");
		System.out.println("Names Added are : " + ll);

		// Manipulating List
		ll.add(4, "Sherya");
		System.out.println("Manipulated Lists are: " + ll);

		// Manipulating by removing List
		ll.removeLast();
		System.out.println("Manipulated Lists by removing are: " + ll);

		// Manipulating by removing List
		ll.poll();
		System.out.println("Manipulated Lists by removing are: " + ll);

		// Iterator top to bottom
		Iterator<String> itr = ll.iterator();
		System.out.println("\n-----Iterator's Output----");
		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println("Hello!" + name);
		}

		// ListIterator
		ListIterator<String> ltr = ll.listIterator();
		System.out.println("\n-----List Iterator's Output----");
		while (ltr.hasNext()) {
			String name = ltr.next();
			System.out.println("Welcome: " + name);
		}
		System.out.println("\n-----List Iterator's Output Bottom to Top----");
		while (ltr.hasPrevious()) {
			String name = ltr.previous();
			System.out.println("Welcome Back: " + name);

		}

		// Enhanced For-Loop
		System.out.println("\n----Enhanced For-loop Output----");
		for (String name : ll) {
			System.out.println("Hello " + name);
		}

		// Manipulating and clearing list
		ll.clear();
		System.out.println("\n"+ ll + " is clear");

	}

}
