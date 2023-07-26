public class DataCasting
{
	public static void main(String args[]) 
	{
		byte x = 120;
		int y = x;	// implicit casting
		System.out.println(x); // 120
		System.out.println(y); // 120

		int a = 128;
		byte b = (byte) a; // explicit casting
		System.out.println(a); // 128
		System.out.println(b); // -127
	}
}
