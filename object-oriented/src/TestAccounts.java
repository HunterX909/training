import com.ey.bank.Bank;
import com.ey.bank.AccountsFactory;
import com.ey.bank.BalanceException;

public class TestAccounts {
	public static void main(String[] args) {
		
		AccountsFactory factory = new AccountsFactory();
		Bank c1 = factory.createCurrentAccount("Samb");
		//c1.summary();
		
		c1.deposit(2000);
		try {
			c1.withdraw(3000);
		} catch (BalanceException e) {
			e.printStackTrace();
		}
	
		c1.statement();
		System.out.println();
		
		Bank s1 = factory.createSavingsAccount("Ben");
		//s1.summary();
		
		
		s1.deposit(10000);
		try {
			s1.withdraw(500);
		} catch (BalanceException e) {
			e.printStackTrace();
		}
		
		s1.statement();

	}

}
