package java8;
interface Animals1{
	default void food() {
		System.out.println("Aniamls eat food");
	}
}
public class MainClass01 {
	public static void main(String[] args) {
		Animals1 lion=new Animals1() {
			@Override
			public void food() {
				// TODO Auto-generated method stub
				System.out.println("Lion eat - flesh");
			}
		};
		lion.food();
	}
}
