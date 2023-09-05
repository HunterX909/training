import com.ey.library.Book;
import com.ey.library.Member;

public class TestLibrary {
	public static void main(String[] args) {
		
		Book bk = new Book("The Alchemist");
		
		Member mr = new Member("Phunsuk");
		Member m2 = new Member("Ganpan");
		
		bk.status();
		mr.status();
		
		bk.issueBook(mr);
		bk.status();
		mr.status();
		
		bk.returnBook(mr);
		bk.status();
		mr.status();
			
		bk.returnBook(m2);
	}
}
