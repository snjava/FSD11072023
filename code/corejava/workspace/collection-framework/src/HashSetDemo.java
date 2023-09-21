import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add("abc");
		set.add(234);
		set.add("abc");
		set.add(423.54);
		set.add('A');
		set.add(null);
		System.out.println(set);
	}
}
