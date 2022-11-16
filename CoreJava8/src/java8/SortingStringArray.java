package java8;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStringArray {
	public static void main(String[] args) {
		String []string= {"ab","ef","cd"};
		
		class StringSort implements Comparator<String>{

			@Override
			public int compare(String a, String b) {
				// TODO Auto-generated method stub
				return a.compareTo(b);
			}
		}
		System.out.println("Before Java 8 - Sort StringArray using Using " + " > Local class - i.e. Without Lambda expression");
		
		Arrays.sort(string,new StringSort());
		
		for(String str:string) {
			System.out.println(str+" ");
		}
	}
}
