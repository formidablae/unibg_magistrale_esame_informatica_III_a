class A{}
class B extends A{}
public class GenericsCov {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A[] aa = new B[10];
		aa[0] = new A();

	}

}
