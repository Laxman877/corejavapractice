package com.basic;
//natural number>1
//which has only 2 factor 1 and itself
public class PrimeNumberCheck {
	public static void main(String[] args) {
		//approach -2
		/*for(int num=3;num<=100;num++) {
			int flag=0;
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(num+" num is prime number");
			}else {
				System.out.println(num+" num is not prime number");
			}
		}*/
		int num=41;
		int count=0;
		
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("Prime number");
			}else {
				System.out.println("Not prime number");
			}
		}else {
			System.out.println("Not prime number");
		}
	}
}
