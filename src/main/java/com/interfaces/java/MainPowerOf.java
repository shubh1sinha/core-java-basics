package com.interfaces.java;

import java.util.Scanner;

public class MainPowerOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any Number: ");
			int n=sc.nextInt();
			// TODO Auto-generated method stub
			EvenOdd eo = new Check();
			
			System.out.println(eo.squareOf(n));
			System.out.println(eo.cubeOf(n));
			System.out.println(eo.evenOrodd(n));
			
			sc.close();

		

	}

}
