package pattern_12_11_19;
class A{
	private A() {System.out.println("creo A");}
	static public A instance = new A();
}
// creato solo quando serve la prima volta
class B{
	private B() {System.out.println("creo B");}
	// creato solo quando chiamo questo
	static public B getInstance() {
		if (instance == null) instance = new B();
		return instance;
	}
	private static B instance = null;
}


public class SingletonUse {
	public static void main(String[] args) {
		System.out.println("start");
		A a = A.instance;
		B b = B.getInstance();
	}

}
