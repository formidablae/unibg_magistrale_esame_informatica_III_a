package generics.src;
public class Numero extends Espressione {

	int valore;
	Numero(int n) {
		valore = n;
	}

	@Override
	public <T> T accept(Visitor<T> v) {
		return v.visitNum(this);
	}
	
}
