package com.basic;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year which you want to check leap year or not :");
		/*int year=sc.nextInt();
		
		if((year%4==0 && year%100!=0) || year%400==0) {
			System.out.println(year+" year is a leap year");
		}else {
			System.out.println(year+" year is not leap year");
		}*/
		/*int n=sc.nextInt();
		if((n%4==0 && n%100!=0) || n%400==0) {
			System.out.println(n+" year is a leap year");
		}else {
			System.out.println(n+" year is not a leap year");
		}*/
		/*int n=sc.nextInt();
		if((n%4==0 && n%100!=0) || n%4==0){
			System.out.println("Year is a leap year");
		}else {
			System.out.println("Year is not leap year");
		}*/
		/*int n=sc.nextInt();
		if((n%4==0 && n%100!=0) || n%400==0) {
			System.out.println("Year is a leap year");
		}else {
			System.out.println("Year is not leap year");
		}*/
		int n=sc.nextInt();
		if((n%4==0 && n%100!=0) || n%400==0) {
			System.out.println("Year is a leap year");
		}else {
			System.out.println("Year is not leap year");
		}
	}
}
