public class SleepJoinThread {
	public static void main(String[] args) {
		System.out.println("Main STARTED");
		Thread1 t1 = new Thread1(); // new stage
		t1.start(); // Runnable stage
		
		try {
			t1.join(5000);
		} catch (InterruptedException e) {
		}
		
		for(int i =0 ; i<=10 ; i++) {
			System.out.println(i);
		}
		System.out.println("Main ENDS");
	}
}

class Thread1 extends Thread {
	public void run() {
		System.out.println("Thread1 STARTED");
		for(int i = 1; i<=10 ; i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException ex) {
				
			}
			System.out.println("5 * " + i + " = " + (5*i));
		}
		System.out.println("Thread1 ENDS");
	}
}


