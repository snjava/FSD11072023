import java.util.ArrayList;
import java.util.Iterator;

public class CollectionCustomClass {
	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		for(int i=1; i<=3; i++) {
			int id = scan.nextInt();
			String name = scan.next();
			double price = scan.nextDouble();
			Product p1 = new Product(id, name, price);
			list.add(p1);
		}*/
		
		Product p1 = new Product(121, "TV", 23423.34);
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(p1);
		list.add(new Product(11, "Mobile", 11423.34));
		list.add(new Product(143, "Laptop", 43423.34));
		//System.out.println(list);
		
		
		Iterator<Product> it = list.iterator();
		while(it.hasNext()) {
			Product p = it.next();
			p.print();
		}
		
		System.out.println("=================");
		for(Product p : list) {
			p.print();
		}
	}
}

class Product {
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public void print() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Price : " + price);
	}
}
