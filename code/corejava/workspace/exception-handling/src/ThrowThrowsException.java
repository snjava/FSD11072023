import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowThrowsException {
	public static void main(String[] args) {
		try {
			loadData();
		} catch(InputMismatchException ex) {
			System.out.println("Invalid Input");
		} catch(InvalidProductDetails ex) {
			ex.printError();
		}
	}
	
	public static void loadData() throws InvalidProductDetails {
		Scanner scan = new  Scanner(System.in);
		System.out.println("Enter Product Name : ");
		String name = scan.nextLine();
		System.out.println("Enter Product Price : ");
		double price = scan.nextDouble();
		scan.close();
		
		if(price<=0) {
			throw new InvalidProductDetails();
		}
		
		printData(name, price);
	}
	
	public static void printData(String name, double qty) {
		System.out.println("Name : " + name);
		System.out.println("Quantity : " + qty);
	}
}
