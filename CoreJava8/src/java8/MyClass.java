package java8;
interface Interface1{
	default void myMethod() {
		System.out.println("method");
	}
}
interface Interface2{
	default void myMethod() {
		System.out.println("method");
	}
}
public class MyClass implements Interface1, Interface2 {

	public static void main(String[] args) {
		MyClass my=new MyClass();
		my.m1(10);
	}
	void m1(final int x){
		
	}
	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		System.out.println("myMethod()");
	}

}
