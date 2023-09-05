package com.ey.bank;

import java.util.ArrayList;

public class Accounts implements Bank {
	private int acnNo;
	private String holder;
	public double balance;
	protected ArrayList<Transaction> txns;
	
	public Accounts() {
	}
	
	private static int autogen = INIT_ACCOUNT_NO;
	
	public Accounts(String holder, double balance) {
		this.acnNo= autogen++;
		this.holder = holder;
		this.balance = balance;
		txns = new ArrayList<Transaction>();
	}
	
	public void summary() {
		System.out.println("A/C No " + acnNo);
		System.out.println("Holder " + holder);
		System.out.println("Balance " + balance);
	}
	
	//Business Logic
	public void deposit(double amount) {
		balance += amount;
		
		txns.add(new Transaction("Deposit", amount, balance));
	}
	
	public void withdraw(double amount) throws BalanceException {
		if(amount <= balance)
			balance -= amount;
		else
			System.out.println("Insufficeint Balance");
	}

	@Override
	public void statement() {
		txns.forEach(System.out::println);
	}	
}
