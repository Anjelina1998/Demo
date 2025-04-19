package javaproblems;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num");
		int n = sc.nextInt();
		int m = n;
		int square = n * n;
		System.out.println("square is: " + square);
		int length = 0;
		int x = 1;
		while (n > 0) {

			n = n / 10;
			length++;

		}
		System.out.println(length);

//		for (int i = 1; i <= length; i++) {
//			x = x * 10;
//
//		}
		x=(int) Math.pow(10, length);
		int result = square % (x);
		System.out.println(result);
		if (m == result) {
			System.out.println("automorphic number");
		} else {
			System.out.println("not an automorphic number");
		}

	}
	}


