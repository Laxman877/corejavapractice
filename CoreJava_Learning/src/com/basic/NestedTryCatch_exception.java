package com.basic;

public class NestedTryCatch_exception {
	public static void main(String[] args) {
		try {
			int i=10/0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("try-catch block handled - ArithmaticException");
			try {
				String s=null;
				s.charAt(0);
			} catch (NullPointerException e2) {
				// TODO: handle exception
				System.out.println("Nested Try Catch block handled - "+"NullPointerException");
			}
		}
	}
}
