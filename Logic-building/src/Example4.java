
public class Example4 {
	public static void main(String[] args) {
		
		String[] vocals = {"is", "a", "are"};
		String quote = "These apples a giod";
		String[] ar = quote.split(" ");
		Boolean flag = false;
		for (String string : vocals) {
			for (String string2 : ar) {
				if(string.equals(string2))
					flag = true;
			}
		}
		System.out.println(flag? "Valid": "Not Valid");
	}
}
