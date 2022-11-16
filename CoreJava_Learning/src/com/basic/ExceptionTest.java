package com.basic;

public class ExceptionTest {
	public static void main(String[] args) {
		
		System.out.println("Method return -> "+m());
	}
	static String m() {
		try {
			//int i=10/0;
			int i=1;
			return "try";
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//			//System.out.println("Exception handeled properly in catch block");
//			return "catch";
		}finally {
			return "finally";
		}
	}
}
