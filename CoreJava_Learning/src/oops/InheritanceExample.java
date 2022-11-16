package oops;
public class InheritanceExample {
	static int x=332;
	int y=20;
	
	public static void main(String[] args) {
		InheritanceExample in=new InheritanceExample();
		in.x=10;
		in.y=30;
		System.out.println(x+" "+in.y);
		InheritanceExample in1=new InheritanceExample();
		in1.x=40;
		in1.y=60;
		System.out.println(x+" "+in1.y);
	}
}
