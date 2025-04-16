package javaproblems;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("enter a year that should be didvisibe by 100");
int a=sc.nextInt();
if(a>=500) {
	System.out.println("500 *" +a/500);
	a=a%500;
}if(a>=200) {
	System.out.println("200 *"+a/200);
	a=a/200;
}if(a>100) {
	System.out.println("100 *"+a/100);
}

	}

}
