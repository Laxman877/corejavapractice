package com.basic;

public class SumOfNumberOfDigit {
	public static void main(String[] args) {
		int num=8964;
		int sum=0;
		
		while(num>0) {
			sum=sum+num%10; //4+3+2+1
			num=num/10;//123 12 1 0
		}
		System.out.println("Sum of the digits in a number: "+sum);
	}
}
