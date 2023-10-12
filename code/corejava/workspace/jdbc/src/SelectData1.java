import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectData1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd11july","root","root");
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM empdetails");
			ResultSet rs =  stmt.executeQuery();
			while(rs.next()) {
				System.out.println("Id : " + rs.getInt("empid"));
				System.out.println("Name : " + rs.getString("name"));
				System.out.println("Email : " + rs.getString("email"));
				System.out.println("Gender : " + rs.getString("gender"));
				System.out.println("----------------------------------");
			}
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
