package Multithreading;
class Counter{
	int counter=0;
	void incremet() {
		counter++;
	}
}
public class SyncDemo {
	public static void main(String[] args) throws InterruptedException {
		Counter c=new Counter();
		Thread t1=new Thread(()->{
			for(int i=0;i<1000;i++) {
				c.incremet();
			}
		});
		
		Thread t2=new Thread(()->{
			for(int i=0;i<1000;i++) {
				c.incremet();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c.counter);
		
		
		
	}

}
