package com.basic;

import java.util.Scanner;

public class CountCharacterInString {
	public static void main(String[] args) {
		String s="hi. How are you? ho is going your java preparetion? last 150 days";
		count(s);
	}
	public static void count(String x) {
		char ch[]=x.toCharArray();
		int letter=0;
		int space=0;
		int num=0;
		int other=0;
		for(int i=0;i<x.length();i++) {
			if(Character.isLetter(ch[i])) {
				letter++;
			}else if(Character.isSpaceChar(ch[i])) {
				space++;
			}else if(Character.isDigit(ch[i])) {
				num++;
			}else {
				other++;
			}
		}
		System.out.println("hi. How are you? ho is going your java preparetion? last 150 days");
		System.out.println("letter: "+letter);
		System.out.println("num: "+num);
		System.out.println("space: "+space);
		System.out.println("other: "+other);
	}
}
