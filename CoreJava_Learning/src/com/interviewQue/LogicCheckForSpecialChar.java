package com.interviewQue;

public class LogicCheckForSpecialChar {
	public static void main(String[] args) {
		String str="CloudTech#!@";
		
		String specialCharcterRemove="";
		
		String specialcharcter="";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
				count++;
				specialcharcter=specialcharcter+str.charAt(i);
			}else {
				specialCharcterRemove=specialCharcterRemove+str.charAt(i);
			}
		}
		if(count == 0) {
			System.out.println("The Special Character not found");
		}else {
			System.out.println("The Special Character found "+count+" "+specialcharcter);
		}
		System.out.println("The special character removed "+specialCharcterRemove);
	}
}
