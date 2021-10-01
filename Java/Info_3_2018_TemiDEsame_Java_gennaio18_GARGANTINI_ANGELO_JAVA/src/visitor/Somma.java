package visitor;

public class Somma extends Espressione {

	Espressione o1,o2;
	
	Somma(Espressione f1, Espressione f2){
		o1 = f1;
		o2 = f2;
	}
	
	@Override
	public int accept(Visitor v) {
		return v.visit(this);
	}

	
}
