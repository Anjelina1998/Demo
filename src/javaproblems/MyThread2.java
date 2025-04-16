package javaproblems;

public class MyThread2 extends Thread {
	public void run() {
		Table.increment(20);
	}
}
