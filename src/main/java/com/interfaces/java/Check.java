package com.interfaces.java;

public class Check implements EvenOdd{

	@Override
	public String evenOrodd(int n) {
		// TODO Auto-generated method stub
		if(n%2 == 0) {
			return n+" is even";
		}
		else if(n==0) {
			return n+" neither even nor odd.";
		}
		else {
			return n+" is odd";
		}
		
	}

	@Override
	public String squareOf(int n) {
		// TODO Auto-generated method stub
		int square = n * n;
		return "The Square of " + n + " is: " + square;
	}

	@Override
	public String cubeOf(int n) {
		// TODO Auto-generated method stub
		int cube = n*n*n;
		return "The cube of " + n + " is: "+cube ;
	}
	

}
