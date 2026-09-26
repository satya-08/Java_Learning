package DesignPatterns.CreationalPatterns.SingletonPattern;

public class SynchronizedLazyLoading {
private static SynchronizedLazyLoading instance;
	public static synchronized SynchronizedLazyLoading getInstance() {
		if(instance==null) {
			instance=new SynchronizedLazyLoading();
		}
		return instance;
	}
}
