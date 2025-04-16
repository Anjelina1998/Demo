package javaproblems;

public class Swapvariable {

	public static void main(String[] args) {
    int a=2;
    int b=3;
    swapValue(a,b);
	}

	private static void swapValue(int a, int b) {
   //logic
//		int c=a;
//		a=b;
//		b=c;
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("a: "+a+" ,b: "+b);		
	}

}
