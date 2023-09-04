
@FunctionalInterface
public interface InterfaceJdk8 {

	int m1();
	
	// Default method
	default void m2() {
		System.out.println("Default Method inside interface");
	}
	// Static method
	static void m3() {
		System.out.println("Static method inside interface");
	}
	public static void main(String[] args) {
		System.out.println("Main Method inside Interface");
		m3();
	}
}
