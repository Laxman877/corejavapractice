package linkedHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapConcept {

	public static void main(String[] args) {

		ConcurrentHashMap<String, Integer> conhash = new ConcurrentHashMap<>();
		conhash.put("James", 100);
		conhash.put("Brad", 200);
		conhash.put("Albert", 400);
		conhash.put("George", 50);
		conhash.put("Larry", 900);
		conhash.put("Ted", 120);
		conhash.put("Paul", 300);

		conhash.forEach((k, v) -> System.out.println("key = " + k + " " + v));

		int n = 83955;

		int sum = n % 11;

		System.out.println("index "+sum);
	}
}
