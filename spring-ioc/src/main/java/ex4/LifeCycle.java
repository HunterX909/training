package ex4;

public class LifeCycle {
	public LifeCycle() {
		System.out.println("Life-Cycle constructor");
	}
	
	public void setup() {
		System.out.println("Life cycle init");
	}
	
	public void teardown() {
		System.out.println("life-cycle destroyed");
	}
	
	
}
