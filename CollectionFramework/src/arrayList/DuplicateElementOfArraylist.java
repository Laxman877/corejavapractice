package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElementOfArraylist {
	public static void main(String[] args) {
		
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1,2,4,5,3,2,4,5,7,8,5,2,3));
		//1.linkedhashset 
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(number);
		
		ArrayList<Integer> numberlist = new ArrayList<Integer>(linkedHashSet);
		System.out.println(numberlist);
		
		//jdk 8 - stream
		ArrayList<Integer> number1 = new ArrayList<Integer>(Arrays.asList(1,2,4,5,3,2,4,5,7,8,5,2,3));
		List<Integer> list = number1.stream().distinct().collect(Collectors.toList());
		System.out.println(list);
		
	}
}
