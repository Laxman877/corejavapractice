package java8;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
//		String str[]=new String[10];
//		String lowercaseString=str[5].toLowerCase();
//		System.out.println(lowercaseString);
		
//		String str[]=new String[10];
//		Optional<String> checkNull = Optional.ofNullable(str[5]);
//		if(checkNull.isPresent()) {
//			String loString=str[5].toLowerCase();
//			System.out.println(loString);
//		}else {
//			System.out.println("String value is not present");
//		}
		
		String str[]=new String[10];
		str[5]="java optional class example";
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if(checkNull.isPresent()) {
			String loString=str[5].toLowerCase();
			System.out.println(loString);
		}else {
			System.out.println("String value is not present");
		}
	}
}
