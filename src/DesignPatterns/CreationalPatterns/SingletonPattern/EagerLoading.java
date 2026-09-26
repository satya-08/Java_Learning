package DesignPatterns.CreationalPatterns.SingletonPattern;

public class EagerLoading {
	private static final EagerLoading eagerinstance=new EagerLoading();
	public EagerLoading() {
	}
	
	public static EagerLoading getinstance() {
		return eagerinstance;
	}
}

