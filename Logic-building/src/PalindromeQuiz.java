import java.util.Scanner;

public class PalindromeQuiz {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the String");
		String word = console.next();
		
		System.out.println(checkPalindrime(word)? "Palindrome" : "Not Palindrome");
	}

	private static boolean checkPalindrime(String word) {
		int last = word.length()-1;
		for(int i=0; i<word.length()/2; i++) {
		if(word.charAt(i) != word.charAt(last-i))
			return false;
		}
		return true;
	}
	
}
