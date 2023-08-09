public class ArrayMultiD {
	public static void main(String args[]) {
		int array[][] = {{34,56},{23,32,54,76,97},{45,43,67},{55,77}};

		for(int r[] : array) {
			for(int c : r) {
				System.out.print(c + "\t");
			}
			System.out.println();
		}
		
	}
}