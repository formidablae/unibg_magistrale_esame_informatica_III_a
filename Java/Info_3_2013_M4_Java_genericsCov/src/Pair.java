import java.util.List;

class PairO {

	Object left;

}



public class Pair<E, F> {
	
	E left;
	F right;

	Pair(E e, F f) {
		left = e;
		right = f;
	}

	F getRight() {
		return right;
	}

	public static void main(String[] args) {
		Pair<Studente, Integer> io = new Pair<Studente, Integer>(
				new Studente(), new Integer(30));

		System.out.println(io.getRight());
		List l;
	}
}

class Studente {
}