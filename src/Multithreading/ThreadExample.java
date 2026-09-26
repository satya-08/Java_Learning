package Multithreading;

class Mythread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runing Thread");
	}
	
}
public class ThreadExample {
public static void main(String[] args) {
	Mythread task=new Mythread();
	Thread th=new Thread(task);
	th.start();
}
}
