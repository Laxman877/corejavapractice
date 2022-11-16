package com.basic;

import java.util.ArrayList;
import java.util.List;
class MyClass{
	
}
public class FinalCheck{
	int memvar=0;
	void m() {
		int localVar=0;
		MyClass myClass=new MyClass() {
			void m() {
				System.out.println(localVar);
				System.out.println(memvar);
			}
		};
	}
}
