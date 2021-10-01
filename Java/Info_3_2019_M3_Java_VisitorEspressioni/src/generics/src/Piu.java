package generics.src;

public class Piu extends Espressione{
	
	public Piu(Numero tre, Numero due) {
		op1 = tre;
		op2 = due;
	}

	Espressione op1, op2;

	@Override
	public <T> T accept(Visitor<T> v) {
		return v.visitPiu(this);
	}


}
