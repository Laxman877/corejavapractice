package oops;

import java.io.IOException;

class Test1{
	Test1(int i){
		System.out.println("no arg");
	}
	Test1() throws IOException{
		
	}
}
class P extends Test1{

	P() throws IOException {
		super();
	}

}
public class ConstructorExample {

	String name;// default value is null
	int rollno;// default value is 0
	
	public static void m1() {
		m2();
	}
	public static void m2() {
		m1();
	}
	public static void main(String[] args) {
//		Enquiry enq = new Enquiry(10.5);
//		Enquiry enq1 = new Enquiry(10);
//		Enquiry enq2 = new Enquiry();
		
	}
}
//class C extends P{
//	String s="child variable";
//	
//	public static void m1() {//in static context we cannot use super or this keyword
//		System.out.println(s);
//		System.out.println(this.s);
//		System.out.println(super.s);
//	}
//}

