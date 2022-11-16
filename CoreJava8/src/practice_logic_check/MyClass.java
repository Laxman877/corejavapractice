package practice_logic_check;

public class MyClass {
	public static void main(String[] args) {
		System.out.println("static main");
		main();
	}
	public static void main(int...args) {
		System.out.println("var main");
	}
}
