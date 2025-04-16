package javaproblems;

public class Company implements Runnable{

	String taskname;
	 public Company(String s) {
		 this.taskname=s;
		 
	 }
	public void run() {
	System.out.println(Thread.currentThread().getName()+" "+taskname);
		 
	}

}
