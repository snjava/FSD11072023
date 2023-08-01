/*
	0-17 -> Child Age
	18-24 -> Teen Age
	25-60 -> Adult Age
	61-100 -> Old Age
*/

public class IfRevesion
{
	public static void main(String args[])
	{
		int age = 10;
		if(age>=0 && age<=100) 
		{
			System.out.println("Age value is vaild");
			if(age>=0 && age<=17)
			{
				System.out.println("Child Age...");
			}
			else if(age>=18 && age<=24)
			{
				System.out.println("Teen Age...");
			}
			else if(age>=25 && age<=60) 
			{
				System.out.println("Adult Age...");
			}
			else {
				System.out.println("Old Age...");
			}
		}
		else {
			System.out.println("Age value is Invaild");
		}
	}
}