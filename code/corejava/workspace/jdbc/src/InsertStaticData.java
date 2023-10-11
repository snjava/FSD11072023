import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertStaticData {
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd11july","root","root");
			PreparedStatement stmt = con.prepareStatement("INSERT INTO empdetails VALUES(555, 'Test1', 'test1@gmail.com', 'M')"); 
			int count = stmt.executeUpdate();
			con.close();
			
			System.out.println(count + " : Rows Inserted...");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
