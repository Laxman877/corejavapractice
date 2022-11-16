package com.basic;

import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 3 number what you want to compare : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		//Approach - logic
		/*if(x>y && x>z) {
			System.out.println("The greatest number is : "+x);
		}else if(y>z) {
			System.out.println("The greatest number is : "+y);
		}else {
			System.out.println("The greatest number is : "+z);
		}*/
		
		//Approach -
		/*int largest1=x>y?x:y;//largest of x & y
		int largest2=z>largest1?z:largest1;// largest of z & largest1
		
		System.out.println(largest2+" is largest number");*/
		int largest=z>(x>y?x:y)?z:(x>y?x:y);
		System.out.println(largest+" is largest number");
	}
}
