package com.basic;

//public class UserDefinedException extends Exception {
//	UserDefinedException(String s){
//		super(s);
//	}
//}
public class UserDefinedException extends RuntimeException {
	UserDefinedException(String s){
		super(s);
	}
}