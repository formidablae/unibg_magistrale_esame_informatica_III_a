package generics.src;

// expressione generica
public abstract class Espressione implements Visitable {

	public abstract <T> T accept(Visitor<T> v);
	
}
