public class FinalDemo {
	public static void main(String args[]) {
		Company c = new Company();
		System.out.println(c.companyName);
		c.policies();
	}
}


final class Company {
	final String companyName = "Abc Pvt.Ltd.";
	public final void policies() {
		System.out.println("leave Policies");
		System.out.println("Attendance Policies");
		System.out.println("Medical Policies");
	}
}
