package visitor_car;

public interface Visitor<T> {

	T visit(Ruota r);
	T visit(Car r);
	T visit(Motore r);
	T visit(Carrozzeria r);
	
	
}
