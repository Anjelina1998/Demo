package javaproblems;

import java.util.Scanner;

public class Checkeven {
	public static void main(String args[] ){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int x=sc.nextInt();
		System.out.println("enter a number");
		int y=sc.nextInt();
		if(x>y) {
			System.out.println(x+"is greatest");
		}
		else if(x<y) {
			System.out.println(y+"is greatest");
		}
		else {
			System.out.println("both are equal");
		}
		
	}

}
