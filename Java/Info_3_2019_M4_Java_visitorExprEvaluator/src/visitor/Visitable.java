package visitor;

public interface Visitable{

	<T> T accept(Visitor<T> v);
}
