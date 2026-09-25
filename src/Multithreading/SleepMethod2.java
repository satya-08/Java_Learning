package Multithreading;

import java.util.concurrent.TimeUnit;

public class SleepMethod2 {
	public static void main(String[] args) {
		Runnable task=()->{
			for(int i=0;i<5;i++) {
				System.out.println(Thread.currentThread().getName()+": "+i);
			}
			
		try {
//			if(Thread.currentThread().getName()=="Worker-1")
////			Thread.sleep(10000);
			
			TimeUnit.SECONDS.sleep(5);
				
				
		}catch(Exception e) {
			Thread.currentThread().interrupt();
		}
		};
		
		Thread t1=new Thread(task,"Worker-1");
		Thread t2=new Thread(task,"Worker-2");
		t1.start();
		t2.start();
	}

}
