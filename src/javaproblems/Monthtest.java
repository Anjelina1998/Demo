package javaproblems;

import java.util.Scanner;

public class Monthtest {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a year");
	int b=sc.nextInt();
	System.out.println("enter a month");
	int a=sc.nextInt();
	
	switch(a) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		System.out.println("31 days");
		break;
	case 4:
	case 6:
	case 9:
	case 11:
		System.out.println("30 days");
	case 2:
		if((b%400==0)||(b%4==0&& b%100!=0)){
			System.out.println("29 days");
		}
		else {
			System.out.println("28 days");
		}
	
	}

	}

}
