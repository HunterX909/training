import com.ey.bank.Current;

public class TestCurrent {

	public static void main(String[] args) {
		Current c1 = new Current("Bob");
		c1.summary();
		c1.deposit(2000);
		
		c1.summary();
	}

}
