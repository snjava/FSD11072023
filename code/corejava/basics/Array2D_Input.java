import java.util.Scanner;
public class Array2D_Input {
	public static void main(String args[]) {
		double marks[][];
		marks = new double[3][2];
		
		Scanner scan = new Scanner(System.in);
		
		for(int r=0;r<=2;r++) {
			for(int c=0;c<=1;c++) {
				System.out.println("Enter Value for row : "+r);
				marks[r][c] = scan.nextInt();
			}
		}



		for(int r=0;r<=2;r++) {
			for(int c=0;c<=1;c++) {
				System.out.print(marks[r][c] + "\t");
			}
			System.out.println();
		}
	}
}