public class Array2D_1 {
	public static void main(String args[]) {
		double marks[][] = {{56,54,67,43},{56,76,54,67},{67,34,76,78}};
		
		System.out.println(marks.length); // Total number of rows  // 3
		System.out.println(marks[1].length); // Total number of column form the row // 4

		
		for(int r=0 ; r<marks.length ; r++ ) { // ROW
			for(int c=0 ; c<marks[r].length ; c++) {  // Column
				System.out.print(marks[r][c] + "\t");
			}
			System.out.println();
		}

		System.out.println("-----------------------");

		for(double r[] : marks) {  // ROW
			for(double c : r) {  // COLUMN
				System.out.print(c + "\t");
			}
			System.out.println();
		}

	}
}
