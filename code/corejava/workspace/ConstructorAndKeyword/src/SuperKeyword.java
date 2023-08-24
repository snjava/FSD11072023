
public class SuperKeyword {
	public static void main(String[] args) {
		Emp e = new Emp();
		e.print();
	}
}

class Human {
	int a=10;
	public void intro() {
		System.out.println("Hello,I am a Human");
	}
}

class Person extends Human {
	int a=10;
	public void intro() {
		System.out.println("Hello,I am a Person");
	}
}

class Emp extends Person {
	int a = 20;
	public void intro() {
		System.out.println("Hi,I am an Employee");
	}
	public void print() {
		int a = 30;
		System.out.println(a); //30
		System.out.println(this.a); //20
		System.out.println(super.a); //10
		this.intro(); // accessing the same class method
		super.intro();// accessing the super class method
	}
}
