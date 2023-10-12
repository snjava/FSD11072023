import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectData2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd11july","root","root");
			PreparedStatement stmt = con.prepareStatement("SELECT gender, count(empid) AS total FROM empdetails GROUP BY gender");
			ResultSet rs =  stmt.executeQuery();
			while(rs.next()) {
				System.out.println("Gender : " + rs.getString("gender"));
				System.out.println("Count : " + rs.getInt("total"));
			}
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
