package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		//no order - no indexing
		//stores values -key value<K,V>
		//key cannot be duplicate 
		//can store n number of null value but only one null key
		//hashmap is not thread safe - unsynchronized
		
		
		HashMap<String, String> capitalmap =new HashMap<String, String>();
		capitalmap.put("india", "new delhi");
		capitalmap.put("usa", "washington dc");
		capitalmap.put("uk", "london");
		capitalmap.put("uk", "london12");
		capitalmap.put(null, "berlin");
		capitalmap.put(null, "la");
		capitalmap.put("russia", null);
		capitalmap.put("france", null);
		
		capitalmap.remove("france");
		
		System.out.println(capitalmap.get("usa"));
		System.out.println(capitalmap.get("uk"));
		System.out.println(capitalmap.get(null));
		System.out.println(capitalmap.get("france"));
		System.out.println(capitalmap.get("russia"));
		
		//iterator
		Iterator<String> itr = capitalmap.keySet().iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			String value = capitalmap.get(key);
			System.out.println("key ="+key+" value ="+value);
		}
		System.out.println("-----------");
		//iterator : over the set (pair): by using entry set
		Iterator<Entry<String, String>> itr1 = capitalmap.entrySet().iterator();
		while(itr1.hasNext()) {
			Entry<String, String> entry = itr1.next();
			System.out.println("key ="+entry.getKey()+" value ="+entry.getValue());
		}
		System.out.println("-----------");
		//iterate hashmap by using jdk 8 for each and lambda
		capitalmap.forEach((K,V)-> System.out.println("key = "+K+" value ="+V));
		
	}
}
