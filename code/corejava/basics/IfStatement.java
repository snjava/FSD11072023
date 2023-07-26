


/*
	WAP to find the Grade using percent.
	percent between 75-100 - Distinction
	Percent between 60-75 - First Class
	Percent between 50-60 - Second Class
	Percent between 40-50 - Pass Class
	Percent between 0-40 - Failed
	Any other percent value - "Invalid Percent...."		
*/
public class IfStatement {
	public static void main(String args[]) 
	{
		double percent = 80;
		if(percent >= 40 && percent<=100)
		{
			System.out.println("You are Pass");
		}
		else if(percent < 40 && percent>=0)
		{
			System.out.println("You are Fail");
		}
		else
		{
			System.out.println("Invalid Percentage....");
		}
	}
}
