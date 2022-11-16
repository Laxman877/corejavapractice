package collection;

class Employee{
	String id;
	String name;
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==null)
			return false;
		
		if(this.getClass()!=obj.getClass())
			return false;
		
		Employee emp=(Employee) obj;
		return(emp.id==this.id || emp.id.equals(this.id)) && (emp.name==this.name || emp.name.equals(this.name));
	}
	
}
public class HashMapTest {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.equals(emp);
	}
}
