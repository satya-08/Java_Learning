package Multithreading;

public class ThreadPriority {
	public static void main(String[] args) {
		Thread t1=new Thread(()->{
			System.out.println("Thread-1");
		});
		System.out.println(t1.getPriority());
		t1.setPriority(10);
		// 1- Low Priority
		// 5- Normal Priority(By default)
		// 10- Max Priority
		System.out.println(t1.getPriority());
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getPriority());
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		t1.setPriority(Thread.NORM_PRIORITY);
		System.out.println(t1.getPriority());
		
		
	}

}
