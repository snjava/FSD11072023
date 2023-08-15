public class StringDemo1
{
	public static void main(String args[])
	{
		String s1 = new String("Hello");
		String s2 = "Hello";
		System.out.println(s1); // Hello
		System.out.println(s2); // Hello
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
	
		String str = s1.toUpperCase();   // HELLO
		System.out.println(str);
		str = s1.toLowerCase(); // hello
		System.out.println(str);		

	} 
}



