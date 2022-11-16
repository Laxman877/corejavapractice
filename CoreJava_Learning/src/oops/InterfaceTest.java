package oops;
interface Animal{
	void habitat();
	void food();
	
}
class Lion1 implements Animal{

	@Override
	public void habitat() {
		// TODO Auto-generated method stub
		System.out.println("Habitat of lion is land");
	}

	@Override
	public void food() {
		// TODO Auto-generated method stub
		System.out.println("Lion eat - flesh");
	}
	
}
class Whale implements Animal{

	@Override
	public void habitat() {
		// TODO Auto-generated method stub
		System.out.println("Habitat of whale is water");
	}

	@Override
	public void food() {
		// TODO Auto-generated method stub
		System.out.println("Whale eat - aquatic animal");
	}
	
}
public class InterfaceTest {
	public static void main(String[] args) {
		Animal lion=new Lion1();
		lion.habitat();
		lion.food();
		
		Animal whale=new Whale();
		whale.habitat();
		whale.food();
	}
}
