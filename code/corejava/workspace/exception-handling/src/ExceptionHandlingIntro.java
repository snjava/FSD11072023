import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingIntro {
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter 1st number : ");
			int num1 = scan.nextInt();
			System.out.println("Enter 2nd number : ");
			int num2 = scan.nextInt();
			
			System.out.println("Add : " + (num1+num2));
			try {
				System.out.println("Div : " + (num1/num2));
			} 
			catch(ArithmeticException ex) {
				System.out.println("Invalid Operation... Cannot Divide number by zero...");
			}
			System.out.println("Mul : " + (num1*num2));
			System.out.println("Sub : " + (num1-num2));
			scan.close();
		} 
		catch(InputMismatchException ex) {
			System.out.println("Please provide valid input. Only Numbers are allowed...");
		}
		
		System.out.println("Main End");
	}
}
