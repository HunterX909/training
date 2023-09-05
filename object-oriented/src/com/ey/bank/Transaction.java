package com.ey.bank;

public class Transaction {
	public String type;
	public double amount;
	public double balance;
	
	public Transaction() {
	}
	
	public Transaction(String type, double amount, double balance) {
		super();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Transaction [type=" + type + ", amount=" + amount + ", balance=" + balance + "]";
	}
	
}
