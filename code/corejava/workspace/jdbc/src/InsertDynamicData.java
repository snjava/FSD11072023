import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDynamicData {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee Id : ");
		int id = scan.nextInt();
		System.out.println("Enter Employee Name : ");
		String name = scan.next();
		System.out.println("Enter Employee Email : ");
		String email = scan.next();
		System.out.println("Enter Employee gender : ");
		String gender = scan.next();
		scan.close();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd11july","root","root");
			PreparedStatement stmt = con.prepareStatement("INSERT INTO empdetails VALUES(?, ?, ?, ?)");
				stmt.setInt(1, id);
				stmt.setString(2, name);
				stmt.setString(3, email);
				stmt.setString(4, gender);
			int count = stmt.executeUpdate();
			con.close();
			System.out.println("Rows Inserted : " + count);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
