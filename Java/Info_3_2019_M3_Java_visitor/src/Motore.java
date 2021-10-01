
public class Motore extends Part {

	@Override
	public <T> T accept(Visitor<T> v) {
		return v.visit(this);		
	}

}
