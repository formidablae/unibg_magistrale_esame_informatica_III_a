package visitor;

public class Prodotto extends Espressione {
	
	Espressione o1,o2;
	
	Prodotto(Espressione f1, Espressione f2){
		o1 = f1;
		o2 = f2;
	}
	@Override
	public int accept(Visitor v) {
		return v.visit(this);
	}
	

}
