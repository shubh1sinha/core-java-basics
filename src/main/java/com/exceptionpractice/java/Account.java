package com.exceptionpractice.java;

public class Account implements AccountOperationsInterface {
	protected boolean flag = true;
	protected static double balanceAmnt = 500;

	@Override
	public double deposit(double amt) throws AccountBlockedException {
		// TODO Auto-generated method stub
		if (!flag) {
			throw new AccountBlockedException("Blocked Account. Contact Branch..");
		} else {
			balanceAmnt = amt + balanceAmnt;
			return balanceAmnt;
		}
	}

	@Override
	public double withdraw(double amt) throws AccountBlockedException, InsufficientBalanceException {
		// TODO Auto-generated method stub
		if (!flag) {
			throw new AccountBlockedException("Blocked Account. Contact Branch..");
		} else if (balanceAmnt < amt) {
			throw new InsufficientBalanceException("Low Balance...");
		} else {
			balanceAmnt = balanceAmnt - amt;
			return balanceAmnt;
		}
	}

	@Override
	public double getBalance() throws AccountBlockedException {
		// TODO Auto-generated method stub
		if (!flag) {
			throw new AccountBlockedException("Blocked Account. Contact Branch");
		} else {
			return balanceAmnt;
		}
	}

	@Override
	public void blockAccount() {
		// TODO Auto-generated method stub
		flag = false;

	}

}
