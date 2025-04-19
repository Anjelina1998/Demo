package javaproblems;

import java.util.Scanner;

public class Strongnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num");
		int intialNumber = sc.nextInt();
		int num = intialNumber;
		int prod = 1;
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			for (int i = digit; i >= 1; i--) {
				prod = prod * i;
			}
			sum = sum + prod;
			num = num / 10;
			prod = 1;

		}
		if (sum == intialNumber) {
			System.out.println("strong number");
		} else {
			System.out.println("weak number");
		}

	}

}
