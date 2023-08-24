
public class SuperKeywordConstrcutor {
	public static void main(String[] args) {
		C c = new C(20);
	}
}
class A {
	public A() {
		System.out.println("I am from A with No param");
	}
	public A(String a) {
		System.out.println("I am from A");
	}
} 

class B extends A {
	public B(int a) {
		System.out.println("I am from B with 1 pram");
	}
	public B() {
		this(12);
		System.out.println("I am from B with no param");
	}
}

class C extends B {
	public C(int a) {
		System.out.println("I am from C with 1 pram");
	}
	public C() {
		System.out.println("I am from C");
	}
 }
