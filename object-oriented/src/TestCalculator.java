
public class TestCalculator {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.result();
		
		c1.add(300);
		c1.result();
		
		c1.sub(20);
		c1.result();
		
		c1.multiply(3);
		c1.result();
		
		c1.divide(2);
		c1.result();
	}
}
