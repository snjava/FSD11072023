import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class GenericCollection {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Abc");
		list.add("Xyz");
		list.add("Lmn");
		list.add("Pqr");
		list.add("Stu");
		
		System.out.println(list);
		
		System.out.println("==================");
		ArrayList<Double> values = new ArrayList<Double>();
		values.add(345.34);
		values.add(34534.43);
		values.add(3412.23);
		values.add(534534.23);
		values.add(53223.3);
		
		Iterator<Double> itr = values.iterator();
		while(itr.hasNext()) {
			Double d = itr.next();
			System.out.println(d);
		}
		
		
		System.out.println("==================");
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(12, "Abc");
		map.put(23, "Xyz");
		map.put(132, "Pqu");
		map.put(112, "Lmn");
		System.out.println(map);
	}
}
