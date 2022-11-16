package com.basic;

public class Multiple_Catch {
	public static void main(String[] args) {
		try {
			int i=10/0;
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Exception handled : ArithmaticException");
		}catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println("Exception handled : RuntimeException");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception handled : Exception");
		}
	}
}
