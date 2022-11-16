package com.basic;

import java.util.Scanner;

public class SumAndAvgOfNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		int sum=0;
		double avg;
		System.out.println("Input the number");
		for(int i=0;i<5;i++) {
			num=sc.nextInt();
			sum+=num;
		}
		avg=sum/5;
		System.out.println("sum of 5 num is : "+sum+"\naverage of 5 number is: "+avg);
	}
}
