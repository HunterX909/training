package com.ey.bank;

public final class AccountsFactory {
	//private AccountsFactory() {		}
	
	public Savings createSavingsAccount(String holder) {
		return new Savings(holder);
	}
	
	public Current createCurrentAccount(String holder) {
		return new Current(holder);
	}
}
