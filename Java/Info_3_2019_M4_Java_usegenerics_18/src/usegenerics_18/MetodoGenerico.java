package usegenerics_18;

import java.util.Iterator;
import java.util.List;

public class MetodoGenerico {

	static <T> void foo(T t) {
		System.out.println(t.getClass());
	}
	
	/** un metodo che resituisce il terzo elemento di una lista
	 * 
	 * @param args
	 */
	static <T> T terzo(List<T> l) {
		return l.get(2);
	}
	/** il massimo in una lista*/
	static <T extends Comparable<? super T>> T max(List<T> l) {
		T m = l.get(0);
		for (int i = 1; i < l.size(); i++) {
			if (l.get(i).compareTo(m) > 0)
				m = l.get(i);
		}
		return m;
	}
	
	
	<X extends Number> void jjj(X a) {
		a.intValue()
	}
	
	
	public static void main(String[] args) {
		
		MetodoGenerico.foo("hhh");

		MetodoGenerico.foo(1);

	}
	
}
