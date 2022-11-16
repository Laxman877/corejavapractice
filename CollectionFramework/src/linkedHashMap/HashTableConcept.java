package linkedHashMap;

import java.util.Hashtable;

public class HashTableConcept {
	
	public static void main(String[] args) {
		Hashtable<String, Integer> hashtable = new Hashtable<>();
		hashtable.put("Albert", 400);
		hashtable.put("George", 50);
		hashtable.put("Larry", 900);
		hashtable.put("Ted", 120);
		hashtable.put("Paul", 300);
		
		System.out.println(hashtable.get("Larry"));
		System.out.println(hashtable.get("Ted"));
		System.out.println(hashtable.get("Paul"));
		
		
	}
}
