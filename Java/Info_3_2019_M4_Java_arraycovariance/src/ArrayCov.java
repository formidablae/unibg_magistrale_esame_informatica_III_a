import java.util.ArrayList;
import java.util.List;

class A {
}

class B extends A {
}

public class ArrayCov {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<A> aa = new ArrayList<A>();

		List<? extends A> aa2 = new ArrayList<B>();
		aa2.add(new B());

	}

}
