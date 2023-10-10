import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionOracle {
	public static void main(String[] args) {
		try {
			// 1. Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. Create Connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			
			System.out.println("Oracle Db Connection Successful...");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
