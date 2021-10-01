package generics.src;

public interface Visitable {
	
	<T> T accept(Visitor<T> v);

}
