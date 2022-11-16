package java8;
@FunctionalInterface
interface CalculatorInterface<A,B>{
	A sumMethod(B val1, B val2);
}
class MyInteger{
	static int sum(Integer i1, Integer i2) {
		return (i1+i2);
	}
}
public class CalculatorSum_LambdaEx {
	public static void main(String[] args) {
		System.out.println("1 - Find sum of two numbers using > reference to static method ");
        System.out.println("2 - Here MyInteger::sum is a reference to " + "> static method sum" + "> of class MyInteger");
        CalculatorInterface<Integer, Integer> sum=MyInteger::sum;
        
        Integer sumResult = sum.sumMethod(2, 3);
        System.out.println("Sum Result = "+sumResult);
	}
}
