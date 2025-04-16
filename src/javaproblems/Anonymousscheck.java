package javaproblems;

public class Anonymousscheck {

	public static void main(String[] args) {
		Table obj=new Table();
		 Thread t1=new Thread() {
			public void run() { 
				obj.increment(10);
			}
		};
Thread t2=new Thread() {
			public void run() {
				obj.increment(12);
			}
		};
t1.start();
t2.start();

	}

}
