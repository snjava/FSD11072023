// Encapsulation class, DTO(Data Transfer Object), Entity class, Bean Class, POJO(Plain Old Java Object) class
class Employee {
	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
}

public class EmpOperations {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(34);  // In Spring it is also known as SI (Setter Injection)
		emp.setName("Abcd");
		emp.setSalary(345345.34);
		
		System.out.println("Id : " + emp.getId());
		System.out.println("Name : " + emp.getName());
		System.out.println("Salary : " + emp.getSalary());
	}
}











