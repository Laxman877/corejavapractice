package com.array;

import java.util.HashSet;

public class DuplicateElementInArray {
	public static void main(String[] args) {
		String a[]= {"java","C","C++","Python","C++"};
		
		//Approach1
		/*boolean flag=false;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("Found Duplicate Element: "+a[i]);
					flag=true;
				}
			}
		}
		if(flag==false) {
			System.out.println("Element Not Found");
		}*/
		//Approach-2 HashSet
		HashSet<String> lang=new HashSet();
		
		boolean flag=false;
		
		for(String l:a) {
			if(lang.add(l)==false) {
				System.out.println("Found duplicate element: "+l);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("No duplicate element in array");
		}
	}
}
