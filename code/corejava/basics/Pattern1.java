/**
	*
	* *
	* * *
	* * * *
	* * * * *
*/
public class Pattern1 {
	public static void main(String args[])
	{
		for(int r=1; r<=5 ; r++) { // ROW
			for(int c=1; c<=r ; c++) { // COLUMN
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}