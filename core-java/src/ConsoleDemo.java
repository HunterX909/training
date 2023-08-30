import java.util.Scanner;

public class ConsoleDemo {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String name = console.nextLine();
		System.out.println("Name is: " + name );
		
		System.out.println("enter Age: ");
		int age = console.nextInt();
		System.out.println("Age: " + age);
		
		console.close();
	}
}
