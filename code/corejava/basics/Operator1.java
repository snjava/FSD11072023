public class Operator1
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 3;
		int ans = a + b;
		System.out.println(ans);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);

		int x = 10;
		x+=5; //x = x + 5;
		System.out.println(x); // 15
		x/=3;
		System.out.println(x); // 5
		x*=5;
		System.out.println(x); // 25
	}
}