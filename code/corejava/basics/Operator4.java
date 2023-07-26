public class Operator4 
{
	public static void main(String args[]) 
	{
		int a = 10;
		int b = 5;
		
		System.out.println(a & b); // 0
		System.out.println(a | b); // 15
			
		System.out.println(a>5 & a<15); // T & T = T
		System.out.println(a>5 | a<15); // T | T = T

		System.out.println(a>5 && a<15); // T && T = T
		System.out.println(a>5 || a<15); // T || T = T


		int marks = 30;  
		char result = marks>=40 ? 'P' : 'F';
		System.out.println(result); // P 
		
		

		
	}
}
/*
AND (&)
T T = T
F T = F
T F = F
F F = F

OR (|)
T T = T
F T = T
T F = T
F F = F
*/









