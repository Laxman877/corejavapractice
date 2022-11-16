package com.interviewQue;

public class SpecialCharacterInString {
	public static void main(String[] args) {
		 String s="CloudTech#@!";
		 
		 String specialCharacterRemove="";
		 
		 int count = 0;
		 
		 for(int i=0;i<s.length();i++) {
			 if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
				count++;
			 }else {
				 specialCharacterRemove = specialCharacterRemove + s.charAt(i);
			 }
		 }
		 if(count == 0) {
			 System.out.println("The special character not  found");
		 }else {
			 System.out.println("Special character is found "+count);
		 }
		 System.out.println("Special character remove "+specialCharacterRemove);
	}
}
