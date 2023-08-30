
@FunctionalInterface
public interface Hello {
	String sayHello();
	// It imposes the rule of single abstract method.
	
	default String sayBye() { // can use default to declare methods
		return "Good Bye!";
	}
	static void greeting() {  // static methods are also can be declared
		System.out.println("Good Day!");
	}
}
