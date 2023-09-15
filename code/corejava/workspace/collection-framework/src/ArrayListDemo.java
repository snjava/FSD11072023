import java.util.ArrayList;
/*
 * Wrapper Class
 * Primitive		Wrapper Class
 * --------------------------------
 * byte				Byte
 * short			Short
 * int				Integer
 * long				Long
 * double			Double
 * float			Float
 * char				Character
 * boolean			Boolean
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1234);
		list.add(23.54);
		list.add("Abcd");
		list.add(1234);
		list.add("Xyz");
		System.out.println(list);
		Integer i = 1234;
		list.remove(i);
		System.out.println(list);	// [1234, 23.54, 1234, Xyz]
		System.out.println(list.contains("Lmn"));
		System.out.println(list.get(2)); // 1234
		System.out.println(list.size());
		//list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		ArrayList l1 = new ArrayList();
		l1.add(444);
		l1.add("AAA");
		l1.add(44.4);
		l1.add("Xyz");
		
		System.out.println(list);
		list.addAll(l1);
		System.out.println(list);
		System.out.println(list.containsAll(l1));
		//list.removeAll(l1);
		list.retainAll(l1);
		System.out.println(list);
	}
}










