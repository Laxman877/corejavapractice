package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConvertArraylistOfString {
	public static void main(String[] args) {
		System.out.println("1. Create List of String");
		List<String> listStrings=new ArrayList<>();
		listStrings.add("java");
		listStrings.add("python");
		
		System.out.println("2. Convert list of (Arraylist) String to stream");
		Stream<String> streamString=listStrings.stream();
		
		System.out.println("3. Display Stream of String");
		streamString.forEach(System.out::println);
	}
}
