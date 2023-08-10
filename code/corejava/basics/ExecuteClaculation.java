public class ExecuteClaculation
{
	public static void main(String args[])
	{
		Calculate cal = new Calculate();
		cal.add();
		cal.sub(34,4);
	}
}

class Calculate
{
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



