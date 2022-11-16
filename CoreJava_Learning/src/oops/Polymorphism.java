package oops;
class Animal2{
	
}
class Monkey extends Animal2{
	
}
class Test2 {
	
	public void m1(Animal2 a) {
		System.out.println("Animal method");
	}
	public void m1(Monkey m) {
		System.out.println("Monkey method");
	}
	
}

public class Polymorphism {
	//compile time polymorphism or static polymorpihism or early binding(method overloading) method in same class same name with different signature(different parameter or different parameter name)
	
	//runtime polymorphism(method overriding) or dynamic poltmorphism or late binding method name is same name with parent class method name with same signature
	public static void main(String[] args) {
		//System.out.println("This is main");
		Test2 t = new Test2();
		Animal2 a=new Animal2();
		t.m1(a);
		Monkey m= new Monkey();
		t.m1(m);
		Animal2 a1=new Monkey();
		t.m1(a1);
		
	}
}
