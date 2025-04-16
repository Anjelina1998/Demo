package javaproblems;

public class MyThread1 extends Thread {
	

	public void run() {
		Table.increment(10);
	}

}
