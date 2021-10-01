class D {
}

class E implements Comparable<E> {

	@Override
	public int compareTo(E o) {
		return 0;
	}
}

class F extends E{}

//public class ListaOrdinata<Q extends Comparable<Q>> {
public class ListaOrdinata<Q extends Comparable<? super Q>> {

	void add(Q e) {
		Q i = null;
		// ...
		i.compareTo(e);
	}

	public static void main(String[] args) {
		ListaOrdinata<String> ls = new ListaOrdinata<String>();
		ListaOrdinata<D> la;
		ListaOrdinata<E> lb;
		F f1,f2;
		f1.compareTo(f2);
		ListaOrdinata<F> lf;

	}
}
