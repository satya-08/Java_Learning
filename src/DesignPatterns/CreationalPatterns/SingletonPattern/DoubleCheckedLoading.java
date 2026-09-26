package DesignPatterns.CreationalPatterns.SingletonPattern;

public class DoubleCheckedLoading {
	private static DoubleCheckedLoading lazyloading;
	
	public DoubleCheckedLoading() {}
	public static DoubleCheckedLoading getInstance() {
		if(lazyloading==null) {// without lock
			synchronized (DoubleCheckedLoading.class) {
				if(lazyloading==null) {
					lazyloading=new DoubleCheckedLoading();
				}
			}
		}
		return lazyloading;
	}

}
