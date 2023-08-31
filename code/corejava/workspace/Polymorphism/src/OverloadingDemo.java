
public class OverloadingDemo {
	public static void main(String[] args) {
		Calculation cal = new Calculation();
		cal.add(34, 21);
		cal.add(34, 21.34);
		cal.add(32.4, 34);
		cal.add(34, 21, 44);
		cal.add(34, 21, 44, 45);
		main(12);
	}
	
	public static void main(int a) {
		System.out.println("Overload main method");
	}
}

class Calculation {
	public static final void add(int a, int b) {
		int ans = a + b;
		System.out.println("2 Int Addition : " + ans);
	}
	
	final static double add(int a, double b) {
		double ans = a + b;
		System.out.println("2 int,double Addition : " + ans);
		return ans;
	}
	
	protected static final void add(double a, int b) {
		double ans = a + b;
		System.out.println("2 double,int Addition : " + ans);
	}
	
	public static final void add(int a, int b, int c) {
		int ans = a + b + c;
		System.out.println("3 Int Addition : " + ans);
	}
	
	public static final void add(int a, int b, int c, int d) {
		int ans = a + b + c + d;
		System.out.println("4 Int Addition : " + ans);
	}
}