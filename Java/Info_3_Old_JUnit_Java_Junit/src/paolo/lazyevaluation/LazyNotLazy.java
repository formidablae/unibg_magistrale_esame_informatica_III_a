package paolo.lazyevaluation;

public class LazyNotLazy {

	public static boolean lazyMethod(int a, int b, int c) {
		return (a > b & b > c)? true : false;
	}

	public static boolean notLazyMethod(int a, int b, int c) {
		return (a > b & b > c)? true : false;
	}
}