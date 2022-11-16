package java8;

interface Animals{
	
	default void food() {
		System.out.println("Animal eat food");
	}
	
}
class Lion2 implements Animals{
	//if we want - we can override default method in java 8
	@Override
	public void food() {
		// TODO Auto-generated method stub
		System.out.println("Loin eat - flesh");
	}
}
public class MyTestClass {
	public static void main(String[] args) {
		Animals animal=new Lion2();
		animal.food();
	}
}
