package practice_logic_check;

import java.io.FileNotFoundException;
import java.io.IOException;

class SuperClass{
	void method() {
		System.out.println("superclass method");
	}
}
class SubClass extends SuperClass{
	void method() {
		System.out.println("subclass method");
	}
}
public class AbstractionConcept {
	public static void main(String[] args) throws IOException {
		SuperClass sub=new SubClass();
		sub.method();
	}
}
