
public class Piu extends Espressione{
	
	public Piu(Numero tre, Numero due) {
		op1 = tre;
		op2 = due;
	}

	Espressione op1, op2;

	@Override
	public void accept(Visitor v) {
		v.visitPiu(this);
	}


}
