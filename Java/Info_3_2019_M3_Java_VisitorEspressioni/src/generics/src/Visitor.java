package generics.src;

public interface Visitor<T> {
	
	T visitNum(Numero n);
	
	T visitPiu(Piu p);
	
	T visitPer(Per p);
	
}
