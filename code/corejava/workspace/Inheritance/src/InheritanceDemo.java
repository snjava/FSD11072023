public class InheritanceDemo {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.id = 123;
		emp.name = "Abcd";
		emp.salary = 234234.23;
		emp.age = 34;
		emp.printEmployee();
		emp.printPerson();
	}
}
class Person { // parent, super, base class
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
