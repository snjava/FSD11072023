public class SynchronizationDemo {
	public static void main(String[] args) {
		Printer printer = new Printer();
		TableThread th1 = new TableThread(printer);
		NumberThread th2 = new NumberThread(printer);
		th1.start();
		th2.start();
	}
}

class TableThread extends Thread {
	Printer printer;
	public TableThread(Printer printer) {
		this.printer = printer;
	}
	public void run() {
		synchronized (printer) { // synchronized block
			for(int i = 1; i <=10 ; i++) {
				printer.print("5 * " + i + " = " + (5*i));
				if(i==5) {
					try {
						printer.wait();
					} catch(InterruptedException ex) {
						ex.printStackTrace();
					}
				}
			}
		}
	}
}

class NumberThread extends Thread {
	Printer printer;
	public NumberThread(Printer printer) {
		this.printer = printer;
	}
	public void run() {
		synchronized (printer) { // synchronized block
			for(int i = 1; i <=10 ; i++) {
				printer.print("i =" + i);
			}
			printer.notify();
		}
	}
}

class Printer {
	public void print(String val) {
		System.out.println(val);
	}
}