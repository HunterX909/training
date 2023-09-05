import com.ey.emp.Clerk;
import com.ey.emp.Employee;
import com.ey.emp.Manager;

public class TestEmployee {
	public static void main(String[] args) {
		
		//Employee e1 = null;	//abstract classes can be created but not instanciated
		//System.out.println("salary: " + e1.getSalary());
		
		Manager m1 = new Manager("Mike", 500, 2000);		
		
		Clerk c1 = new Clerk("Reed", 500, 300);
		
		showSalary(m1);
		showSalary(c1);
	}

	private static void showSalary(Employee e) {
		if(e instanceof Manager)
			System.out.println("Manager Salary: " + e.getSalary());
		else
			System.out.println("Clerck Salary: " + e.getSalary());
	}

/*	private static void showSalary(Manager m1) {
		System.out.println("Manager Salary: " + m1.getSalary());
	}
	
	private static void showSalary(Clerk c1) {
		System.out.println("Clerk salary: "+ c1.getSalary());
	}
*/
	
}
