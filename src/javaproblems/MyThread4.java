package javaproblems;

public class MyThread4 extends Thread {
	public void run() {
		Table.increment(40);
	}
}
