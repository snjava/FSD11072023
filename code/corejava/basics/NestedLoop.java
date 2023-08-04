/**
	1 2 3 4 5
	1 2 3 4 5
	1 2 3 4 5
*/
public class NestedLoop {
	public static void main(String args[])
	{
		for(int r=1 ; r<=3 ; r++) { // ROW
			for(int c=1; c<=5 ; c++) { // COLUMN
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}