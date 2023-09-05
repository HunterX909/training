import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class ConnectionDemo {
	public static void main(String[] args) throws Exception {
		Connection conn = JdbcFactory.getConnection();
		System.out.println("Connection successfull");
		
		DatabaseMetaData meta = conn.getMetaData();
		System.out.println("DB Name: "+ meta.getDatabaseProductName());
		System.out.println("DB Version: "+ meta.getDatabaseProductVersion());
		System.out.println("Driver Name: "+ meta.getDriverName());
		System.out.println("Driver Version: "+ meta.getDriverVersion());
	}
}
