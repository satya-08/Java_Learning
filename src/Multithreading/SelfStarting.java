package Multithreading;
class MyThread extends Thread{
	MyThread(){
		start();
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Mythread: "+(i+1));
		}
	}
}
public class SelfStarting {
	public static void main(String[] args) {
		MyThread t1=new MyThread();
//		t1.start();
	}

}
