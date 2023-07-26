public class Operator2
{
	public static void main(String args[])
	{
		int i = 10;
		// i+=1;  //i = i + 1;
		i++; // Post Increment (Assign and Incrment)
		++i; // Pre Incrment (Incremenet and assign)
		System.out.println(i);

		int x = 5;
		int y = x++;
		System.out.println(x); // 6
		System.out.println(y); // 5
	}
}