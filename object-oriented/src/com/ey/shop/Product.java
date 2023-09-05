package com.ey.shop;

/**
 * this class represents Products of our shopping application
 * @author Tarun
 * @version 1.0
 * 
 */
public class Product {
	
	private String name;
	private double price;
	/**
	 * This is the default constructor
	 */
	public Product() {	
	}
	/**
	 * This is the parameterized constructor
	 * @param name
	 * @param price
	 */
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void print() {
		System.out.println("Name: " + name + "\tPrice: " + price);
	}
	
	public double getPrice() {
		return price;
	}
}
