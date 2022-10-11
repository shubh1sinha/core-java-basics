package com.question3.java;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Box boxes[] = new Box[10];

		System.out.println("Print Box Details: ");
		for (int i = 0; i < 10; i++) {
			String name = sc.next();
			double l = sc.nextDouble();
			double b = sc.nextDouble();
			double h = sc.nextDouble();

			Box box = new Box(name, l, b, h);
			boxes[i] = box;
			System.out.println(box.resultVolume());
		}

		System.out.println("Enter Name to be found: ");
		String name = sc.next();
		boolean match = true;
		for (int i = 0; i < 10; i++) {
			Box find = boxes[i];
			if (find.getName() == name) {
				System.out.print(find.resultVolume());
				match = true;
				break;
			} else {
				match = false;
			}
		}
		sc.close();
		if (!match)
			System.out.println(name + " Not found");
	}

}
