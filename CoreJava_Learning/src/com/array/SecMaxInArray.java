package com.array;

public class SecMaxInArray {
	public static void main(String[] args) {
		int a[]= {12,35,47,86,15,46,96};
		
		int max=a[0];
		int sec_max=a[1];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				sec_max=max;
				max=a[i];
			}
			else if(a[i]>sec_max && a[i]!=max)
			{
				sec_max=a[i];
			}
		}
		System.out.println("The max val is: "+max);
		System.out.println("The sec amx val is: "+sec_max);
	}
}
