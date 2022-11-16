package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		Map<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("Nav", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Nave", 600);

		marks.put(null, 700);
		marks.put(null, 800);
		marks.put("Nav", 900);

		//hashing ; hashcode()-->hashing
		
		Iterator<Entry<String, Integer>> itr = marks.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
}
