package com.interviewQue;

public class RotationInString {
	public static void main(String[] args) {
		String str1="ABCD";
		
		String str2="CDAB";
		
		if(isRotation(str1, str2)) {
			System.out.println("Rotation found in String");
		}else {
			System.out.println("Rotaion is not found in String");
		}
	}
	public static boolean isRotation(String str1, String str2) {
		return ((str1.length() == str2.length()) && (str1+str1).indexOf(str2) != -1);
	}
}
