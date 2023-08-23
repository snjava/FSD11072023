public class ConstructorDemo {
	public static void main(String[] args) {
		Employee emp1 = new Employee(); // default or no-param constructor 
		System.out.println("========================");
		Employee emp2 = new Employee("Pqr", 111); // param constructor In Spring it is also known as  CI (constructor Injection)
		System.out.println("========================");
		Employee emp3 = new Employee("Xyz", 222, "NSS pvt.ltd."); // param constructor In Spring it is also known as CI (constructor Injection)
		emp3.print();
	}
}
class Employee {
	String companyName;
	String name;
	int id;
	public Employee() { // no-param constructor
		companyName = "Abc pvt.ltd.";
		name = "NA";
		//print();
	}
	public Employee(String n, int i) { // 2 param constructor
		companyName = "Abc pvt.ltd.";
		name = n;
		id = i;
		//print();
	}
	public Employee(String n, int i, String cn) {
		companyName = cn;
		name = n;
		id = i;
		//print();
	}
	
	public void print() {
		System.out.println("Company Name : "+ companyName);
		System.out.println("Employee Name : "+ name);
		System.out.println("Employee Id : "+ id);
	}
}
