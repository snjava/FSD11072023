public class CastingRevision
{
	public static void main(String args[]) {
		byte b = 10;
		int x = 20;

		long c = b; // implicit casting
		short d = (short) x;// explicit casting

		System.out.println(b);
		System.out.println(x);
		System.out.println(c);
		System.out.println(d);
		
	}
}
