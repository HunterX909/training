package com.ey.emp;
public class Clerk extends Employee {
	private double commision;

	public Clerk() {
		super();
	}

	public Clerk(String empName, double salary, double commision) {
		super(empName, salary);
		this.commision = commision;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Commision: " + commision);
	}

	@Override
	public double getSalary() {
		return super.getSalary()+ commision;
	}
	
	
}
