package com.ey.bank;

import java.util.ArrayList;
import java.util.List;

public class Current extends Accounts {
	private double overdraft;
	private List<CurrentTransaction> ctxns;

	public Current() {
		ctxns = new ArrayList<CurrentTransaction>();
	}

	public Current(String holder) {
		super(holder, OPENING_CURRENT_BAL);
		this.overdraft = OVERDRAFT_LIMIT;
		ctxns = new ArrayList<CurrentTransaction>();
		// txns.add(new CurrentTransaction("Withdrawal",0, OPENING_CURRENT_BAL,
		// overdraft));
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft: " + overdraft);
	}

	@Override
	public void deposit(double amount) {
		if (overdraft == OVERDRAFT_LIMIT) {
			balance += amount;
		} else if (overdraft < OVERDRAFT_LIMIT) {
			overdraft += amount;

			balance += (overdraft - OVERDRAFT_LIMIT);
			overdraft = OVERDRAFT_LIMIT;
			ctxns.add(new CurrentTransaction("Deposit", amount, balance, overdraft));
		}
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if (amount <= balance) {// Sufficient balance to cover the withdrawal
			balance -= amount;
			ctxns.add(new CurrentTransaction("Withdrawal", amount, balance, overdraft));
		} else if (amount <= (balance + overdraft)) {
			balance -= amount;
			if (balance < MIN_CURRENT_BAL) {
				overdraft += balance;
				balance = MIN_CURRENT_BAL;
				ctxns.add(new CurrentTransaction("Withdrawal", amount, balance, overdraft));
			} else {
				throw new BalanceException("Insufficeint balance!");
			}
		}
	}

	@Override
	public void statement() {
		ctxns.forEach(System.out::println);
	}

}
