package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArralistConcept {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("narendra");
		list.add("rajat");
		list.add("laxman");
		list.add("rahul");
		list.add("mayur");

		// for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------");

		// for each
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("---------");
		// jdk 8 - stream with lamda
		list.stream().forEach(ele -> System.out.println(ele));
		System.out.println("---------");
		// iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
