package javaproblems;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enetr a num");
		int a=sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("sunday");
		case 2:
			System.out.println("monday");
		case 3:
			System.out.println("tuesday");
		case 4:
			System.out.println("wednesday");
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
		case 7:
			System.out.println("saturday");
		default:
			System.out.println("invalid input");
		}

	}

}
