import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteData {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee Id : ");
		int id = scan.nextInt();
		scan.close();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd11july","root","root");
			PreparedStatement stmt = con.prepareStatement("DELETE FROM empdetails WHERE empid=?");
				stmt.setInt(1, id);
			int count = stmt.executeUpdate();
			con.close();
			System.out.println("Rows Deleted : " + count);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
