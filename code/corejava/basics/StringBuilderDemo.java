public class StringBuilderDemo {
	public static void main(String args[])
	{
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);
		sb.append(" Java"); // Hello Java
		System.out.println(sb);
		sb.insert(5, " String in"); // Hello String in Java
		System.out.println(sb);
		sb.replace(6, 12, "StringBuilder"); // Hello StringBuilder in Java
		System.out.println(sb);
		sb.delete(0, 6); // StringBuilder in Java
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}