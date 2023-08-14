import java.util.Scanner;

public class ScannerDemo {
	public static void main(String args[]) {
		System.out.println("Start of the program");
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Your Name : ");
		String name = scan.next();

		System.out.println("Enter 1st Number: ");
		int a = scan.nextInt();

		System.out.println("Enter 2nd Number : ");
		int b = scan.nextInt();

		scan.close();

		System.out.println(name);
		System.out.println(a+b);
	}
}