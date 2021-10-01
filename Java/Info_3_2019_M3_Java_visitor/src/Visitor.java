
public interface Visitor <T>{
	
	
	T visit(Motore m);
	
	T visit(Ruota r);
	
	T visit(Body b);
	

}
