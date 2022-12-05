package Exceptions;

public class ThrowKeyword {

	static void checkAge(int age) {
		if (age < 10) {
			throw new ArithmeticException("Access denied - You must be at least 10 years old.");
		} else {
			System.out.println("Access granted - You are old enough!");
		}
	}

	public static void main(String[] args) {
		checkAge(9); 
	}
}