package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConvertArrayListOfIntegers {
	public static void main(String[] args) {
		System.out.println("1. Create list of integer");
		List<Integer> listOfIntegers = new ArrayList<>();
		listOfIntegers.add(11);
		listOfIntegers.add(12);
		
		System.out.println("2. Convert list (ArrayList) of Integer to stream");
		Stream<Integer> streamOfInteger = listOfIntegers.stream();
		
		System.out.println("3. Display Stream of Integer");
		streamOfInteger.forEach(System.out::println);
	}
}
