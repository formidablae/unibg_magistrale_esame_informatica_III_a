package generics.src;

public class Per extends Espressione{
	
	Espressione op1, op2;

	@Override
	public<T> T accept(Visitor<T> v) {
		return v.visitPer(this);
	}

}
