package oops;

final class MyTech{
	private final Integer x;
	private final Integer y;
	public MyTech(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}
	
}
//private->default->protected->public
//we cannot override static with non static and non static with static 
//but we can apply static with static it is method hidding
public class Test {
	
}
