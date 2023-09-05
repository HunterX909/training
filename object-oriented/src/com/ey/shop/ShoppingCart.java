package com.ey.shop;

import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<Product> products ;
	private double total;
	//private int index;
	
	public ShoppingCart() {
		products =  new ArrayList<Product>();
	}
	
	public void addToCart(Product p) throws CartException {
		//if(index == products.size()) {
		//	throw new CartException("Your cart is full..");
		//}
		//else {
			products.add(p);
		    total += p.getPrice();
		//}		
	}
	
	public void checkout() {
		System.out.println("Your order summary...");
		
		products.forEach(System.out::println);
		
		System.out.println("Total Amount:" + total);
	}
	
}
