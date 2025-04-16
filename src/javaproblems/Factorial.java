package javaproblems;

public class Factorial {

	public static void factorial(int a) {
		int b = 1;
		for (int i = a; i >= 1; i--) {
			b = b * i;
		}
		System.out.println("factorial of  " + a + " is " + b);
	}

	public static void main(String[] args) {
		factorial(5);
	}

}
