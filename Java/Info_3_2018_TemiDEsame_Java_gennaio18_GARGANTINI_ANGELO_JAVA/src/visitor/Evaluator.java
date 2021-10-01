package visitor;

public class Evaluator implements Visitor {

	@Override
	public int visit(NumberLiteral nl) {
		return nl.value;
	}

	@Override
	public int visit(Prodotto nl) {
		return nl.o1.accept(this) * nl.o2.accept(this);
	}

	@Override
	public int visit(Somma nl) {
		return nl.o1.accept(this) + nl.o2.accept(this);
	}

}
