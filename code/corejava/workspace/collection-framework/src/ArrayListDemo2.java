import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Abc");
		list.add("Xyz");
		list.add(34.34);
		list.add(22);
		System.out.println(list);
		System.out.println(list.get(1));
		list.add(1, 111);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.set(0, 555);
		System.out.println(list);
	}
}
