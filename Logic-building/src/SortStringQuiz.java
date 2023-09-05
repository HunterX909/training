import java.util.Arrays;
import java.util.Scanner;

public class SortStringQuiz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word: ");
		String word = scan.nextLine();
		scan.close();
		System.out.println(sort(word));
	}

	private static String sort(String word) {
		char[] ar = word.toCharArray();
		for (int i = 0; i < ar.length; i++) {
			Arrays.sort(ar);
		}
		
		return new String(ar);
	}
}
