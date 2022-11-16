package oops;

abstract class TerrestrialAnimal{

	void habitat() {
		System.out.println("Habitat of terrestrial Animal is land");
	}
	abstract void food();

}
class Lion extends TerrestrialAnimal{

	@Override
	void food() {
		// TODO Auto-generated method stub
		System.out.println("Lion eat - flesh");
	}
	
}
class Goat extends TerrestrialAnimal{

	@Override
	void food() {
		// TODO Auto-generated method stub
		System.out.println("Goat Eat - grass");
	}
	
}
public class AbstractTest {
	
	public static void main(String[] args) {
		TerrestrialAnimal lion=new Lion();
		lion.habitat();
		lion.food();

		TerrestrialAnimal goat=new Goat();
		goat.habitat();
		goat.food();

	}
}
