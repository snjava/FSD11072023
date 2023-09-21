import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(3453);
		set.add(53);
		set.add(353);
		set.add(33);
		set.add(34);
		set.add(5);
		set.add(45);
		set.add(3453);
		System.out.println(set);
		System.out.println(set.descendingSet());
		System.out.println(set.higher(45)); // higher value always
		System.out.println(set.lower(45)); // smaller value always
		System.out.println(set.ceiling(45)); // equals or higher value
		System.out.println(set.floor(45)); // equals or smaller value
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet(45));
		System.out.println(set.tailSet(45));
	}
}
