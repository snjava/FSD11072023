
public class StaticDemo {
	public static void main(String[] args) {
		System.out.println(Test.x); // 30
		Test.print();
		Test.Test1 t1 = new Test.Test1();
	}
}

class Test {
	int a = 30;
	static int x; // class/static variable
	
	static {	// static block
		x = 10;
	}
	
	public static void print() { // static method
		System.out.println(x);
	}
	
	public void m() {
		print();
	}
	
	static class Test1 { // static class
		int z = 30;
	}	
}