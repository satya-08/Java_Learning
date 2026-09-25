package Multithreading;

import java.util.concurrent.TimeUnit;

public class JoinMethod {
	public static void main(String[] args) throws InterruptedException {
		
		Runnable task=()->{
			System.out.println("Work started");
			for(int i=0;i<5;i++) {
				System.out.println(Thread.currentThread().getName());
			}
			try {
				if(Thread.currentThread().getName()=="Worker-1")
				TimeUnit.SECONDS.sleep(10);
			}catch(Exception e) {
				Thread.currentThread().interrupt();
			}
			System.out.println("Work finished");
		};
		Thread t1=new Thread(task,"Worker-1");
		Thread t2=new Thread(task,"Worker-2");
		t1.start();
		t2.start();
		t2.join(2000);
		t1.join();
		System.out.println("Main continued");
	}

}
