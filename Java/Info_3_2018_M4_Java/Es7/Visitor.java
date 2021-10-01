
public interface Visitor<T> {
	T visit(ComponenteComposto c);
	T visit(Atomico c);
}
