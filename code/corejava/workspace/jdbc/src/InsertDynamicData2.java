import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDynamicData2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Address Id : ");
		int id = scan.nextInt();
		System.out.println("Enter Pincode : ");
		String pincode = scan.next();
		System.out.println("Enter State : ");
		String state = scan.next();
		scan.close();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd11july","root","root");
			PreparedStatement stmt = con.prepareStatement("INSERT INTO empaddress(aid, pincode, state) VALUES(?,?,?)");
				stmt.setInt(1, id);
				stmt.setString(2, pincode);
				stmt.setString(3, state);
			int count = stmt.executeUpdate();
			con.close();
			System.out.println("Rows Inserted : " + count);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
