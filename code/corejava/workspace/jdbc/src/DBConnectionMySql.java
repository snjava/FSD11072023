import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionMySql {
	public static void main(String[] args) {
		try {
			
			// 1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd11july","root","root");
			
			System.out.println("MySql Db Connection Successful...");
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
