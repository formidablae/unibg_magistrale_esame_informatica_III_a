
public class Ruota extends Part{

	@Override
	public <T> T accept(Visitor<T> v) {
		return v.visit(this);		
	}

}
