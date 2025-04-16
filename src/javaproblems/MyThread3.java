package javaproblems;

public class MyThread3 extends Thread {
	public void run() {
		Table.increment(30);
	}
}
