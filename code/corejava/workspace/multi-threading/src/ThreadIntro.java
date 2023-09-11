public class ThreadIntro {
	public static void main(String[] args) {
		System.out.println("main Thread STARTED..");
		
		FirstThread th = new FirstThread();
		th.setName("my-thread");
		th.setPriority(10); // Thread priority must be between 1-10
		th.start(); // make thread ready to run
		
		Thread currentTh = Thread.currentThread(); // return the object of currently thread.
		System.out.println(currentTh);// Thread[main(Thread Name),5 (Thread Priority),main(Thread Group)]
		
		System.out.println("main Thread ENDS..");
	}
}

class FirstThread extends Thread {
	public void run() {
		System.out.println("My First Thread STARTED");
		
		Thread currentTh = Thread.currentThread(); 
		System.out.println(currentTh);
		
		System.out.println("My First Thread ENDS");
	}
}
