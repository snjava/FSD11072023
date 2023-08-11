public class ExecuteClaculation {
	public static void main(String args[]) {
		Calculate cal1;  // reference variable
		cal1 = new Calculate();  // Object/Instance of class
		Calculate cal2 = new Calculate();

		System.out.println(cal1);
		System.out.println(cal2);

		cal1.add(); // 45
		cal2.a = 25;
		cal2.add(); // 30

		cal1.sub(10,2); // 8
		int result1 = cal2.mul();
		System.out.println(result1); // 125
		System.out.println(cal1.div(20,4)); // 5
	}
}

class Calculate {
	int a = 40; // Instance varaible
	int b = 5;

	public void add() {
		int ans = a + b;
		System.out.println(ans);
	}

	public void sub(int x, int y) {
		int ans = x - y;
		System.out.println(ans);
	}

	public int mul() {
		int ans = a * b;
		return ans;
		//return a*b;
	}
	
	public int div(int a, int b) {
		return a/b;
	}
}



