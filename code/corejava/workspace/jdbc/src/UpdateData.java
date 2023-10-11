import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee Id : ");
		int id = scan.nextInt();
		System.out.println("Enter Employee Email : ");
		String email = scan.next();
		scan.close();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd11july","root","root");
			PreparedStatement stmt = con.prepareStatement("UPDATE empdetails SET email=? WHERE empid=?");
				stmt.setString(1, email);
				stmt.setInt(2, id);
			int count = stmt.executeUpdate();
			con.close();
			System.out.println("Rows Updated : " + count);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
