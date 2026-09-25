package Multithreading;

public class SleepMethod{
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Before sleeping");
		
		Thread.sleep(4000);
		
		System.out.println("After sleeping");
		
		Thread t1=new Thread(()->{
			System.out.println("Work  started");
			try {
				Thread.sleep(5000);
			}catch(Exception e) {
				Thread.currentThread().interrupt();
			}
			System.out.println("Worker finished");
		});
		
		t1.start();
		System.out.println("Main continued");
		
	}

}
