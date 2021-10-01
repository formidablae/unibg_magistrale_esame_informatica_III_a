package useeval;
public class NumberLiteral extends Espressione {

	int value;

	NumberLiteral(int v) {
		value = v;
	}

	@Override
	int value() {
		return value;
	}

}
