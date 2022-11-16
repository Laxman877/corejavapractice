package practice_logic_check;
class Animals{
	void food() {
		System.out.println("Animal may eat flesh , grass or..");
	}
}
class Lion extends Animals{
	@Override
	void food() {
		System.out.println("Lion eat - flesh");
	}
}
class Goat extends Animals{
	@Override
	void food() {
		System.out.println("Goat eat - grass");
	}
}
public class MainClass {
	public static void main(String[] args) {
		Animals lion=new Lion();
		lion.food();
		
		Animals goat=new Goat();
		goat.food();
	}
}
