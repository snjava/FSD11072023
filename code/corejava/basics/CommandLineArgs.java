public class CommandLineArgs {
	public static void main(String args[]) {
		System.out.println(args[0]);
		int a = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);
		System.out.println(a + b);
	}
}