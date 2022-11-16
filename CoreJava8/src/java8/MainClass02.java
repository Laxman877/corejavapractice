package java8;
interface Animal{
	static void food() {
		System.out.println("Animal eat food");
	}
}
class Lion implements Animal{
	public void food() {
		// TODO Auto-generated method stub
		System.out.println("lion eat - flesh");
	}
}
public class MainClass02 {
	public static void main(String[] args) {
		Animal.food();
	}
}
