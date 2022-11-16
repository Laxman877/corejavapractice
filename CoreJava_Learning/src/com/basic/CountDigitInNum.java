package com.basic;

import java.util.Scanner;

public class CountDigitInNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		long num=sc.nextLong();
		int count=0;
		
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("Number of digit in number: "+count);
	}
}
