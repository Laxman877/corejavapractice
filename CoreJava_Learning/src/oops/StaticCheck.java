package oops;

public class StaticCheck {
	int x=10;
	static int y=20;
	public static void main(String[] args) {
		
		int a;
		StaticCheck check = new StaticCheck();
		System.out.println(check.x);
		System.out.println(y);
		
		check.x=111;
		y=222;
		
		StaticCheck check1 = new StaticCheck();
		System.out.println(check1.x);
		System.out.println(y);
		
	}
}
