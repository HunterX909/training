import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) {
		
		String sql1 ="insert into customer values (124, 'Lovina', 'Games')";
		String sql2 ="update customer set domian='Sports' where cust_id = 124";
		String sql3 ="delete from customer where cust_id=123";
		
		Connection conn = null;
		try {
			conn = JdbcFactory.getConnection();
			Statement stmt = conn.createStatement();
			// Adding batch of SQL queries to statement
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);

			conn.setAutoCommit(false); //Setting auto-commit to false cause jdbc is by default auto commit 
			stmt.executeBatch();    // Ececuting batch of queries at once
			
			conn.commit();
			System.out.println("Transaction succeded...");
		
		} catch (Exception e) {
			System.out.println("Transaction failed...");
			try {
				conn.rollback(); //Rollback Transaction on exception
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}	
	}
}

//all queries should either succeed or not at all 

