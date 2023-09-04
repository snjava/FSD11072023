public class InterfaceDemo {
	public static void main(String[] args) {
		Inter1 inter = new Test1();
	}
}


interface Inter1 {
	int a = 10; // public static final int a = 10;
	int m1();  // public abstract int m1();
}
interface Inter2 {
	int b = 20;
	int m2();
}

interface Inter3 extends Inter1, Inter2 { // Multiple Inheritance
	int c = 20;
	int m3();
}
abstract class Test2 implements Inter1, Inter2 {	// Multiple Inheritance
}
class Test1 extends Test2 implements Inter1 {   // Multiple Inheritance
	public int m1() {
		return 0;
	}
	public int m2() {
		return 0;
	}
}
