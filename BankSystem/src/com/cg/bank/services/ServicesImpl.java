package com.cg.bank.services;

import com.cg.bank.beans.Account;

public class ServicesImpl implements Services{
	Account acc= new Account();
	int balance = acc.getAmount();
	@Override
	public void deposit(int amount) {
		balance+=amount;
		System.out.println(balance);
	}

	@Override
	public void withdraw(int amount) {
		balance-=amount;
		System.out.println(balance);
	}
}
