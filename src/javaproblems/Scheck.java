package javaproblems;

public class Scheck {

	public static void main(String[] args) {
	
		Thread t1= new Thread() {
			public void run() {
				Table.increment(12);
			}
		};
Thread t2= new Thread() {
	public void run() {
		Table.increment(13);
	}
			
		};
Thread t3= new Thread() {
	public void run() {
		Table.increment(14);
	}
			
		};
Thread t4= new Thread() {
	public void run() {
		Table.increment(15);
	}
			
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
