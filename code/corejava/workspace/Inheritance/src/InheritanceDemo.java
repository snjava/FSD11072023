public class InheritanceDemo {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.id = 123;
		emp.name = "Abcd";
		emp.salary = 234234.23;
		emp.age = 34;
		emp.printEmployee();
		emp.printPerson();
		System.out.println("===============");
		Developer dev = new Developer();
		dev.id = 222;
		dev.name = "Xyz";
		dev.age = 23;
		dev.salary = 345334.34;
		dev.skills = "Java Developer";
		dev.exp = 1.3;
		dev.printPerson();
		dev.printEmployee();
		dev.printDeveloper();
		System.out.println("===============");
		Doctor doc = new Doctor();
		doc.name = "Lmn";
		doc.age = 33;
		doc.id = 345;
		doc.salary = 343243.23;
		doc.licenceNo = "DC345332";
		doc.printDoctor();
		
		// Example of polymorphic object
		Person obj1 = new Employee();
		Person obj2 = new Doctor();
		
	}
}
class Person extends Object { // parent, super, base class
	String name;
	int age;
	public void printPerson() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}
// Employee IS-A Person
class Employee extends Person { //child, sub, derived class
	int id;
	double salary;
	public void printEmployee() {
		System.out.println("Id : " + id);
		System.out.println("Salary : " + salary);
		//printPerson();
		//System.out.println("Name : " + name);
		//System.out.println("Age : " + age);
	}
}
// Developer IS-A Employee
class Developer extends Employee {
	String skills;
	double exp;
	public void printDeveloper() {
		System.out.println("Skills : " + skills);
		System.out.println("Experience : " + exp);
	}
}
// Doctor IS-A Employee
class Doctor extends Employee {
	String licenceNo;
	public void printDoctor() {
		printPerson();
		printEmployee();
		System.out.println("Licence Number : " + licenceNo);
	}
}





