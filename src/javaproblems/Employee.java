package javaproblems;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Employee {

	public static void main(String[] args) {
		
		ExecutorService worker=Executors.newFixedThreadPool(3);
		for(int i=0;i<=5;i++) {
			Runnable r= new Company(""+i);
			worker.execute(r);
		}
		
		

	}

}
