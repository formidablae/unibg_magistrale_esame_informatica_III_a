package visitor_car;

public interface Visitable {

	<T> T accept(Visitor<T> v);
	
}
