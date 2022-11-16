package com.array;

public class SumOfArray {
	public static void main(String[] args) {
		int a[]= {5,2,7,7};
		int sum=0;
		
//		for(int i=0;i<a.length;i++) {
//			sum=sum+a[i];
//		}
		//Enhanced for loop
		for(int value:a) {
			sum=sum+value;
		}
		System.out.println("The sum of array elements: "+sum);
	}
}
