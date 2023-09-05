class OuterEventImpl implements Event {

	@Override
	public void doSomething() {
		System.out.println("Outer Event Implementaton");
	}
}

public class EventDemo implements Event {

	@Override
	public void doSomething() {
		System.out.println("Simple Event Implementation");
	}

	private class InnerEventImpl implements Event {

		@Override
		public void doSomething() {
			System.out.println("Inner Event implementation");
		}
	}

	public static class StaticEventImpl implements Event {

		@Override
		public void doSomething() {
			System.out.println("Static Event implementation");
		}
	}
	
	public void oneMoreEvent() {
		class NestedEventImpl implements Event{

			@Override
			public void doSomething() {
				System.out.println("Nested event implementation");
			}	
		};
		new NestedEventImpl().doSomething();
	}
	
	public void oneLastEvent() {
		new Event() {

			@Override
			public void doSomething() {
				System.out.println("Anonymous Event implementation");
			}	
		}.doSomething();
	}
	
	public void pakkaLastEvent() {
		Event e = () -> System.out.println("Lamba Event implementation");
		e.doSomething();
	}
	
	public static void main(String[] args) {
		EventDemo ed = new EventDemo();
		ed.doSomething();

		OuterEventImpl oe = new OuterEventImpl();
		oe.doSomething();

		InnerEventImpl ee = ed.new InnerEventImpl();
		ee.doSomething();

		EventDemo.StaticEventImpl se = new EventDemo.StaticEventImpl();
		se.doSomething();
		
		ed.oneMoreEvent();
		ed.oneLastEvent();
		ed.pakkaLastEvent();
	}

}
