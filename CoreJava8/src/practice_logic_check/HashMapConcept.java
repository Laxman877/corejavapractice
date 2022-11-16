package practice_logic_check;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
	public static void main(String[] args) {
		Map<String, Integer> marks=new HashMap<String, Integer>();
		marks.put("laxman", 100);
		marks.put("kunal", 200);
		marks.put("amit", 300);
		marks.put("peter", 400);
		marks.put("joy", 600);
		
		marks.put(null, 900);
		
		//hashing : hashcode() -> hashing
		System.out.println(marks.get("amit"));
	}
}
