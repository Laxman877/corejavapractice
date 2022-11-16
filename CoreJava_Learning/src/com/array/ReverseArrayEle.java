package com.array;

import java.util.Arrays;

public class ReverseArrayEle {
	public static void main(String[] args) {
		
		/*int a[]= {2,5,3,6,4,8,9,7};
		
		System.out.println("the original Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("The rev array");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}*/
		
		String []str= {"java","hello"};
		StringBuilder arrRev=new StringBuilder();
		
		for(int i=str.length;i>0;i--)
		{
			arrRev.append(str[i-1]).append(" ");
		}
		String[] revArr=arrRev.toString().split(" ");
		System.out.println(Arrays.toString(revArr));
	}
}
