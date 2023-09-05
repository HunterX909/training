import java.util.Scanner;

public class PrimeNumberQuiz {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = console.nextInt();
		
		System.out.println(checkPrime(num) ? "Prime No" : "Composite No");
	}
	private static boolean checkPrime(int num) {
		int n = (int)Math.sqrt(num);
		for (int i = 2; i <= n; i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}
	
}
