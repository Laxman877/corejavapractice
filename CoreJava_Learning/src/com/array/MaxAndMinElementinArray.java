package com.array;

public class MaxAndMinElementinArray {
	public static void main(String[] args) {
		int a[]= {50,100,20,30,40};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum Element in array is: "+max);
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minmum Element in Array is: "+min);
	}
}
