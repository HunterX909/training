
public class Customer {
	private int cusId;
	private String cusName;
	private double creditLimit;

	public Customer() {
	}
	private static int counter =101;

	public Customer(String cusName, double creditLimit) {
		this.cusId = counter++;
		this.cusName = cusName;
		this.creditLimit = creditLimit;
	}

	public void details() {
		System.out.println("Customer ID: " + cusId);
		System.out.println("Customer Name: " + cusName);
		System.out.println("CreditLimit: " + creditLimit);
	}

	public double getCreditLimit() {
		return creditLimit;
	}

}
