package treeMap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(1000, "Tom");
		map.put(2000, "Peter");
		map.put(3000, "Steve");
		map.put(11000, "Naveen");
		map.put(1400, "Robby");
		
		System.out.println(map);
		
		map.forEach((k,v)->System.out.println("key = "+k+" value = "+v));
		
		System.out.println(map.lastKey());
		System.out.println(map.firstKey());
		
		Set<Integer> keySet = map.headMap(3000).keySet();
		
		System.out.println(keySet);
		
		
		Set<Integer> keySet2 = map.tailMap(3000).keySet();
		
		System.out.println(keySet2);
		
		TreeMap<String, Integer> userMap =new TreeMap<>();
		userMap.put("James", 100);
		userMap.put("Brad", 200);
		userMap.put("Albert", 400);
		userMap.put("George", 50);
		userMap.put("Larry", 900);
		userMap.put("Ted", 120);
		userMap.put("Paul", 300);

		userMap.forEach((k,v)->System.out.println("key = "+k+" value = "+v));

		
	}
}
