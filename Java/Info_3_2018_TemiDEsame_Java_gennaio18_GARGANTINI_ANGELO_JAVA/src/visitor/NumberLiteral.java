package visitor;
public class NumberLiteral extends Espressione {

	int value;

	NumberLiteral(int v) {
		value = v;
	}

	@Override
	public int accept(Visitor v) {
		return v.visit(this);
	}

}
