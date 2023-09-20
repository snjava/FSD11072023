import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(234.56);
		list.add("Abcd");
		list.add(234);
		list.add(56);
		list.add('A');
		list.add("Abcd");
		System.out.println(list);
		list.add(2, 5);
		System.out.println(list);
		
		list.addLast(1111);
		list.addFirst(2222);
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}
}
