package Multithreading;

public class RunnableMethod {

	public static void main(String[] args) {
		Mytask th=new Mytask();
		Thread t1=new Thread(th,"Worker-1");
		
		t1.start();
		System.out.println(Thread.currentThread().getName());
		Thread t2=new Thread(()->{
			System.out.println(Thread.currentThread().getName());
		});
		t2.start();
		Thread t3=new Thread(()->{
			System.out.println(Thread.currentThread().getName());
		});
		t3.start();
		Thread t4=new Thread(()->{
			System.out.println(Thread.currentThread().getName());
		});
		t4.start();
		//  Oly one time we can run a thraed
//		t2.start();
		
		
	}

}
class Mytask implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Rnning the runnable run method: "+Thread.currentThread().getName());
	}
}
