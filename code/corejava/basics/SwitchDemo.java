public class SwitchDemo {
	public static void main(String args[]) { 
		int day = 5;
		switch(day)
		{	
			case 1:
			case 8:
			case 16:
				System.out.println("Mon");
				break;
			case 2:
				System.out.println("Tues");
				break;
			case 3:
				System.out.println("Wed");
				break;
			case 4:
				System.out.println("Thus");
				break;
			case 5:
				System.out.println("Fri");
				break;
			case 6:
				System.out.println("Sat");
				break;
			case 7:
				System.out.println("Sun");
				break;
			default:
				System.out.println("Invalid Day...");
		}







/*		if(day == 1) {
			System.out.println("Mon");
		}
		else if(day == 2) {
			System.out.println("Tues");
		}
		else if(day == 3) {
			System.out.println("Wed");
		}
		else if(day == 4) {
			System.out.println("Thus");
		}
		else if(day == 5) {
			System.out.println("Fri");
		}
		else if(day == 6) {
			System.out.println("Sat");
		}
		else if(day == 7) {
			System.out.println("Sun");
		}
		else {
			System.out.println("Invalid Day...");
		}
*/
	}
}