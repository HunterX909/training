import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareDemo {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] ar = input.split(" ");
		
		String sql = "insert into customer values (?, ?, ?)";

		try {
			Connection conn = JdbcFactory.getConnection();
			// pre-compile statement created with query
			PreparedStatement stmt = conn.prepareStatement(sql);
			// Replacing place holders with values
//			stmt.setInt(1, Integer.parseInt(args[0]));
//			stmt.setString(2,args[1]);
//			stmt.setString(3, args[2]);
			
			stmt.setInt(1, Integer.parseInt(ar[0]));
			stmt.setString(2,ar[1]);
			stmt.setString(3, ar[2]);

			stmt.executeUpdate();
			System.out.println("Record successfully inserted...");
			
		} catch (SQLException e) {
			System.out.println("Record not inserted...");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
