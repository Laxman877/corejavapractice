package com.array;

public class SortedArray {
	public static void main(String[] args) {
		int a[]= {6,3,7,8,1,5,9,4};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
	}
}
