
public class Per extends Espressione{
	
	Espressione op1, op2;

	@Override
	public void accept(Visitor v) {
		v.visitPer(this);
	}

}
