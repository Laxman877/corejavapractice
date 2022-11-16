package com.basic;

import java.util.Scanner;

public class AsciiFoCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
		char ch=sc.next().charAt(0);
		int asciival=ch;
		System.out.println("Ascii value of character: "+ch+" is: "+asciival);
	}
}
