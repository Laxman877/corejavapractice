package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("java");
		ar1.add("php");
		ar1.add("python");
		ar1.add("javascript");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Testing");
		ar2.add("dev ops");
		
//		ar1.addAll(ar2);
//		System.out.println(ar1);
//		
//		ar1.addAll(2, ar2);
//
//		System.out.println(ar1);
//
//		ar1.clear();
//		System.out.println(ar1);
		
		ArrayList<String> clonelist = (ArrayList<String>)ar1.clone();
		System.out.println(clonelist);
		
		System.out.println(ar1.contains("php"));
		System.out.println(ar1.contains("pythone"));
		System.out.println(ar1.indexOf("php")>0);
		
		ArrayList<String> list1 =new ArrayList<String>(Arrays.asList("laxman","bhumi","krushit","kavita","laxman"));
		System.out.println(list1);
		
		int i = list1.lastIndexOf("test");
		System.out.println(i);
		
		list1.remove(0);
		list1.remove("kavita");
		System.out.println(list1);
	
		ArrayList<Integer> numbers =new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		numbers.removeIf(num -> num%2 != 0);
		System.out.println(numbers);
		
		ArrayList<String> nameslist =new ArrayList<String>(Arrays.asList("laxman","bhumi","krushit","kavita","bhumi"));

		System.out.println(nameslist);
		
		nameslist.retainAll(Collections.singleton("bhumi"));
		System.out.println(nameslist);
		
		ArrayList<Integer> numbers1 =new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
		
		ArrayList<Integer> sublist = new ArrayList<Integer>(numbers1.subList(9, 13));
		System.out.println(sublist);
		
		ArrayList<String> newlist =new ArrayList<String>
		(Arrays.asList("laxman","bhumi","krushit","kavita","manan"));
		Object[] array = newlist.toArray();
		System.out.println(Arrays.toString(array));
		
		for(Object o : array) {
			System.out.println(o);
		}
	}
}
