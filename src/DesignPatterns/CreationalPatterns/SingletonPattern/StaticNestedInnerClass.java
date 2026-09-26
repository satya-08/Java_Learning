package DesignPatterns.CreationalPatterns.SingletonPattern;

public class StaticNestedInnerClass {
	public StaticNestedInnerClass() {}
	private static class InnerClass{
		private static final StaticNestedInnerClass instance=new StaticNestedInnerClass();
	}
	
	public static StaticNestedInnerClass getInstance() {
		return InnerClass.instance;
	}

}
