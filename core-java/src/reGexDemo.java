
public class reGexDemo {
	
	public static void main(String[] args) {
		String name = "Tarun";
		String mobile = "9765432102";
		String email = "saidutarun3483@gmail.com";
		
		String nameRegex = "[A-Z]{1}[a-z]{3,}";
		String mobileRegex ="[6-9]{1}[0-9]{9}";
		String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
		
		System.out.println(name.matches(nameRegex)? "Valid Name" : "Invalid Name");
		System.out.println(mobile.matches(mobileRegex)? "Valid Mobile" : "Invalid Mobile");
		System.out.println(email.matches(emailRegex)? "Valid email" : "Invalid email");
	}

}
