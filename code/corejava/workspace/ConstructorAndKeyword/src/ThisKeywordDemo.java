
public class ThisKeywordDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.setA(22);
		d.print(200);
	}
}

class Demo {
	private int a;
	public void setA(int a) {
		this.a = a;
	}
	public void print(int a) {
		System.out.println("a : " + this.a);
		System.out.println("a : " + a);
	}
}
