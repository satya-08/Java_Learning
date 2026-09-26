package DesignPatterns.CreationalPatterns.SingletonPattern;

public class LazyLoading {
	private static LazyLoading instance;
	
	public static LazyLoading getInstance() {
		if(instance==null) {
			instance=new LazyLoading();
		}
		return instance;
	}

}
