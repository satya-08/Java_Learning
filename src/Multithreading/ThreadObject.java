package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadObject {
	public static void main(String[] args) {
		
		Thread t1=new Thread();
		// The above line is only creation of an thread
		// Not execcuting
		
		t1.start();
		// This above line declares the running of a task(printing of numbers)
		
		Runnable task=()->{ 
			System.out.println("Thread is running");
		};
		
		Thread t2=new Thread(task);
		t2.start();
		
		//Two basic strategies
//		Strategy 1 — Direct Thread management
//
//		You create and manage Thread objects yourself.
		
		Thread th1=new Thread(()->{
			System.out.println("Task1");
		});
		
		Thread th2=new Thread(()->{
			System.out.println("Task2");
		});
		
		th1.start();
		th2.start();
		
//		Strategy 2 — Executor
//
//		Pass the application's tasks to an executor.
		
		ExecutorService executor=Executors.newFixedThreadPool(2);
		executor.submit(()->{
			System.out.println("Task1");
		});
		
		executor.submit(()->{
			System.out.println("Task2");
		});
		
		executor.shutdown();
		
	}

}
