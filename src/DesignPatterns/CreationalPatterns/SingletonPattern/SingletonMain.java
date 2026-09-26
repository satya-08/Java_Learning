package DesignPatterns.CreationalPatterns.SingletonPattern;

public class SingletonMain {
	public static void main(String[] args) {
		
		// Eager Loading 
			EagerLoading eagerinstance1=EagerLoading.getinstance();
			EagerLoading eagerinstance2=EagerLoading.getinstance();
			System.out.println(eagerinstance1==eagerinstance2);
			System.out.println(eagerinstance1);
			System.out.println(eagerinstance2);
			
			// Lazy Loading 
			LazyLoading lazyinstance1=LazyLoading.getInstance();
			LazyLoading lazyinstance2=LazyLoading.getInstance();
			System.out.println(lazyinstance1==lazyinstance2);
			System.out.println(lazyinstance1);
			System.out.println(lazyinstance2);
			
			// SynchronizedLazyLoading
			SynchronizedLazyLoading instance1=SynchronizedLazyLoading.getInstance();
			SynchronizedLazyLoading instance2=SynchronizedLazyLoading.getInstance();
			System.out.println(instance1);
			System.out.println(instance2);
			System.out.println(instance1==instance2);
			
			// Double checked Loading
			DoubleCheckedLoading doublecheckedinstance1=DoubleCheckedLoading.getInstance();
			DoubleCheckedLoading doublecheckedinstance2=DoubleCheckedLoading.getInstance();
			System.out.println(doublecheckedinstance1==doublecheckedinstance2);
			System.out.println(doublecheckedinstance1);
			System.out.println(doublecheckedinstance2);
			
			//StaticNestedInnerClass
			StaticNestedInnerClass StaticNestedInnerClassinstace1=new StaticNestedInnerClass();
			StaticNestedInnerClass StaticNestedInnerClassinstance2=new StaticNestedInnerClass();
			System.out.println(StaticNestedInnerClassinstace1);
			System.out.println(StaticNestedInnerClassinstance2);
			
		}
	}

