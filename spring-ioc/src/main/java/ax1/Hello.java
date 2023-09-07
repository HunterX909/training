package ax1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hi")
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
	
	@Value("Aloha Spring")
	public void setMessage(String message) {
		this.message = message;
		System.out.println("setter method");
	}	
}
