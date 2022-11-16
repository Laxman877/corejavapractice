package java8;
@FunctionalInterface
interface MyInterface {
	public abstract void myMethod();
}
public class MainClass {
	public static void main(String[] args) {
		//create annonymous inner class
//		MyInterface myInterface= new MyInterface() {
//			
//			@Override
//			public void myMethod() {
//				// TODO Auto-generated method stub
//				System.out.println("xx");
//			}
//		};
//		myInterface.myMethod();
		
		//using lambda expression
		MyInterface myInterface=()->{
			System.out.println("xx");
		};
		myInterface.myMethod();
	}
}
