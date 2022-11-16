package practice_logic_check;


class Employee{
	public Employee method() {
		return this;
	}
}
public class PolymorphismCheck {
	public static void main(String[] args) {
		Employee employee=new Employee();
		
		System.out.println("main class calling..");
	}
}
