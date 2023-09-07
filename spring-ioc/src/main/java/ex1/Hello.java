package ex1;

public class Hello {
	
	private String message;
	public Hello() {
		System.out.println("default constructor");
	}
	
	public Hello(String message) {
		this.message = message;
		System.out.println("Parameterized construc");
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
		System.out.println("setter method");
	}	
}
