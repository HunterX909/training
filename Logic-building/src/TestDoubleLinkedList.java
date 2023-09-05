
public class TestDoubleLinkedList {
	public static void main(String[] args) {

		DoubleLInkedList l = new DoubleLInkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.printForward();
		System.out.println();
		l.printBackward();
		
		
//		System.out.println("Adding After: ");
//		l.addAfter(20, 25);
//		l.addAfter(30, 35);
//		l.print();

//        System.out.println("Adding Before: ");
//        l.addBefore(20, 15);
//        l.addBefore(10, 5);
//        l.print();

//		System.out.println("After Removing: ");
//		l.remove(20);
//		l.remove(5);
//		l.print();
}
}