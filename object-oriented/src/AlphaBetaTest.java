
public class AlphaBetaTest {

	public static void main(String[] args) {
		Alpha a = new Alpha();
		a.demo();
		
		Beta b = new Beta();
		b.test();
		b.demo();
		System.out.println();
		
		Alpha ab = b; //Up-casting (implicit)
		ab.demo();
		//ab.test(); // Error
		System.out.println();
		
		Beta ba = (Beta)ab; // Down-casting(Explicit)
		ba.demo();
		
		//Beta bt = (Beta)a; //Error
	}

}
