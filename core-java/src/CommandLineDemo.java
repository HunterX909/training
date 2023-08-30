
public class CommandLineDemo {

	public static void main(String[] args) {
		int sum = 0;
		for(String a : args) {
			sum += Integer.parseInt(a);
		}
		System.out.println(sum);
		
		int x = 5;
		Integer xo = x; //Boxing
		int z = xo; //unboxing
		
		System.out.println(x + xo * z);
		//Java takes care of boxing and unboxing hence called Auto-Boxing
	}

}
