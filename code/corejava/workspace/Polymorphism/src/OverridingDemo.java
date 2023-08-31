public class OverridingDemo {
	public static void main(String[] args) {
		Animal a = new Tiger();
		a.eat(10);
	}
}

class Animal {
	protected void eat(int a) {
		System.out.println("Veg or Non-Veg");
	}
	public final void run() {
		System.out.println("Animal can Run");
	}
}

class Cat extends Animal {
}

class Tiger extends Animal {
	public void eat(int a) {
		System.out.println("Tiger eats Non-Veg");
	}
}

class Goat extends Animal {
	protected void eat(int  a) {
		System.out.println("Goat eats Veg");
	}
}

