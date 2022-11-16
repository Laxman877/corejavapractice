package oops;
class Employee{
	Integer name;
	private int id;
	
	public String getName() {
		return String.valueOf(name);
	}

	public void setName(String name) {
		this.name = Integer.parseInt(name);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
public class EncapsulationTest {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(12);;
		emp.setName("laxman");
		System.out.println("Employee id : "+emp.getId()+" Employee name : "+emp.getName());
		
	}
}
