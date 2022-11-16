package com.array;

public class MissingNumberInArray {
	public static void main(String[] args) {
		//array should not have duplicates
		//array no need to be sorted orderd
		//values should be range
		
		int a[]= {1,2,4,5};
		//1+2+4+5=12 sum1
		//1+2+3+4+5=15 sum2
		//sum2-sum1=15-12=3 missing
		
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		System.out.println("sum of the array element: "+sum1);
		int sum2=0;
		for(int i=6;i<=10;i++) {
			sum2=sum2+i;
		}
		System.out.println("sum of range of the array element: "+sum2);
		
		System.out.println("Missing Number is: "+(sum2-sum1));
	}
}
