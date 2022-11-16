package Exception;

import java.util.Scanner;

public class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String str) {
		super(str);
	}
	public static void main(String[] args) throws InvalidAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter age");
		int age = sc.nextInt();
		validate(age);
	}
	static void validate(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("not elgible for vote");
		}else {
			System.out.println("welcome to the voting");
		}
	}
}

