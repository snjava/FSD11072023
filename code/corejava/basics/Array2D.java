public class Array2D {
	public static void main(String args[]) {
		double marks[][];
		marks = new double[3][2];
		
		marks[0][0] = 77.88;
		marks[0][1] = 79.89;

		marks[1][0] = 67.87;
		marks[1][1] = 98.78;

		marks[2][0] = 88.56;
		marks[2][1] = 82.23;

		for(int r=0;r<=2;r++) {
			for(int c=0;c<=1;c++) {
				System.out.print(marks[r][c] + "\t");
			}
			System.out.println();
		}
	}
}