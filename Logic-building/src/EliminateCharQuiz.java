
public class EliminateCharQuiz {
	public static void main(String[] args) {
		
		String str = "Hello-Beautiful-world";
		System.out.println(eliminate(str, "-"));
	}

	private static String eliminate(String str, String ch) {
		String newString = str.replace(ch, "");
		return newString;
	}
}
