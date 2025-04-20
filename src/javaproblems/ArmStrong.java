package javaproblems;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num");
		int org = sc.nextInt();
		int duplicate=org;
		int count =0;
		int re;
		while(org>0) {
			org=org/10;
			count++;
			}
		System.out.println("count");
		org=duplicate;
		int sum=0;
		while(org>0) {
			re=org%10;
			System.out.println("reminder is " + re);
			int prod=1;
			for(int i=1;i<=count;i++){
			prod=prod*re;
			System.out.println("product is "+prod);
			}
			sum=sum+prod;
			org=org/10;
			
		}
if(sum==duplicate) {
	System.out.println("arm strong number");
}else {
	System.out.println("not an arm strong number");
}
	}

}
