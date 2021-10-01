public class Numero extends Espressione {

	int valore;
	Numero(int n) {
		valore = n;
	}

	@Override
	public void accept(Visitor v) {
		v.visitNum(this);
	}
	
}
