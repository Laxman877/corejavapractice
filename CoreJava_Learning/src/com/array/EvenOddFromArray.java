package com.array;

public class EvenOddFromArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		//extracting even numbers
		System.out.println("Even numbers in array..");
		/*for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) 
				System.out.print(a[i]+" ");
		}*/
		for(int value:a) {
			if(value%2==0) 
				System.out.print(value);
		}
		System.out.println("\nOdd numbers in array..");
		/*for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) 
				System.out.print(a[i]+" ");
		}*/
		for(int value:a) {
			if(value%2!=0)
				System.out.print(value);
		}
	}
}
