package hashMap;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {

	public static Map<String, Integer> marksMap;
	
	static {
		marksMap = new HashMap<String, Integer>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
	}
	public static void main(String[] args) {
		//1. using hashmap class
		HashMap<String, String> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();
		
		//2. static way : static hashmap:
		System.out.println(HashMapInitialization.marksMap.get("A"));
		
		//3.immutable map with only one single entry
		Map<String, Integer> map3 = Collections.singletonMap("test", 100);
		
		System.out.println(map3.get("test"));
//		map3.put("abc", 200);
		
		//4. jdk 8 ;
		Map<String, String> map4 = Stream.of(new String[][] {
			{"Tom","A Grade"},
			{"Naveen","A+ Grade"}
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
	
		System.out.println(map4.get("Tom"));
		
		map4.put("Lisa", "A++ Grade");
		System.out.println(map4.get("Lisa"));
	
		//using simple entry : imutable map
		Map<String, String> map = Stream.of(
				new AbstractMap.SimpleEntry<>("laxman","java"),
				new AbstractMap.SimpleEntry<>("krushit","python")
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(map.get("laxman"));
		map.put("kunal", "c#");
		
		//jsk 9 : empty map
		
//		Map<String, String> emptymap = Map.of();
//		emptymap.put("Tom", "python");
//		System.out.println(emptymap.get("Tom"));
		
		
		
	}
}
