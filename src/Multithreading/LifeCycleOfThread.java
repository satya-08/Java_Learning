package Multithreading;

public class LifeCycleOfThread {
	public static void main(String[] args) throws InterruptedException {
		
		// 1. NEW state
		Thread mythread=new Thread(()->{
			System.out.println("Hello");
		});
		System.out.println(mythread.getState());
		
		 // Start
        mythread.start();

        // Give it a moment to enter sleep
        Thread.sleep(100);

        // 2. TIMED_WAITING
        System.out.println(mythread.getState());

        // Wait until thread finishes
        mythread.join();

        // 3. TERMINATED
        System.out.println(mythread.getState());
	}

}
