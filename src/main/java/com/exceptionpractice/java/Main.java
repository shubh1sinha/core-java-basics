package com.exceptionpractice.java;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Account ac = new Account();

		int operation;
		try {
			do {
				System.out.println(
						"--Bank Operation--\n1)Check Balance\n2)Withdraw Amount\n3)Add Amount\n4)Block Account\n5)Exit");
				operation = sc.nextInt();
				switch (operation) {
				case 1:
					System.out.println(ac.getBalance());
					break;
				case 2:
					System.out.println("Enter amount to withdraw");
					double wmoney = sc.nextDouble();
					System.out.println(ac.withdraw(wmoney));
					break;
				case 3:
					System.out.println("Enter amount to deposit");
					double dmoney = sc.nextDouble();
					System.out.println(ac.deposit(dmoney));
					break;
				case 4:
					ac.blockAccount();
					break;
				default:
					System.out.println("Operation Closed");
					sc.close();
				}
			} while (operation != 5);
		} catch (AccountBlockedException ex) {
//				ex.printStackTrace();
			System.out.println("Exception Caght: " + ex);
		} catch (InsufficientBalanceException iex) {
//				iex.printStackTrace();
			System.out.println("Exception Caght: " + iex);

		}

	}
}
