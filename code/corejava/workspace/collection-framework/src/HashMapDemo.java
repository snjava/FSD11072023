import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap map = new LinkedHashMap();
		map.put("A", "ABC");
		map.put(123, "Xyz");
		map.put(112.33, 456.54);
		map.put("A", 555);
		map.put(null, "AA");
		map.put(12345, null);
		map.put(7867, "ABC");
		map.put('Z', "Pqr");
		System.out.println(map);
		System.out.println(map.get(123));
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		map.remove("A");
		//map.remove("A", 555);
		System.out.println(map);
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsValue("ABC"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		map.clear();
		System.out.println(map);
	}
}
