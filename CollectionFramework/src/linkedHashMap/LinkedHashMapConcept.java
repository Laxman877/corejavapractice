package linkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapConcept {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> linkMap = new LinkedHashMap<String, Integer>();
		linkMap.put("AD", 97);
		linkMap.put("BC", 98);
		linkMap.put("CA", 99);
		linkMap.put("DB", 100);
		linkMap.put("EF", 100);
		linkMap.put("IJ", 100);
		linkMap.put("KL", 100);
		linkMap.put("MN", 100);
		linkMap.put("PR", 100);
		linkMap.put("ZS", 100);
		
		System.out.println(linkMap.get("CA"));
		System.out.println(linkMap.size());
	}
}
