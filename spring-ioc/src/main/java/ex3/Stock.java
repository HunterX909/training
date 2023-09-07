package ex3;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Stock {

	public Stock() {
		System.out.println("Default constructor");
	}

	private static Stock stk;
	
	
	private static Stock getStock() {
		System.out.println("Stock Singleton");
		if (stk == null)
			stk = new Stock();
		
		return stk;
	}
}