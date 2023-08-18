// Encapsulation class, DTO(Data Transfer Object), Entity class, Bean Class, POJO(Plain Old Java Object) class
class Employee {
	private int empid;
	private String name;
	private double salary;
	//Setter methods accept the values which needs to set and no return anything.
	public void setId(int i) {
		empid = i;
	}
	public void setName(String n) {
		name = n;
	}
	public void setSalary(double s) {
		if(s>=2000) {
			salary = s;	
		} else {
			System.out.println("Invalid Salary....");
			System.exit(0);
		}
	}
	//Getter methods will not accept any input value but return the value.
	public int getId() {
		return empid;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
}

public class EmpOperations {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(34);
		emp.setName("Abcd");
		emp.setSalary(345345.34);
		
		System.out.println("Id : " + emp.getId());
		System.out.println("Name : " + emp.getName());
		System.out.println("Salary : " + emp.getSalary());
	}
}











