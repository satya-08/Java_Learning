package Multithreading;
class StoppableRunnable implements Runnable{

	private boolean stopRequest=false;
	public synchronized void requestStop() {
		this.stopRequest=true;
	}
	
	public synchronized boolean isStopRequest() {
		return this.stopRequest;
	}
	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		System.out.println("StoppableRunnable Running");
		while(!isStopRequest()) {
			sleep(2000);
			System.out.println("Running...");
		}
		System.out.println("StoppableRunnable Stopped");	
	}
}
public class StoppableThread{
	public static void main(String[] args) {
		StoppableRunnable st=new StoppableRunnable();
		Thread thread=new Thread(st,"My Thread");
		thread.start();
		try {
			Thread.sleep(6000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Request Stop");
		st.requestStop();
		System.out.println("Request Stopped");
	}
}
