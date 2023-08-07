public class Array1D {
	public static void main(String args[]) {
		double salary[]; // array declaration
		salary = new double[5]; // array instantiation	
		salary[0] = 23423.23; // Initialization
		salary[2] = 32423.13;
		salary[3] = 67423.21;
		salary[4] = 71423.65;

		for(int i = 0 ; i<=4 ; i++) {
			System.out.println(salary[i]);
		}
	}
}