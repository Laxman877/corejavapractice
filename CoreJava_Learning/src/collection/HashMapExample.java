package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer, Integer> hashMap=new HashMap<Integer, Integer>();
		hashMap.put(21, 12);//21/5=1
		hashMap.put(30, 121);//30/5=0
		hashMap.put(33, 151);
		hashMap.put(25, 95);
		hashMap.put(23, 45);
		
		System.out.println("value corresponding to key 21="+hashMap.get(21));
		System.out.println("value corresponding to key 51="+hashMap.get(51));
		System.out.println("value corresponding to key 33="+hashMap.entrySet());
		
		for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			System.out.println("Key = "+entry.getKey() + " , Value = "+entry.getValue());
		}
		
		System.out.println("value corresponding to key 21="+hashMap.remove(21));
		System.out.println("value corresponding to key 51="+hashMap.remove(51));
		
		for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			System.out.println("Key = "+entry.getKey() + " , Value = "+entry.getValue());
		}
	}
}
