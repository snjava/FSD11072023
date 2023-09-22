import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(321, "ABC");
		map.put(123, "Xyz");
		map.put(112, 456.54);
		map.put(33, 555);
		map.put(1233, "AA");
		map.put(45, null);
		map.put(7867, "ABC");
		map.put(113, "Pqr");
		System.out.println(map);

		System.out.println(map.firstKey());
		System.out.println(map.firstEntry());
		System.out.println(map.lastKey());
		System.out.println(map.lastEntry());
		
		System.out.println(map.higherKey(45));
		System.out.println(map.higherEntry(45));
		System.out.println(map.lowerKey(45));
		System.out.println(map.lowerEntry(45));
		
		System.out.println(map.ceilingKey(45));
		System.out.println(map.ceilingEntry(45));
		System.out.println(map.floorKey(45));
		System.out.println(map.floorEntry(45));
		
		System.out.println(map.headMap(112));
		System.out.println(map.tailMap(112));
	}
}





