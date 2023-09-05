
public class Calculator {
	public double total = 0 ;

	public double add(double num) {
		return total += num;
	}
	
	public double sub(double num) {
		return total -= num;
	}
	
	public double multiply(double num) {
		return total *= num;
	}
	
	public double divide(double num) {
		return total /= num;
	}
	
	public void result() {
		System.out.println(total);
	}
}
