
public class ThisKeywordDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.setA(22);
		d.print(200);
		
		Student stud = new Student("7867867867", "Pune", 23, "Abc");
		System.out.println(stud.name);
		System.out.println(stud.id);
		System.out.println(stud.contact);
		System.out.println(stud.address);
		
	}
}

class Student {
	int id;
	String name;
	String contact;
	String address;
	double salary;
	public Student(int id, String name, String contact, String address, double salary) {
		this(contact, address, id, name);
		this.salary = salary;
	}
	public Student(String contact, String address, int id, String name) {
		// Constructor can be access within a constructor only.
		// Constructor call must be a first statement in a Constructor.
		this(id, name, contact); // call Constructor of same class
		this.address = address;
	}
	public Student(int id, String name, String contact) {
		this(id, name);
		this.contact = contact;
	}
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}


class Demo {
	private int a;
	public void setA(int a) {
		this.a = a;
	}
	public void print(int a) {
		System.out.println("a : " + this.a); // variable using this keyword
		//this.setA(34); // method using this keyword
		System.out.println("a : " + a);
	}
}
